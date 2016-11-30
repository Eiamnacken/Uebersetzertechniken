defmodule Grammar do



    def main(args) do
        table=:ets.new(:buckets_registry,[:set,:named_table])
        IO.inspect table
        parse_input
    end
    



    defp parse_input do
         string =IO.gets "Bitte gib einen String ein\n"
         IO.inspect string
         String.codepoints(string) |> parse
    end
    '''
    Letzte ausgabe alle eingaben wurden in tokens verwandelt
    '''
    defp put([]) do
      IO.inspect :ets.lookup(:buckets_registry,1)
      [{1,data}] = :ets.lookup(:buckets_registry,1)
      lex(data)
    end
    

    
    defp put([tokentype],list) do
        data = :ets.lookup(:buckets_registry,1)
        case data do
          [] -> newlist = [tokentype]
          [data] -> {1,buffer} = data
          newlist=buffer++[tokentype]
        end
        :ets.insert(:buckets_registry,{1,newlist})
        parse list
    end
    
    defp parse([]) do
      put([])
    end
    
    defp parse([' '|tail]) do
      parse(tail)
    end
    
    
   defp parse(["/"|tail]) do

     put([tokenType: 'divide'],tail)
   end

   defp parse(["*"|tail]) do
        put([tokenType: 'mul'],tail)
   end
   
   defp parse(["+"|tail]) do
     put([tokenType: 'add'],tail)
   end
   
   defp parse(["-"|tail]) do
     put([tokenType: 'sub'],tail)
   end
   
   defp parse(["("|tail]) do
    put([tokenType: 'lbrace'],tail)
   end

   defp parse([")"|tail]) do
        put([tokenType: 'rbrace'],tail)
   end

   defp parse(["\n"|tail]) do
     put([tokenType: 'nl'],tail)
   end
   '''
    parset zahlen und schmeißt diese auf den stack
   '''
   defp parse([a|tail])  do
     case Integer.parse(a) do
       {integer,binary} -> put([tokenType: 'int'],tail)
       :error -> put([tokenType: 'invalid'],tail)
       _ -> put([tokenType: 'invalid'],tail)
     end
   end


    defp lex([]) do
         IO.puts "Finish"
    end


   defp lex([head|tail]) do
     lex(head,tail)
   end


   defp lex({:tokenType, 'nl'},list) do
        case list do
          [[tokenType: 'invalid']|[]] -> lex([])
          [] -> lex([])
          [head|tail]-> lex(head,tail)
        end
   end
   
   defp lex({:tokenType, 'invalid'},list) do
     case list do
       [] -> lex([])
       [[_]|tail]-> IO.puts "Invalid Character"
     end
   end
    
   defp lex({:tokenType, 'int'},list) do
     case list do
       [[tokenType: 'invalid']|list] -> IO.puts "Ausdruck oder Integer erwartet #{List.first(list)} bekommen"
       _ -> lex(list)
     end
   end

   defp lex({:tokenType, 'lbrace'},list) do
    if(Enum.member?(list,{:tokenType,'rbrace'})) do
      lex('ausdruck',list)
    end
    IO.puts "Fehlendes rbrace"
   end

   defp lex({:tokenType, 'rbrace'},list) do
    lex(list)
   end

    defp lex({:tokenType,_},list) do
      lex('ausdruck',list)
    end
   
    '''
    Alle +-*/ asdrücke
    '''
   defp lex('ausdruck',list) do
     case list do
       [{:tokenType, 'add'}|tail] -> lex({:tokenType, 'add'},tail)
       [{:tokenType, 'sub'}|tail]-> lex({:tokenType, 'sub'},tail)
       [{:tokenType, 'int'}|tail] -> lex({:tokenType, 'int'},tail)
       []-> IO.puts "Integer erwartet nichts bekommen"
       _ -> [token|_] = list
       IO.puts "Integer oder Ausdruck erwartet  "
       IO.inspect token
       IO.puts "bekommen"
     end
   end
end
