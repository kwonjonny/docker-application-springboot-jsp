# 기본 Java 이미지를 사용합니다.
FROM openjdk:17-jdk-slim

WORKDIR /app

# WAR 파일을 복사합니다.
COPY ./build/libs/application-0.0.1-SNAPSHOT.war /app/application.war

# 8080 포트를 노출합니다.
EXPOSE 8585

ENTRYPOINT ["java", "-jar", "/app/application.war"]
