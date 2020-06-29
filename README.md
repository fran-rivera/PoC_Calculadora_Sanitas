# Prueba Técnica Sanitas - Calculadora
#### Instrucciones para la generación del fichero JAR y ejecución del mismo

Al tratarse de un proyecto Maven se puede construir y ejecutar la aplicación usando la línea de comandos.
Se genera un único fichero JAR que contiene todas las dependencias, clases y recursos necesarios para su ejecución.

Para ejecutar la aplicación usamos el comando: `./mvnw spring-boot:run`

Para construir el fichero JAR utilizamos el comando: `./mvnw clean package` y una vez generado el fichero JAR, podemos ejecutar la aplicación con el siguiente comando: 
`java -jar target/calculadora-1.0.0.jar`
