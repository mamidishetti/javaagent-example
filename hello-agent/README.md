0. `mvn clean`
1. Создаем агента с методом `premain`
2. Создаем manifest.mf с `PreMain-Class`
mkdir target
3. create class file of test
```
javac -d ./target/ src/main/java/com/kananindzya/agent/hello/HelloAgent.java
cd target
jar -cvfm hello-agent.jar ../src/main/resources/manifest.mf com/kananindzya/agent/hello/HelloAgent.class
```
3. create class file of test

```
cd ..
javac -d ./target/ src/main/java/com/kananindzya/agent/hello/HelloAgentTest.java
```
4. go to target dir again and run command:
```
nindzya@pc:~/Documents/PROJECTS/startup-agent/hello-agent/target$ java -javaagent:hello-agent.jar com.kananindzya.agent.hello.HelloAgentTest 
Hell, I am Hello agent.
Hello! I`m agent tester
```

