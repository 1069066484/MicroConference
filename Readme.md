# UserService

## 使用
### 获取镜像与运行容器
镜像名与链接
```
asli926/micro_conference:userservice2.0
https://hub.docker.com/layers/asli926/micro_conference/userservice2.0/images/sha256-dd50d934ae40a44713ac6798948d75bc7afe93e56e5c400d9ebbefe0a515a48c?context=repo
```
镜像获取：
```
sudo docker pull asli926/micro_conference:userservice2.0 //pull下镜像
docker run -p 8080:8080 -d asli926/micro_conference:userservice2.0
```

### 进入容器
```
docker exec -it <container_id> /bin/bash 
```
容器中数据库位置：
```
cd /Users/liaishan/workspace/FDU_CS_ms/Software_eng/H2DB/UserDB
```

数据库已有数据（已持久化）：
```
username1: admin
password1: password

username2: asdfg
password2: asdfg12345
```
数据库包含表：
* Author Authority Conference Message Paper Post ReviewResult TokenProcessor Topic User UserAndConference等

## 备注
* 数据库与userservice服务在同一个docker中，作为一个微服务。
* 需要登录操作的微服务：运行本微服务后在postman进行login，postman会返回token，类似如下：
```
{
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhc2RmZyIsImlhdCI6MTYwMzc4MjY3MiwiZXhwIjoxNjAzODAwNjcyfQ.6mq-9uox9LstnvKQ2Nx72sjrpFdHIto3Jdlikm8mGR0dTlB9_RoNaWzFy9HgCGthPZEYxL5FWiM5TC15bhzDQg",
    "userType": "USER"
}
```
* 本微服务所需微服务：无
* 与其他微服务通信：不用获取其他微服务数据，其他微服务通过调用token实现登录后操作


