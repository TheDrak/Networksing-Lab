import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class client implements serverTester {
	//Preston Mitchell
//Server Name: odin.cs.uab.edu Port: 3001
// java bash for server
// check return values 
	//B01299526
	/*
	int clientPort = 10023;
	int serverPort = 10001;
	String serverHost = "localhost";
	GymClient GClientB = new GClientB();
	Runtime.getRuntime().exec("rmiregistry " + clientPort);
	Registry registry = LocateRegistry.createRegistry(clientPort);
	registry.bind("GClientB", GClientB);
	Registry serverRegistry = LocateRegistry.getRegistry(serverHost, serverPort);
	GymServer server = (GymServer) serverRegistry.lookup("GServer");
	server.registerClientB("localhost", clientPort, "GClientB");
	server.printMessage("ClientB");
	*/
	 int cP = 5026;
	 int sP = 3001;
	 String sH = "odin.cs.uab.edu";
	 Socket socket;
	 PrintWriter out;
	 BufferedReader in;
	 InetAddress address;
	static String client;
	static int port;
	static Socket clientSocket;
	public static void main (String[] argo) throws IOException {
		client = argo[0];
		port = Integer.parseInt(argo[1]);
		clientSocket = new Socket(client,port);
		client c = new client();
			c.Socket();
			System.out.println("Connected");
			c.write("cs334fall2018 HELLO B01299526\n");
			
	}


@Override
public void Socket() throws UnknownHostException, IOException {
	// TODO Auto-generated method stub
	socket = new Socket(sH,sP);
	address = socket.getLocalAddress();
	
	 out = new PrintWriter(socket.getOutputStream(),true);
	 in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	
}


@Override
public void read() throws IOException {
	// TODO Auto-generated method stub
	in.readLine();
}


@Override
public void write(String string) {
	// TODO Auto-generated method stub
	
	out.println(string);
	
}

}
