Feature: Busqueda en una pagina web
  yo como usuario de la pagina web quiero realizar consultas

  Scenario: Ingresar a la pagina Comics desde home

    Given  Un usuario que se encuentra en la pagina de inicio
    When hace clic sobre comic
    Then me debe mostrar la ventana comics