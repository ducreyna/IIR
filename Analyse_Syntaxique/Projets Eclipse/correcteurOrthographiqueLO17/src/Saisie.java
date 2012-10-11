import java.io.*;
import java.util.*;

class Saisie{
	private ArrayList<String> extractArray;
	
	/**
	 * constructeur de la classe
	 */
	public Saisie() {
		extractArray = new ArrayList<String>();
	}
	
	/**
	 * methode permettant l'extraction des differents mots de la phrase saisie
	 * @param chaine chaine saisie
	 */
    public void extraction(String chaine) 
    {
	     chaine.toLowerCase();
	   	 StringTokenizer token = new StringTokenizer(chaine);
	   	 while (token.hasMoreTokens())
	   	 {
	   		 extractArray.add(token.nextToken());
	   	 }
    }
	
    /**
     * methode lisant la phrase saisie par l'utilisateur
     */
     public void lecture() {
     BufferedReader br = null;
     String chaine;
     try {
          try {
              br = new BufferedReader(new InputStreamReader(System.in));
              System.out.print("saisie : ");
              chaine=br.readLine();
              System.out.println("j'ai saisi "+chaine);
              extraction(chaine);
        } 
          catch(EOFException e) {
               br.close();
               }
          } 
     catch(IOException e) {
          System.out.println("IO Exception");
          }
     }

	public ArrayList<String> getExtractArray() {
		return extractArray;
	}
         
}
