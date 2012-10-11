import java.io.*;
import java.util.*;

class Saisie{
	
	private ArrayList<String> extractArray;
	
	public Saisie()
	{
		extractArray = new ArrayList<String>;
	}
	
     public void lecture() 
     {
	     BufferedReader br=null;
	     String chaine;
	     try {
	          try {
	              br = new BufferedReader(new InputStreamReader(System.in));
	              System.out.print("saisie : ");
	              chaine=br.readLine();
	              System.out.println("j'ai saisi "+chaine);
	               } 
	          catch(EOFException e) {
	               br.close();
	               }
	          } 
	     catch(IOException e) {
	          System.out.println("IO Exception");
	          }
     }
}
