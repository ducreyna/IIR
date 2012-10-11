import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

public class Main {

	/**
	 * methode Main
	 * @param args
	 */
	ArrayList<String> requete = new ArrayList<String>();
	
	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		 ArrayList<String> requete = new ArrayList<String>();
		 interrogPostgresql bdd = new interrogPostgresql();
		 Lexique lex = new Lexique();
		 lex.genereLemme();
		 String s = lex.toString();
		 System.out.println(s);
		 
		 try{
	             tal_sqlLexer lexer = new tal_sqlLexer(new ANTLRReaderStream(new StringReader(s)));
	             CommonTokenStream tokens = new CommonTokenStream(lexer);
	             tal_sqlParser parser = new tal_sqlParser(tokens);
	        	 String arbre = parser.listerequetes();
	        	 
	        	 StringTokenizer token = new StringTokenizer(arbre);
                 while(token.hasMoreTokens()){
                	 requete.add(token.nextToken());
                 }
	        	 
                 	System.out.println(arbre);
     				System.out.println(requete);
     			
     			PostTraitement post = new PostTraitement(requete);
     			String query = post.traitement();
     			
     			//interrogation de la base
     			bdd.interrogation(query);
             } 
		 catch(Exception e) {  }
		
	}

}
