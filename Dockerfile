FROM ubuntu:latest
LABEL authors="nick"

ENTRYPOINT ["top", "-b"]