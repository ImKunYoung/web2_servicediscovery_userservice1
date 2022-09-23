```yaml
server:
  port: 9001

spring:
  application:
    name: user-service1

eureka:
  client:
    register-with-eureka: true
    fetch-registry: true
    service-url:
      defaultZone: http://localhost:8761/eureka/
```

|키워드| 설명          |
|:---|:------------|
|port: 9001| 9001로 포트 지정 |