# .net core 服务注册到spring cloud demo 
spring cloud全家桶搭建一套简单的微服务demo,.net core建立一个webapi工程将服务注册到eureka服务中心，
## 注册中心（端口8001）  
## 配置中心（端口8000）  
## zuul网关（端口8888）  
## 测试服务JAVA（端口9000）
## .net core测试服务（端口8010）  

为了简单起见都只配置了单节点，启动相关服务后，访问注册中心，发现java和.net core的测试服务均已注册  

直接访问测试服务:http://localhost:8010/api/test?name=hello  

通过网关访问测试服务:http://localhost:8888/dotnet-service/api/test?name=hello  

![注册中心](https://github.com/mingyunet/.net-core-spring-cloud-register-demo/blob/master/images/run.png)
