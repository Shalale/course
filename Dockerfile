FROM alpine:3.11.2
RUN apk add --no-cache openjdk11
COPY build/libs/ms_course-0.0.1-SNAPSHOT.jar /app/
WORKDIR /app/
ENTRYPOINT ["java"]
CMD ["-jar", "ms_course-0.0.1-SNAPSHOT.jar"]