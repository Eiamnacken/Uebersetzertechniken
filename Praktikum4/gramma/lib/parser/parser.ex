defmodule Parser.Parser do
  @moduledoc false

#Rekursiv den string duchrgehen um die tokens zu definieren

  def read do
    Enum.each IO.stream(:stdio,:line)|> getToken
  end
  defp getToken("/") do

  end

  defp getToken("*") do

  end

  defp getToken("-") do

  end

  defp getToken("+") do

  end
  
end