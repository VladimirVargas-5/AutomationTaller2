Feature: Whatsapp
#debe llevar outline para enviar varios datos
  Scenario Outline:  COMO administrador
  QUIERO enviar y recibir videos grabados
  PARA QUE los usuario tengan una mejor

    Given yo tengo una cuenta en <aplication>
    When yo grabo un video en <resolution> p
    And yo edito el video
    Then yo envio el video a otro "<user>"
    And el usuario deberia de reproducir el video

  #Este example es neceario para mandar estos valores
    Examples:
      |  aplication|resolution|user         |
      | face       |    180   | guest       |
      | telegram   | 250      |simpleuser   |
      | insta      | 1900     | contatoruser|