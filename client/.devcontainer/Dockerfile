# Setup dev environment
FROM node:16-bullseye as build

ENV DEBIAN_FRONTEND noninteractive

RUN apt-get update && \
    apt-get install -y git bash maven openjdk-11-jdk

# Theia build dependencies
RUN apt-get -y install --no-install-recommends \
    software-properties-common \
    libxkbfile-dev \
    libsecret-1-dev \
    build-essential libssl-dev
