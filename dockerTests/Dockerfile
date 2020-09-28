FROM ubuntu:20.04

MAINTAINER MelissaTrujillo

WORKDIR /usr/app
COPY ./GetIPHostnameServer.java /usr/app/
#RUN sudo apt-get install default-jre

CMD ["javac GetIPHostnameServer.java","java GetIPHostnameServer.java"]
	
EXPOSE 8080
