1  jar cf agent.jar MySizeOf.java //��MySizeOf.java���jar��
�޸�jar���е�META-INF/MANIFEST.MF�ļ�������һ�У�Premain-Class: MySizeOf���������������û��package�ģ��������package����ô��дȫ����
2 ��agent.jar·���ŵ�ϵͳ����path��
3 ����TestSize.java������agent.jar���е�Instrumentation��ʵ������ClassPath������ִ��TestSize.javaʱ��������Instrumentationʵ����
javac -classpath agent.jar TestSize.java
4 ִ��TestSize��ʹ��-javaagent:agent.jar,��˼��ʹ��agent.jar��Ϊ�����õ�agent����
java -javaagent:agent.jar TestSize 
5 ִ�н����
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
TestSize.java:4: ����: �����org.apache.commons.logging������
import org.apache.commons.logging.Log;
                                 ^
TestSize.java:5: ����: �����org.apache.commons.logging������
import org.apache.commons.logging.LogFactory;
                                 ^
TestSize.java:9: ����: �Ҳ�������
        Log log = LogFactory.getLog(TestSize.class);
        ^
  ����:   �� Log
  λ��: �� TestSize
TestSize.java:9: ����: �Ҳ�������
        Log log = LogFactory.getLog(TestSize.class);
                  ^
  ����:   ���� LogFactory
  λ��: �� TestSize
4 ������

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
���н����ʾ����Object������32bit������ռ8���ֽڣ���64bit������ռ16���ֽڣ�
����������һ��Object���ͳ�Ա��MyObject��32bit������ռ��16���ֽڣ�
����64bit�����ϲ�����ָ��ѹ����ռ��24���ֽڣ�����ָ��ѹ����ռ��16���ֽڡ�