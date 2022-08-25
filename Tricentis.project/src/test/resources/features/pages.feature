#Author: your.email@your.domain.com

@tricentis
Feature: Cotacao no site da tricentis
  Eu  como usuario  quero acessar o site da tricentis para realizar a minha cotacao 
  
  Background:
Given que o usuario entre no site da tricentis "http://sampleapp.tricentis.com/"
  @auto @positivo
  Scenario: Cotacao automobile
    And que clico no menu "automobile"
    When preencho os dados do veiculo
    And preencho os dados do seguro
    And preencho os dados do produto
    And preencho os dados do preco
    And envio cotacao
    Then cotacao enviada com sucesso
    
     @truck @positivo
  Scenario: Cotacao Truck
    And que clico na opção desejada
    When preencho as todas as informacoes solicitadas
    And envio cotacao
    Then cotacao realizada
    
     @motor @positivo
  Scenario: Cotacao motorcycle
    And que clico na opção desejada
    When preencho as todas as informacoes solicitadas
    And envio cotacao
    Then cotacao enviada com sucesso
    
    @camper @positivo
  Scenario: Cotacao camper
    And que clico na opção desejada
    When preencho os dados do seguro
    And preencho os dados do preco
    And envio cotacao
    Then cotacao enviada com sucesso
    
