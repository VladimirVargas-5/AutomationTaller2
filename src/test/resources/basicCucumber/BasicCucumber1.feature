Feature: Whatsapp

  @Regression @SmokeTest
  Scenario:  COMO administrador
  QUIERO enviar y recibir videos grabados
  PARA QUE los usuario tengan una mejor

    Given yo tengo una cuenta en whatsapp
    When yo grabo un video en 180 p
    And yo edito el video
    Then yo envio el video a otro "Administrador"
    And el usuario deberia de reproducir el video
