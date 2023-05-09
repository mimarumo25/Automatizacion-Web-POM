### `Reto De Automatización De Pruebas Mercado Libre`

#### Descripción

Proyecto de Automatización de la plataforma Mercado Libre con JAVA, Serenity BDD y Gradle

#### Feature

```gherkin
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
```


#### Características del Proyecto

En la construcción del proyecto de automatizacion web en Mercado Libre se implementa:

- Patrón de diseño Page Object Model.
- Framework SerenityBDD.
- Gestor de paquetes Gradle.
- Desarrollado en java en su versión 11

#### Versionado

| Repository       | Version  |
|------------------|----------|
| Serenity         | 3.6.22   |
| SerenityCucumber | 3.6.22   |
| Slf4jSimple      | 2.0.7    |
| Junit            | 4.13.2   |

#### Precondiciones

- [x] 1: Instar Java en su versión 11.
- [x] 1.1: Configurar variable de entorno JAVA_HOME
- [x] 2: Instar Gradle en su versión 7.X
- [x] 2.1: Configurar variable de entorno GRADLE_HOME


#### Ejecución del proyecto

- Clonar el Repositorio a sus dispositivo local y inportar el proyecto en su IDE
  de preferencia ejemplo IntelliJ IDEA
- Desde la terminal en el directorio raíz del
proyecto:


- si no tienes gradle o la version 7.x correspondiente ejecuta el siguiente comando:

```sh
./gradlew clean test 
```

- si tienes gradle instalado y configurado puedes ejecutar el siguiente comando:

```sh
gradle clean test 
```

- Las evidencias de las ejecuciones de cada prueba se encuentran en siguiente Ruta 
com.co.hackathon.periferia/target
```sh
com.co.hackathon.periferia/target
```