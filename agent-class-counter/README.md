0. `mvn clean`
1. Создаем агента с методом `premain`
2. Создаем manifest.mf с `PreMain-Class`
mkdir target
3. create class file of test
```
javac -d ./target/ src/main/java/com/kananindzya/agent/counter/ClassTransformer.java src/main/java/com/kananindzya/agent/counter/AgentCounter.java
cd target
jar -cvfm counter-agent.jar ../src/main/resources/manifest.mf com/kananindzya/agent/counter/*.class
```
3. create class file of test

```
cd ..
javac -d ./target/ src/main/java/com/kananindzya/agent/counter/AgentTester.java
```
4. go to target dir again and run command:
```
nindzya@pc:~/Documents/PROJECTS/startup-agent/agent-class-counter/target$ java -javaagent:counter-agent.jar com.kananindzya.agent.counter.AgentTester
Agent counter
load class: java.lang.invoke.MethodHandleImpl
loaded 1 classes
load class: java.lang.invoke.MethodHandleImpl$1
loaded 2 classes
load class: java.lang.invoke.MethodHandleImpl$2
loaded 3 classes
load class: java.util.function.Function
loaded 4 classes
load class: java.lang.invoke.MethodHandleImpl$3
loaded 5 classes
load class: java.lang.invoke.MethodHandleImpl$4
loaded 6 classes
load class: java.lang.ClassValue
loaded 7 classes
load class: java.lang.ClassValue$Entry
loaded 8 classes
load class: java.lang.ClassValue$Identity
loaded 9 classes
load class: java.lang.ClassValue$Version
loaded 10 classes
load class: java.lang.invoke.MemberName$Factory
loaded 11 classes
load class: java.lang.invoke.MethodHandleStatics
loaded 12 classes
load class: java.lang.invoke.MethodHandleStatics$1
loaded 13 classes
load class: sun.misc.PostVMInitHook
loaded 14 classes
load class: sun.misc.PostVMInitHook$1
loaded 15 classes
load class: sun.launcher.LauncherHelper
loaded 16 classes
load class: com.kananindzya.agent.counter.AgentTester
loaded 17 classes
load class: sun.launcher.LauncherHelper$FXHelper
loaded 18 classes
load class: java.lang.Class$MethodArray
loaded 19 classes
load class: java.lang.Void
loaded 20 classes
load class: com.kananindzya.agent.counter.A
loaded 21 classes
load class: com.kananindzya.agent.counter.B
loaded 22 classes
load class: java.lang.Shutdown
loaded 23 classes
load class: java.lang.Shutdown$Lock
loaded 24 classes
nindzya@pc:~/Documents/PROJECTS/startup-agent/agent-class-counter/target$ 

```

