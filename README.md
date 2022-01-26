# RCE Backend Repository
<br>

### Built With

* [Java 17](https://www.java.com/en/)
* [Maven](https://maven.apache.org)
* [SpringBoot](https://spring.io/projects/spring-boot)
* [Docker](https://www.docker.com)
* [PostGresSql](https://postgressql.org)
* [Liquibase](https://liquibase.org)

## Getting Started

To run the project locally there are some dependencies that need to be installed 
and a few things that need to be setup
<br/><br/>

### Prerequisites

* [JDK 17](https://www.oracle.com/java/technologies/downloads/)
* [Docker or Docker Desktop](https://docs.docker.com/desktop/windows/install/)
* [WSL2 if running on Windows](https://docs.microsoft.com/en-us/windows/wsl/install) * Instructions also in Docker Desktop 
* [Maven](https://maven.apache.org/install.html)

### Installation

1. Start PostGres Docker image
```sh
sudo docker run --name dev-postgres -e POSTGRES_PASSWORD=mysecretpassword -d -p 5432:5432 postgres
```

2. Connect to database using SQL Client such as [TablePlus](https://tableplus.com) or [HeidiSQL](https://www.heidisql.com)
```sh
Default Credentials

username: postgres
password: mysecretpassword
```

3. Run [Sample.sql](https://github.com/kush-js/rce-backend/blob/master/demo/Sample.sql) file provided in repository to populate the database
```sh
CREATE DATABASE rce;

GRANT ALL PRIVILEGES ON DATABASE rce TO postgres;

CREATE TABLE APPLICANTS(
	ID VARCHAR PRIMARY KEY NOT NULL,
	FIRST_NAME VARCHAR NOT NULL,
	LAST_NAME VARCHAR NOT NULL
);
```

### Usage

Open a terminal/command prompt in the demo folder and run the following command to start the local springboot project
```sh
mvn spring-boot:run
```


