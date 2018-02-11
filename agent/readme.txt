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



=============================================================
D:\data\agent>jar cf agent.jar MySizeOf.java

D:\data\agent>javac -classpath agent.jar TestSize.java
TestSize.java:4: 错误: 程序包org.apache.commons.logging不存在
import org.apache.commons.logging.Log;
                                 ^
TestSize.java:5: 错误: 程序包org.apache.commons.logging不存在
import org.apache.commons.logging.LogFactory;
                                 ^
TestSize.java:9: 错误: 找不到符号
        Log log = LogFactory.getLog(TestSize.class);
        ^
  符号:   类 Log
  位置: 类 TestSize
TestSize.java:9: 错误: 找不到符号
        Log log = LogFactory.getLog(TestSize.class);
                  ^
  符号:   变量 LogFactory
  位置: 类 TestSize
4 个错误

D:\data\agent>javac -classpath agent.jar TestSize.java

D:\data\agent>java -javaagent:agent.jar TestSize
Interger size:16
String size:24
String fullsize:48
char size:24
ArrayList size:24
Object size:16
Long size :24

D:\data\agent>javac -classpath agent.jar TestSize.java

D:\data\agent>java -javaagent:agent.jar TestSize
Object size:16
Interger size:16
String size:24
String fullsize:48
char size:24
ArrayList size:24
Object size:16
Long size :24

D:\data\agent>

-XX:+UseCompressedOops
运行结果显示对于Object对象在32bit机器上占8个字节，在64bit机器上占16个字节，
而对于用于一个Object类型成员的MyObject在32bit机器上占用16个字节，
而在64bit机器上不开启指针压缩是占用24个字节，开启指针压缩后占用16个字节。