# API Authorizer 1.0

## Description

You can use this API for authorize you card

## API Documentation

#### Return a list of document metadata

```http
  You can check if the system was started!
  
  USE ->  http://localhost:8080/authorizer/health-check
```

  ```http
  You can use this to acess Swagger aplication, and see what you prefer!
  
  USE ->  http://localhost:8080/swagger-ui/index.html
  
```

#### Retorna um item

```http
  GET /api/items/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do item que você quer |

```http


## Getting Started

### Installing

* You must be installed in your SO, can be Windows or Linux.
* Install one IDE that you prefer.
* Spring Boot.
* JDK 8 or above.
* Maven CLI.
* Docker 
* Git

### Dependencies

* Must be configure your "aplication.properties" to use correctly port and host that you desire.

### Executing program in IDE

* Open IDE
* Configure your JDK
* Make sure maven is installed
* Make sure your Java be attached in your project 
* Right click project and run with spring boot application.

### Executing program in Server Side

* Install Tomcat 7 or above
* Make war of application
* Deploy
* Application started in http://localhost:8080

## Authors

* Luiz de Albuquerque

## Version History

* 0.1
    * Initial Release

## License
* Albuquerque Solutions 


