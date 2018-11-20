#!/usr/bin/env bash
mvn clean package -U -Dmaven.test.skip=true
docker build -t orionhank/bootu-eureka-server:latest .
docker push orionhank/bootu-eureka-server:latest