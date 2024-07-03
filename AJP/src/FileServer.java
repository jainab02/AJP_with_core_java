import java.io.*;
import java.net.*;

public class FileServer {

  public static void main(String args[]) throws Exception {
    ServerSocket ss = new ServerSocket(2002);
    Socket s = ss.accept();
    System.out.println("connected..........");
    FileInputStream fin = new FileInputStream("Send.txt");
    DataOutputStream dout = new DataOutputStream(s.getOutputStream());
    int r;
    while ((r = fin.read()) != -1) {
      dout.write(r);
    }
    System.out.println("\nFiletranfer Completed");
    s.close();
    ss.close();
	fin.close();
  }
}
