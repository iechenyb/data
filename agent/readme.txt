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
