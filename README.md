About the Project

This project is for our class Summer 2014 COEN 359 Design Pattern.
Thanks for our teacher Dr. Rani Mikkilineni's outstanding instructing.
Team members: Zhe Sun (zsun@scu.edu), Hongsen He (hhe@scu.edu).

Directory and File Description

SensorSimulator

├─build     // Building Project Output Files

├─dist      // Executable Jar File after Building Project

├─lib       // Dependency Libraries

├─nbproject // NetBeans Project Files

└─src       // Source Code

   └─sensorsimulator // Main Module
   
        └─network       // Network Module for Networking
        
           ├─client     // Client Sub Module for Sending Data
           
           └─server     // Server Sub Module for Receiving Data
           

How to Use it?
Take Windows platform as an example:
0) You must have the JRE installed in your system. (Please refer to http://www.java.com)

1) Execute Run_SensorSimulator.bat (Such as by double-click it). For Linux, OS X, Solaris, please use command line: java -jar "./dist/SensorSimulator.jar" 

2) You can adjust values on the panel to send alarms to SoSafe application.

3) You can review network traffic on Network Traffic Log area.

4) Listen to SoSafe Server is optional, because it will not process received data in this version.

Thank you! Have a nice day.
