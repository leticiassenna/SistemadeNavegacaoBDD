Feature: Verificar a cidade que mais se encaixa na localizacao informada

  Scenario Outline: Verificando localizacao das cidades
    Given Eu tenho um ponto cardial "<Ponto_Cardial>"
    When Eu recebo as cidades "<Cidade1>", "<Cidade2>", "<Cidade3>", "<Cidade4>"
    Then Eu tenho a cidade desejada "<Cidade_Desejada>"

    Examples: 
      | Ponto_Cardial | Cidade1  | Cidade2    | Cidade3   | Cidade4     | Cidade_Desejada |
      | Norte         | Dublin   | Belfast    | Edinburgh | Glasgow     | Edinburgh       |
      | Sul           | Dublin   | Belfast    | Edinburgh | Glasgow     | aqui            |
      | Oeste         | Aberdeen | Birmingham | Liverpool | Southampton | Liverpool       |
