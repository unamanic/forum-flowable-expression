#Flowable Expression Demo

This project shows the use of the service task's `expresion` parameter in Flowable

##Execution
###Linux/Mac
```
./gradlew bootrun
``` 

###Windows
```
gradlew.bat bootrun
```

##Triggering the process
```
curl localhost:58080
```

You'll see the output `Hi there` and see something like th e following in your logs:
```
2019-09-03 14:56:56.279  INFO 35803 --- [io-58080-exec-1] c.e.f.services.DemoService               : executing DemoService.hello()
```
