#!/usr/bin/env bash
mvn clean package

echo 'Copy files...'

scp -i root@46.138.31.158
