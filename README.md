# From Zero
Get some knowledge about ZIO. https://zio.dev/guides/quickstarts/restful-webservice

# Environment
```
Java: 1.8.0_191
Scala: 2.13.8
Sbt: 1.6.2
```

# How to run
```
> sbt run

// Test example
POST http://localhost:8080/users -d '{"name": "John", "age": 30}'
GET  http://localhost:8080/users
GET  http://localhost:8080/users/:id
```
