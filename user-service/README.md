## User Service

We use this user service as microservice and register this with consul discovery client.

### Creating Docker Image

We will create the docker image for our user service with following command.

```agsl
docker build -t consul-user-service ./
```