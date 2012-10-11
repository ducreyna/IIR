import java.util.*;

class PostTraitement {
	ArrayList<String> requete;
	
	
	public PostTraitement(ArrayList<String> requete){
		this.requete = requete;
	};
	
	public String traitement (){
		
		
		
		/////GESTION DATES/////
		ArrayList<String> mois = new ArrayList<String>();
		ArrayList<Integer> positionsDate = new ArrayList<Integer>();
		
		mois.add("'janvier'");
		mois.add("'février'");
		mois.add("'mars'");
		mois.add("'avril'");
		mois.add("'mai'");
		mois.add("'juin'");
		mois.add("'juillet'");
		mois.add("'août'");
		mois.add("'septembre'");
		mois.add("'octobre'");
		mois.add("'novembre'");
		mois.add("'décembre'");
		
		for(int i=0; i<requete.size(); i++){
			if(requete.get(i).equals("date")) {
				if(requete.get(i+2).length() == 4){
					requete.set(i, "jj");
					requete.add(i+4, "AND");
				}
				else if(mois.contains(requete.get(i+2))) {
					requete.set(i, "mois");
				    requete.add(i+4, "AND");
				}
				else if(requete.get(i+2).length() == 6){
					requete.set(i, "annee");
				}
			}
		}
		
	
		
		ArrayList<Integer> positionsFrom = new ArrayList<Integer>(); //Positions des "from"
		ArrayList<String> nouvelleRequete = new ArrayList<String>(); //Requete modifiée
		ArrayList<Integer> positionsWhere = new ArrayList<Integer>(); //Positions des "where"

		ArrayList<String> tables = new ArrayList<String>(); //tables appelées par la requete
		ArrayList<Integer> sizeWhere = new ArrayList<Integer>();
		
		
		//////GESTION DES FROM///////
		
		//On récupère la position de tout les from
		for(int i=0; i<requete.size(); i++){
			if(requete.get(i).equals("from")) {
				positionsFrom.add(i);
			}
		}
		
		if(positionsFrom.size() > 1){
			
		
		
		System.out.println("1" + positionsFrom);
		
		//Puis de toutes les tables (se situant juste après le from)
		for(int i=0; i<positionsFrom.size(); i++){
			tables.add(requete.get(positionsFrom.get(i)+1));
		}
		
		
		
		System.out.println(tables);
		
		//Pareil pour les where
		for(int i=0; i<requete.size(); i++){
			if(requete.get(i).equals("where")) {
				positionsWhere.add(i);
			}
		}
		
		for(int i=0; i<positionsWhere.size() - 1; i++){
			sizeWhere.add(positionsWhere.get(i+1) - positionsWhere.get(i));
		}
		
	
		
		sizeWhere.add(requete.size() - positionsWhere.get(positionsWhere.size() - 1));
		
		System.out.println("A" + sizeWhere);
		
		System.out.println("2" + positionsWhere);
		
		//On ajoute dans chaque where le nom de la table correspondante suivi du "."
	/*	for(int i=0; i<positionsWhere.size(); i++){
		//	requete.add(positionsWhere.get(i) + 3 + 2*i, tables.get(i));
		//	requete.add(positionsWhere.get(i) + 4 + 2*i, " . ");
			
			int current = positionsWhere.get(i) + 3;
			requete.set(current, tables.get(i) + "." + requete.get(current));
		}*/
		
		System.out.println("3" + requete);
		
		//On ajoute dans la nouvelle requete toute ce qui vient jusqu'au premier from
		for(int j=0; j<=positionsFrom.get(0)+1; j++){
			nouvelleRequete.add(requete.get(j));
		}
		System.out.println("4" + nouvelleRequete);
	
		positionsFrom.clear();
		
		for(int i=0; i<requete.size(); i++){
			if(requete.get(i).equals("from")) {
				positionsFrom.add(i);
			}
		}
		
		
		//On ajoute toutes les tables après le from
		for(int k=1; k<positionsFrom.size(); k++){
			nouvelleRequete.add(" , ");
			nouvelleRequete.add(requete.get(positionsFrom.get(k)+1));
		}
		System.out.println("5" + positionsWhere);
		
		//Puis on ajoute les where
		for(int i=positionsWhere.get(0); i<positionsFrom.get(1);i++){
			nouvelleRequete.add(requete.get(i));
		}
		
		System.out.println("6" + nouvelleRequete);
		
		//for(int m=1; m<=tables.size(); m++){
			for(int j=positionsWhere.get(1)+1; j<=positionsWhere.get(1)+sizeWhere.get(1)-3; j++){
				nouvelleRequete.add(requete.get(j));
			}
	//	}
			System.out.println("7" + nouvelleRequete);
		
			
			if(tables.size() == 3){
				for(int j=positionsWhere.get(2)+1; j<=positionsWhere.get(2)+sizeWhere.get(2) - 1; j++){
					nouvelleRequete.add(requete.get(j));
				}
			}
			System.out.println("8" + nouvelleRequete);
			for(int i=0; i<nouvelleRequete.size(); i++){
				if(nouvelleRequete.get(i).equals("jj")) {
					nouvelleRequete.set(i, "datearticle.jj");
				}
				if(nouvelleRequete.get(i).equals("mois")) {
					nouvelleRequete.set(i, "datearticle.mois");
				}
				if(nouvelleRequete.get(i).equals("annee")) {
					nouvelleRequete.set(i, "datearticle.annee");
				}
			}
			
			System.out.println("9" + nouvelleRequete);
			
			for(int i=0; i<nouvelleRequete.size(); i++){
				if((nouvelleRequete.get(i).equals("email")) && (nouvelleRequete.get(i+1).equals("="))) {
					nouvelleRequete.set(i, "email.email");
				}
			}
			
			System.out.println("10" + nouvelleRequete);
			
			for(int i=0; i<nouvelleRequete.size(); i++){
				if(nouvelleRequete.get(i).equals("mot")){
					nouvelleRequete.add(i+4, "OR");
				}
				if(nouvelleRequete.get(i).equals("titre")){
					nouvelleRequete.add(i+4, "OR");
				}
			}
			System.out.println("11" + nouvelleRequete);
			
			for(int i=0; i<nouvelleRequete.size(); i++){
				if((nouvelleRequete.get(i).equals("mot")) && (nouvelleRequete.get(i+1).equals("="))) {
					nouvelleRequete.set(i, "titreresume.mot");
					}
					else if((nouvelleRequete.get(i).equals("titre")) && (nouvelleRequete.get(i+1).equals("="))){
						nouvelleRequete.set(i, "titre.mot");
					}
					else if((nouvelleRequete.get(i).equals("thème")) && (nouvelleRequete.get(i+1).equals("="))){
						nouvelleRequete.set(i, "theme.mot");
					}
			}
			
			System.out.println("12" + nouvelleRequete);
			

			System.out.println("13" + nouvelleRequete);
			if(nouvelleRequete.get(nouvelleRequete.size() - 3).equals("AND")){
				nouvelleRequete.remove(nouvelleRequete.size() - 3);
			}
			
			if(nouvelleRequete.get(nouvelleRequete.size() - 1).equals("OR")){
				nouvelleRequete.remove(nouvelleRequete.size() - 1);
			}
			System.out.println("14" + nouvelleRequete);
			nouvelleRequete.set(3,tables.get(0)+"."+nouvelleRequete.get(3));
			
			nouvelleRequete.add("AND " + tables.get(0) + ".page=" + tables.get(1) + ".page");
		
			if(tables.size() == 3) {		
				nouvelleRequete.add("AND " + tables.get(1) + ".page=" + tables.get(2) + ".page");
			}
			
		
			
			
		System.out.println("Final :" + nouvelleRequete);
		

		
		positionsFrom.clear();
		positionsWhere.clear();
		tables.clear();
		requete.clear();
		}
		else {
			nouvelleRequete = requete;
		}
		
		for(int i=0; i<nouvelleRequete.size(); i++){
			if(nouvelleRequete.get(i).equals("mot")){
				nouvelleRequete.add(i+4, "OR");
			}
		}
		
		
		for(int i=0; i<nouvelleRequete.size(); i++){
			if(nouvelleRequete.get(i).equals("AND")) {
				if(nouvelleRequete.get(i+2).equals("AND")){
					nouvelleRequete.remove(i);
				}
			}
			if(nouvelleRequete.get(i).equals("OR")) {
				if(nouvelleRequete.get(i+2).equals("AND")){
					nouvelleRequete.remove(i);
				}
			}
			if(nouvelleRequete.get(i).equals("OR")) {
				if(nouvelleRequete.get(i+1).equals("OR")){
					nouvelleRequete.remove(i);
				}
			}
		}
		
		if(nouvelleRequete.get(nouvelleRequete.size() - 3).equals("OR")){
			nouvelleRequete.remove(nouvelleRequete.size() - 3);
		}
		
		if(nouvelleRequete.get(nouvelleRequete.size() - 3).equals("AND")){
			nouvelleRequete.remove(nouvelleRequete.size() - 3);
		}
		
		for(int i=nouvelleRequete.size() - 1; i>=0; i--){
			if((nouvelleRequete.get(i).equals("(")) || (nouvelleRequete.get(i).equals(")"))) {
				//System.out.println(nouvelleRequete.get(i)+"1");
				nouvelleRequete.remove(i);
			}
		}
		
		System.out.println("Sans Parenthese :" + nouvelleRequete);
		for(int i=0; i<nouvelleRequete.size(); i++){
			if((nouvelleRequete.get(i).equals("AND")) && (nouvelleRequete.get(i+1).equals("OR"))) {
				nouvelleRequete.remove(i+1);
			}
		}
		
		for(int i=0; i<nouvelleRequete.size(); i++){
			if((nouvelleRequete.get(i).equals("email.email")) || (nouvelleRequete.get(i).equals("email") && nouvelleRequete.get(i+1).equals("="))) {
				String nR = nouvelleRequete.get(i+2);
				nouvelleRequete.set(i+2, nR.substring(0,nR.length()-1) + ".fr'");
				System.out.println("nr"+nR.substring(0,nR.length()-1));
			}
		}
		/////FIN//////
		System.out.println("Final :" + nouvelleRequete);
		
		String newQuery = toString(nouvelleRequete);
		System.out.println(newQuery);
	
		return newQuery;
	}
	 	
private String toString(ArrayList<String> requete){
	String chaine = new String();
	
	for(int i = 0; i < requete.size(); i++){
		chaine = chaine + requete.get(i) + " ";
	}
	return chaine;
}
	

}