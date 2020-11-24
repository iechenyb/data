tcpH2Server.bat 是h2数据库服务，必须启动，否则即使启动tcpH2Web.bat也无法进行数据库的连接。

必须先手动创建一个*.h2.db的文件，否则无法创建文件，报文件目录不能发现（...not found, and IFEXISTS=true, so we cant auto-create it）。
启动后数据库的连接方式
jdbc.driver=org.h2.Driver
jdbc.url=jdbc:h2:tcp://localhost:9092/~/alipay;MV_STORE=FALSE;MVCC=FALSE
jdbc.username=sa
jdbc.password=111111


jdbc.driver=org.h2.Driver
jdbc.url=jdbc:h2:tcp://192.168.16.211:9092/~/alipay;MVCC=TRUE;AUTO_SERVER=TRUE
jdbc.username=sa
jdbc.password=111111

//指定本地磁盘目录不能访问，只能使用主目录进行访问
jdbc.driver=org.h2.Driver
jdbc.url=jdbc:h2:tcp://192.168.16.211:9092/d:/data/h2/alipay;ifexists=true
jdbc.username=sa
jdbc.password=111111

MV_STORE=FALSE;MVCC=FALSE
;AUTO_SERVER=TRUE;DB_CLOSE_DELAY=-1


java org.h2.tools.CreateCluster
 -urlSource jdbc:h2:tcp://localhost:9101/~/test
 -urlTarget jdbc:h2:tcp://localhost:9102/~/test
 -user sa
 -serverList localhost:9101,localhost:9102