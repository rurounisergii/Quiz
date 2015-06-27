

The  Quiz GUI is made using Java Swing. The client and server interact using RMI. Unit tests written with JUnit

The Quiz can be launched by running the ServerLauncher.java class in the Quiz.src.server package to set up the server
Once the server has been set up, Clients can be launched by running the ClientLauncher.java class in the Quiz.src.client package

The Quiz System allows for concurrent requests to the server. Multiple SetUpClients and PlayerClients can be launched from the ClientLauncher and operate at the same time without producing unusual behaviour. 
