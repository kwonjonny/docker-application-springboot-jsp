# 기본 Java 이미지를 사용합니다.
FROM openjdk:11-jdk-slim

WORKDIR /app

# WAR 파일을 복사합니다. (application-plain.war로 수정)
COPY ./build/libs/application-plain.war /app/application.war

# 8080 포트를 노출합니다.
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/application.war"]
