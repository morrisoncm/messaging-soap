# messaging-soap

Sample Gradle Spring Boot API with SOAP consumer and Junit 5  

### Workspace Setup
- [Download java](https://jdk.java.net/archive/)
- [Configuring Java](https://docs.oracle.com/cd/E19182-01/821-0917/inst_jdk_javahome_t/index.html)  
- [Download Eclipse](https://www.eclipse.org/downloads/packages/)  
- [Download and Install Gradle](https://docs.gradle.org/current/userguide/installation.html)  
- [Download and install Postman](https://www.getpostman.com/downloads/)

### Docker Setup
OS-level virtualization to deliver software in packages called containers.

- **docker run -‑env LICENSE=accept --env MQ_QMGR_NAME=QM1 --publish 1414:1414 --publish 9443:9443 --detach ibmcom/mq**
- Check that the server is running using **docker ps**

### Launch local MQ Server - using Docker
Make sure docker is running

- [Default docker image configuration configuration](https://github.com/ibm-messaging/mq-container/blob/master/docs/developer-config.md#default-developer-configuration)
- [The MQ server web console](https://github.com/ibm-messaging/mq-container/blob/master/docs/developer-config.md#web-console)
- [The MQ server local URL](https://127.0.0.1:9443/ibmmq/console/login.html)

### Running the application
- Clone or download the project  
- To run the application from Terminal / Command Prompt   
- Change directory to the project root directory and type **gradle bootRun** 
- To run the application inside Eclipse  
- The starting point is Application.java  
- Right click the Application.java  and select Run As ->Java Application  

### Spring Reference
- [Spring Getting Started Guides](https://spring.io/guides#getting-started-guides)
- [Spring Topical Guides](https://spring.io/guides#topical-guides)
- [Spring Tutorials](https://spring.io/guides#tutorials)
- [Gradle Guildes](https://gradle.org/guides/)