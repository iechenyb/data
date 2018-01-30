1  jar cf agent.jar MySizeOf.java //将MySizeOf.java打成jar包
修改jar包中的META-INF/MANIFEST.MF文件，增加一行：Premain-Class: MySizeOf，这里的类名称是没有package的，如果你有package，那么就写全名。
2 将agent.jar路径放到系统变量path中
3 编译TestSize.java，并将agent.jar包中的Instrumentation的实例引入ClassPath，这样执行TestSize.java时才能引用Instrumentation实例。
javac -classpath agent.jar TestSize.java
4 执行TestSize，使用-javaagent:agent.jar,意思是使用agent.jar作为代理，用到agent技术
java -javaagent:agent.jar TestSize 
5 执行结果：
Interger size:16
String size:24
String fullsize:48
char size:24
ArrayList size:24
Object size:16
Long size :24
