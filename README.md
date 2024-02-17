# 🏷️ Courses Spring Boot application


## Table Of Contents

- [Context](#context)
- [Getting Started](#getting-started)
    - [Environment Setup](#environment-setup)
    - [Repository Setup](#repository-setup)
- [Developing](#developing)

## Context

The purpose of this project is to gain knowledge on Java programming language

This is a Spring Boot application that contains multiple API endpoints to retrieve or manipulate data on
a [MySQL](https://www.mysql.com/ "MySQL official site") database.

The following HTTP request methods have been implemented:

1. _**GET**_
3. _**PATCH**_

### Tech stack

<img align="left" alt="Docker" width="40px" src="https://cdn.jsdelivr.net/npm/devicon-2.2@2.2.0/icons/docker/docker-original.svg" style="padding-right:10px;" />
<img align="left" alt="Java" width="40px" src="https://cdn.jsdelivr.net/npm/devicon-2.2@2.2.0/icons/java/java-original.svg" style="padding-right:10px;" />
<img alt="Spring Boot" width="40px" src="https://cdn.jsdelivr.net/npm/devicon-2.2@2.2.0/icons/mysql/mysql-original.svg" style="padding-right:10px;" />

## Getting Started

### Environment Setup

#### Please use Docker Compose to run the Spring Boot application

- Install [Docker Desktop](https://www.docker.com/products/docker-desktop/)

### Repository Setup

Once you have your environment setup, you can clone the repository.

```zsh
git clone https://github.com/nicholas5538/courses-backend.git
cd courses-backend
```

## Developing

Once you have [set up the repo](#repository-setup), you're ready to start developing. Starting the development
environment is managed by the following command(s).

- With **Docker Compose** (recommended)

```sh
docker compose up -d
```

### Note
Any changes made to [docker-compose.yml](docker-compose.yml) must be reflected accordingly in [application.yml](./src/main/resources/application.yml).

- Example **(Changing MySQL root password)**
```yaml
# Changing MYSQL_ROOT_PASSWORD to 12345678
# docker-compose.yml
mysql:
  image: mysql:latest
  environment:
    - MYSQL_ROOT_PASSWORD=12345678
  restart: always
  ports:
    - "3306:3306"
  volumes:
    - courses-mysql-data:/var/lib/mysql

# application.yml
# You have to change password to the one stated in docker-compose.yml
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/data_jpa?createDatabaseIfNotExist=true
    username: root
    password: 12345678
```