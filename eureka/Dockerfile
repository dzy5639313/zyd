FROM java:8-jdk-alpine
COPY ./target/zyd-eureka.jar /
ENV JAVA_OPS -Duser.timezone=Asia/Shanghai
EXPOSE 8000
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /zyd-eureka.jar
