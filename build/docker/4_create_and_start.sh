#!/bin/sh
docker run --name=demo --publish=8888:8888 --volume=demo-repo:/var/lib/demo-repo demo:latest