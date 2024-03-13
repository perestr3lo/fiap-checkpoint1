FROM ubuntu:latest
LABEL authors="matheusp"

ENTRYPOINT ["top", "-b"]