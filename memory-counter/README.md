## Run manually
0. `mvn clean`
1. Создаем агента с методом `premain`
2. Создаем manifest.mf с `PreMain-Class`
mkdir target
3. create class file of test
```
javac -d ./target/ src/main/java/com/kananindzya/agent/memory/AgentMemoryCounter.java
cd target
jar -cvfm memory-agent.jar ../src/main/resources/manifest.mf com/kananindzya/agent/memory/*.class
```
3. create class file of test

```
cd ..
 javac -d ./target/ src/main/java/com/kananindzya/agent/memory/AgentMemoryCounter.java src/main/java/com/kananindzya/agent/memory/AgentTester.java
```
4. go to target dir again and run command:
```
nindzya@pc:~/Documents/PROJECTS/startup-agent/memory-counter/target$ java -javaagent:memory-agent.jar com.kananindzya.agent.memory.AgentTester
Object, size=16
A, size=24
Integer, size=16
String, size=24
GregorianCalendar, size=112
BigDecimal, size=40
ArrayList, size=24
Integer[], size=416

```

## Run via maven
1. build jar 
```
mvn clean package
```
2. run AgentTeser via idea and in VM options set:
```
-javaagent:/home/nindzya/Documents/PROJECTS/startup-agent/memory-counter/target/memory-counter-0.1.jar"
```