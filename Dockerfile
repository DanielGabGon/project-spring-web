# Usa la imagen oficial de WildFly
FROM quay.io/wildfly/wildfly:27.0.0.Final-jdk17 AS wildfly

# Establece el directorio de trabajo dentro del contenedor para WildFly
WORKDIR /opt/jboss/wildfly/standalone/deployments/

# Etapa de construcción: Usa openjdk para compilar la aplicación
FROM openjdk:17-jdk-slim AS builder

WORKDIR /app

# Copia los archivos necesarios para construir la aplicación (pom, maven wrapper, src)
COPY ./pom.xml /app
COPY ./.mvn /app/.mvn
COPY ./mvnw /app/
COPY ./src /app/src

# Ejecuta Maven para compilar la aplicación, omitiendo las pruebas
RUN ./mvnw clean package -Dmaven.test.skip -Dmaven.main.skip

# Etapa de ejecución: Usa WildFly como base
FROM quay.io/wildfly/wildfly:27.0.0.Final-jdk17

WORKDIR /opt/jboss/wildfly/standalone/deployments/

# Copia el archivo WAR generado por Maven en la etapa anterior
COPY --from=builder /app/target/project-spring-web.war /opt/jboss/wildfly/standalone/deployments/

# Exponer el puerto que usa WildFly
EXPOSE 8080

# Usa el comando por defecto para iniciar WildFly
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0"]

#mvn -N io.takari:maven:wrapper
#docker build -t prueba . -f .\Dockerfile
#docker run -p 8080:8080 prueba
#ctrl alt T      para la terminal