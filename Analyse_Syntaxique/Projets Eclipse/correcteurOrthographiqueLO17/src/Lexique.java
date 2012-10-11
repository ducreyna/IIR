import java.io.*;
import java.util.*;
import java.lang.Math;
import java.lang.Character;

public class Lexique {
	
	private ArrayList<ArrayList<String>> lemmes;
	private Cat cat;
	private Saisie saisie;
	
	/**
	 * constructeur de la classe
	 */
	public Lexique() {
		lemmes = new ArrayList<ArrayList<String>>();
		cat = new Cat();
		saisie = new Saisie();
	}
	
	/**
	 * methode comparant les mots de la phrase avec le lexique
	 * si le mot existe dans le lexique alors son lemme est recupere
	 * sinon on place null dans l'arraylist
	 * @return void
	 */
	public void genereLemme() {
		ArrayList<String> sousListe = new ArrayList<String>();
		
		saisie.lecture();

		for(int i=0; i<saisie.getExtractArray().size(); i++){
			sousListe.add(saisie.getExtractArray().get(i));
			//if(saisie.getExtractArray().get(i).length() > 3){
			sousListe.add(cat.lecture(saisie.getExtractArray().get(i)));
			//}
			lemmes.add(sousListe);
			sousListe = new ArrayList<String>();
		}
		
		for(int i=0; i<lemmes.size(); i++){
			for(int j=0; j<lemmes.get(i).size(); j++)
			{
				if(lemmes.get(i).get(j).length() == 0)
				{
					genereLemmeCandidatPrefixe(lemmes.get(i).get(0),i);
				}
			}
		}

		
		System.out.println(lemmes);
	}
	
	/**
	 * methode permettant de generer les lemmes candidats pour un mot
	 * @param mot
	 * @param indice l'indice du mot dans la liste de lemmes
	 */
	public void genereLemmeCandidatPrefixe(String mot, int indice)
	{
		ArrayList<String> candidats = new ArrayList<String>();
		lemmes.get(indice).remove(1);
		
		int proxMax=0;
		for(int i=0; i<cat.getMots().size(); i++)
		{
			int prox = prefixe(mot,cat.getMots().get(i));
			
			if(prox > 75 && prox >= proxMax)
			{
				if(prox > proxMax)
				{
					candidats.clear();
					// infos
					candidats.add(Integer.toString(prox));
					candidats.add("prefixe");
					// infos
					candidats.add(cat.getLemmes().get(i));
				}
				else 
				{
					// infos
					candidats.add(Integer.toString(prox));
					candidats.add("prefixe");
					// infos
					candidats.add(cat.getLemmes().get(i));
				}
				
				proxMax=prox;
			}
		}
		
		if(!candidats.isEmpty())
		{
			for(int i = 0; i < candidats.size(); i++)
			{
				lemmes.get(indice).add(candidats.get(i));
			}
		}
		else
		{
				genereLemmeCandidatLevenshtein(mot,indice);
		}
	}
	
	/**
	 * methode permettant de generer les lemmes candidats pour un mot
	 * @param mot
	 * @param indice l'indice du mot dans la liste de lemmes
	 */
	public void genereLemmeCandidatLevenshtein(String mot, int indice)
	{
		ArrayList<String> candidats = new ArrayList<String>();
		
		int proxMin=10;
		for(int i=0; i<cat.getMots().size(); i++)
		{
			int prox = levenshtein(mot,cat.getMots().get(i)) + compteLettresDifferentes(mot,cat.getMots().get(i));
			
			if(prox <=7 && prox <= proxMin)
			{
				
				if(prox < proxMin)
				{
					candidats.clear();
					// infos
					candidats.add(Integer.toString(prox));
					candidats.add("Levenshtein");
					// infos
					candidats.add(cat.getLemmes().get(i));
				}
				else 
				{
					// infos
					candidats.add(Integer.toString(prox));
					candidats.add("Levenshtein");
					// infos
					candidats.add(cat.getLemmes().get(i));
				}
				
				proxMin=prox;
			}
		}

		if(!candidats.isEmpty())
		{
			for(int i = 0; i < candidats.size(); i++)
			{
				lemmes.get(indice).add(candidats.get(i));
			}
		}
		else
		{
			lemmes.get(indice).add("");
		}
	}
	
	/**
	 * methode appliquant l'algorithme par prefixe
	 * @param m1 chaine de caracteres
	 * @param m2 chaine de caracteres
	 * @return int l'indice de proximite
	 */
	public int prefixe(String m1, String m2)
	{
		int prox=0;
		
		if((m1.length() < 3) || (m2.length() < 3))
		{
			prox = 0;
		}
		else if(Math.abs(m1.length() - m2.length()) > 4)
		{
			prox = 0;
		}
		else
		{
			int i=0;
			
			while((i <= (m1.length()-1)) && (i <= (m2.length()-1)) && (new Character(m1.charAt(i)).equals(new Character(m2.charAt(i)))) && (i < Math.min(m1.length(), m2.length())))
			{
				i++;
			}
			prox = (i*100)/(Math.max(m1.length(), m2.length()));
		}
		return prox;
	}
	
	/**
	 * methode comptant le nombre de lettres non communes entre 2 mots
	 * @param m1 mot
	 * @param m2 mot
	 * @return int le nombre de lettres
	 */
	public int compteLettresDifferentes(String m1, String m2)
	{
		int cpt=0;
		
		if(m1.length() >= m2.length())
		{
			for(int i=0; i<m1.length(); i++)
			{
				if(m2.indexOf(m1.charAt(i)) == -1)
				{
					cpt++;
				}
			}
		}
		else
		{
			for(int i=0; i<m2.length(); i++)
			{
				if(m1.indexOf(m2.charAt(i)) == -1)
				{
					cpt++;
				}
			}
		}
		return cpt;
	}
	
	/**
	 * methode calculant le minimum
	 * @param a
	 * @param b
	 * @param c
	 * @return int le minimum entre tous les arguments
	 */
	private static int minimum(int a, int b, int c) 
	{
        return Math.min(Math.min(a, b), c);
	}

	/**
	 * methode appliquant l'algotithme de distance de levenshtein
	 * @param str1 mot
	 * @param str2 mot
	 * @return int la distance de levenshtein
	 */
    public int levenshtein(String str1, String str2) 
    {
        int[][] distance = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 0; i <= str1.length(); i++)
                distance[i][0] = i;
        for (int j = 0; j <= str2.length(); j++)
                distance[0][j] = j;

        for (int i = 1; i <= str1.length(); i++)
                for (int j = 1; j <= str2.length(); j++)
                        distance[i][j] = minimum(
                                        distance[i - 1][j] + 2, //suppression
                                        distance[i][j - 1] + 2, //insertion
                                        distance[i - 1][j - 1]
                                                        + ((str1.charAt(i - 1) == str2.charAt(j - 1)) ? 0
                                                                        : 1));

        return distance[str1.length()][str2.length()];
	}
    
    public String toString()
    {
    	return null;
    }
}
