# Week 9 Lab – Simple Client-Server Communication with Sockets

## Description
This lab introduces **basic networking concepts in Java** using sockets. The program demonstrates
simple **client-server communication** where:

- A server waits for a client connection
- The server sends a message to the client
- The client reads the message and responds back
- Both programs terminate after communication

This is the first lab using `java.net` for networking and socket programming.

## Concepts Practiced
- Client-server architecture
- Java networking with `ServerSocket` and `Socket`
- Input and output streams over a network
- Using `PrintWriter` and `BufferedReader`
- Basic exception handling with `try-catch`
- Understanding ports and localhost connections

## File Structure
```bash
Week09-Simple-Client-Server/
│
├─ src/
│ ├─ SimpleServer.java
│ └─ SimpleClient.java
│
└─ README.md
```

## How the Program Works
1. The server starts first and listens on port 5000.
2. The client connects to the server using localhost.
3. The server sends a greeting message to the client.
4. The client reads the message and sends a response back.
5. Both the server and client close their connections.

## How to Run
### IntelliJ IDEA
1. Open the project in IntelliJ IDEA.
2. Ensure both `SimpleServer.java` and `SimpleClient.java` are inside the `src` folder.
3. Run `SimpleServer.java` first.
4. Once the server is waiting, run `SimpleClient.java` in a separate run window.

### Command Line
1. Navigate to the src folder:
```bash
cd Week09-Simple-Client-Server/src
```
2. Combile both files:
```bash
javac SimpleServer.java SimpleClient.java
```
3. Run the server first:
```bash
java SimpleServer
```
4. In a new terminal window, run the clinet:
```bash
java SimpleClient
```

## Notes
- The server and client must be run separately.
- The server must be running before the client connects.
- Port 5000 is hardcoded and used for local testing.
- This lab focuses on understanding basic socket communication, not multi-client handling.
