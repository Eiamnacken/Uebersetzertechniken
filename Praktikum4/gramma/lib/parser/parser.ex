defmodule Parser.Parser do
  @moduledoc false



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