# Concise
Trial project for Concise Systems

# How to run
Since I had a hard time with Docker I decided to use this tutorial http://blog.zentaly.com/how-to-run-postgres-in-docker/
. The repository provided worked with PostgreSQL 9.5 but I changed the Dockerfile to install PostgreSQL 9.6 instead.

- Clone this repository
- Open terminal in concise folder
- Run the following commands to start PostgreSQL 9.6 in Docker on port 5432

```
sudo docker build -t postgres dockerized-postgres  
sudo docker run -di -p 5432:5432 postgres 
```

- Run the following command to start Spring Boot application
``` 
java -jar concise_trial-0.0.1-SNAPSHOT.jar 
```

- Use Postman or other REST client to run POST commands (url - http://localhost:8888/data) with data following the structure below
```
{
  "data": "your data here"
}
```

- Use Postman or browser to run GET commands (url - http://localhost:8888/data?search=YOURSEARCH)
