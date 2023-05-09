#Athor:Miguel Rubide

Feature: Como usuario ingreso a la pagina de mercado libre busco un producto,
  le doy click para agregar al carrito y crea una cuenta en la aplicacion

  Scenario Outline: Busqueda de producto lo agrega al carrito y crea cuenta en el sistema
    Given miguel ingresa a web de mercado libre
    And Busca un producto y da clik en agregar al carrito
      | <producto> |
    When Crea una cuenta con su respectiva validacion de datos
      | <email> | <nombres> | <apellidos> | <telefono> |
    Then miguel debera ver que que la validacion de su telefono fue enviada
    Examples:
      | producto        | email               | nombres     | apellidos      | telefono   |
      | Portatil Lenovo | miemail12@gmail.com | Juan Felipe | Valencia Julio | 3207854563 |


