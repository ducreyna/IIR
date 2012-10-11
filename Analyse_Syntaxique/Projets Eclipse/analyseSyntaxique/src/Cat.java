import java.io.*;
import java.util.*;

class Cat{
	
	private ArrayList<String> mots;
	private ArrayList<String> lemmes;
	
	public Cat()
	{
		mots = new ArrayList<String>();
		lemmes = new ArrayList<String>();
		chargement();
	}
	
	/**
	 * methode chargeant le fichier contenant le lexique
	 */
	public void chargement()
	{
		BufferedReader br = null;
		 String chaine;
		 
		 try 
		 {
		      try 
		      {
		          br = new BufferedReader(new InputStreamReader(new FileInputStream("lexique.txt"),"UTF-8"));
		          
		           while ((chaine=br.readLine())!=null) 
		           {
			      		 StringTokenizer token = new StringTokenizer(chaine);
			      		 String current = token.nextToken().toString();
			      		 mots.add(current);
			      		 
			      		 if(token.hasMoreTokens())
			      		 {
			      			 lemmes.add(token.nextToken().toString());
			      		 }
			      		 else
			      		 {
			      			 lemmes.add("");
			      		 }
		           } 
		      }
		      catch(EOFException e)
	  		  {
			       br.close();
	          }
		 }
		 catch(FileNotFoundException e) 
		 {
		      System.out.println("fichier inconnu : " + "lexique.txt");
		 } 
		 catch(IOException e) 
		 {
		      System.out.println("IO Exception");
		 }
	}
	
	/**
	 * methode permettant la comparaison du mot passé en argument avec ceux du lexique
	 * @param mot mot recherche dans le lexique
	 * @return String renvoie le lemme du mot s'il existe sinon null
	 */
	 public String lecture(String mot) {

		 for(int i = 0; i < mots.size(); i++)
		 {
	       	 if(mot.equals(mots.get(i))) 
	       	 {
	       		return lemmes.get(i);
	       	 }
		 }
		 return "";          
	}

	public ArrayList<String> getMots() {
		return mots;
	}

	public ArrayList<String> getLemmes() {
		return lemmes;
	}

}
