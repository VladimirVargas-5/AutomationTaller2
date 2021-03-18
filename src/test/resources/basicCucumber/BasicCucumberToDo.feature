Feature: Contact
  Scenario: como un usuario adminstrador
  quiero guardar una nota
  para almacenar mis actividades pendientes

  Scenario: Crear Nota

    Given yo tengo abierto mi aplicacion todo
    When yo hago click en el boton "add"
    And yo lleno la caja de texto titulo con el valor "Tomar agua"
    And yo lleno la caja de texto nota con el valor "JBGroup"
    And yo hago click en el boton "done"
    Then la nota "Tomar agua" deberia ser mostrado