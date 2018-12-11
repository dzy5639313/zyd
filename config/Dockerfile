FROM java:8-jdk-alpine
COPY ./target/zyd-config.jar /
ENV JAVA_OPS -Duser.timezone=Asia/Shanghai
EXPOSE 8001
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /zyd-config.jar
