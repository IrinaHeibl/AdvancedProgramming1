import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

//import javax.xml.ws.Endpoint;

public class Server {

		
	private ServerSocket myServerSocket;
    private int port;
    
    public Server(int port)//constructor
    {
    	this.port=port;
    }
    
    public void InitServer() throws IOException 
    {
    	myServerSocket=new ServerSocket(port);
    	Socket client=null;
    	client=myServerSocket.accept();
    	System.out.print("Client connected to Server");
    	 //threads for clients?
    	
    }
    private static String getTimeStamp() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss a");
		String formattedDate = sdf.format(date);
		return formattedDate;
	}
    
    public static void main(String args[] ) throws IOException {
    
    	System.out.print("Hello There");
    	int port=8080;
    	try {
    		
    	Server myserver= new Server(port);
    	
    	}
    	
    	finally {
    		
    	}
    	
    }




//	public Server(int port) {
//		this.port = port;
//	}
	//1
	//init Server
	
	//2
	//send XML to client
	//generate XML from HL7

	
	
	//send XML to database
	//Database
	//Handshake
	//Gui
	//retriev XML from Database
	
	
	
	//generate HL7 from XML
}
