#!/usr/bin/env bash

set -e

VERSION=4.0.1

FILE=openapi-generator-cli.jar

if [ "$FILE" ]
    then echo "FILE EXISTS"
else
    wget http://central.maven.org/maven2/org/openapitools/openapi-generator-cli/${VERSION}/openapi-generator-cli-${VERSION}.jar -O openapi-generator-cli.jar
fi