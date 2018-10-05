#!/bin/sh
cp ../../target/*.jar demo.jar
docker build --file=Dockerfile.server  --tag=demo:latest --rm=true .