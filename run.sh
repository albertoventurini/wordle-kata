#!/bin/bash

mvn clean package

java  -jar ./target/wordle-kata-1.0-SNAPSHOT.jar $@
