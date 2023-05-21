# Projeto Compra de Livro com moeda estrageiras

## Tecnologias usadas
```

Java 16
Spring boot versão 2.7.11
HeidiSQL
MySQL
Swagger-ui
```

## todas as Urls
```

Eureka (Naming Server) --> http://localhost:8761/
API Gateway Swagger    --> http://localhost:8765/swagger-ui.html
API Gateway Cambio     --> http://localhost:8765/cambio-service/{amount}/{original_currency}/{to_currency}
API Gateway Book       --> http://localhost:8765/book-service/{amount}/{to_currency}
Cambio Microservice    --> http://localhost:8001/cambio-service/{amount}/{original_currency}/{to_currency}
Book Microservice      --> http://localhost:8100/book-service/{amount}/{to_currency}
```

### Swagger
```

http://localhost:8100/book-service/v3/api-docs
http://localhost:8765/v3/api-docs/cambio-service

http://localhost:8100/swagger-ui.html
http://localhost:8000/swagger-ui.html
```

##### valores Cambio e book
```

{amount} --> valor
{original_currency} --> moeda original( USD )
{to_currency} --> moedas ( EUR, GBP, ARS, CLP, COP, MXN )
