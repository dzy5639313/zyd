FROM java:8-jdk-alpine
COPY ./target/zyd-gateway.jar /
ENV JAVA_OPS -Duser.timezone=Asia/Shanghai
EXPOSE 8888
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /zyd-gateway.jar
