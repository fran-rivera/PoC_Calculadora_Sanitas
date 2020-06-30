# Prueba Técnica Sanitas - Calculadora
#### Instrucciones para la generación del fichero JAR y ejecución del mismo

Al tratarse de un proyecto Maven se puede construir y ejecutar la aplicación usando la línea de comandos.
Se genera un único fichero JAR que contiene todas las dependencias, clases y recursos necesarios para su ejecución.

Puesto que el proyecto se ejecutará sobre una instalación de Maven limpia y se debe utilizar el API de traceo, previamente debemos instalar el fichero JAR con libreria externa, para ello ejecutar el siguiente comando:

`mvn install:install-file -Dfile=<PATH_FILE>\tracer-1.0.0.jar -DgroupId=io.corp.calculator -DartifactId=tracer -Dversion=1.0.0 -Dpackaging=jar`

Para ejecutar la aplicación usamos el comando: `./mvn spring-boot:run`

Para construir el fichero JAR utilizamos el comando: `./mvn clean package` y una vez generado el fichero JAR, podemos ejecutar la aplicación con el siguiente comando: 
`java -jar target/calculadora-1.0.0.jar`

Se puede acceder a la documentación del API en la siguiente url : `localhost:8080/api-rest-calculadora`