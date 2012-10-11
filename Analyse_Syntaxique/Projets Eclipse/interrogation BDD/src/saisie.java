import java.io.*;
import java.sql.*;

public class saisie  {

   public static void main(String args[])throws SQLException {

	String requete ="";
	BufferedReader br=null;
	interrogPostgresql bdd = new interrogPostgresql();
	try {
		try {
				br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("saisie : ");
				requete=br.readLine();
				System.out.println("j'ai saisi "+requete);
				bdd.interrogation(requete);
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
