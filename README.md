# proyecto09

Cuando quieras probarlo para el de leer un registro:

curl 'http://localhost:8080/solicitud/5' 

Cuando quieras listar:

curl 'http://localhost:8080/solicitud'

Cuando quieras borrar

curl 'http://localhost:8080/solicitud/5' -X DELETE 

Para crear (sin id, puesto que con él daría un 500)

curl 'http://localhost:8080/solicitud' -X POST -H 'Content-type: application/json' --data-raw '{"nombre":"Juan","edad":28}'

Por último modificar:

curl 'http://localhost:8080/solicitud' -X PUT -H 'Content-type: application/json' --data-raw '{"id": 4, "nombre":"Juan","edad":28}'