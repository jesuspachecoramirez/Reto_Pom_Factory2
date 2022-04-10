# new feature
# Tags: optional

Feature: Módulo Administrativo:
  Como usuario de la pagina orange
  necesito crear un PayGrade nuevo
  para utilizarlos en futuros calculos

  Background: Login de usuario
  Given El usuario hace login en la pagina inicial


  Scenario: Creacion de Paygradde
    Given El usuario ingresa a la opcion Pay grades de Job
    When El usuario crea un nuevo Pay grade y llena su currency
    Then Como resultado el cliente valida el nuevo pay grade en la pagina