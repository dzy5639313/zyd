FROM java:8-jdk-alpine
COPY ./target/zyd-api.jar /
ENV JAVA_OPS -Duser.timezone=Asia/Shanghai
EXPOSE 8080
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /zyd-api.jar
