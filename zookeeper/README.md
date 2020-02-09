#Distributed configuraton in Spring Cloud using Zookeeper as datastore

1. [Download](http://zookeeper.apache.org/releases.html#download) the Zookeeper distribution.

2. Refer [link](http://zookeeper.apache.org/doc/r3.5.6/zookeeperStarted.html) to setup Zookeeper.

3. Connect to Zookeeper server using zookeeper [cli](http://zookeeper.apache.org/doc/r3.5.6/zookeeperStarted.html#sc_ConnectingToZooKeeper)

4. Create znode to store spring boot configuration using cli.  
    ```bash
    [zk: localhost:2181(CONNECTED) 3] create /config
    Created /config
    [zk: localhost:2181(CONNECTED) 20] create /config/config-zookeeper-example
    Created /config/config-zookeeper-example
    [zk: localhost:2181(CONNECTED) 21] create /config/config-zookeeper-example/user.greeting.english
    Created /config/config-zookeeper-example/user.greeting.english
    [zk: localhost:2181(CONNECTED) 22] create /config/config-zookeeper-example/user.greeting.french
    Created /config/config-zookeeper-example/user.greeting.french
    [zk: localhost:2181(CONNECTED) 23] set /config/config-zookeeper-example/user.greeting.english Hello
    [zk: localhost:2181(CONNECTED) 24] set /config/config-zookeeper-example/user.greeting.french Bonjour
    [zk: localhost:2181(CONNECTED) 25]
    ```
    
5. Start zookeeper spring boot application.

6. Call the greet endpoint to see the configuration property being read from zookeeper.
    ```bash
    http://localhost:8081/greet?language=english
    Output:
    Hello

    http://localhost:8081/greet?language=french
    Output:
    Bonjour
    ```

