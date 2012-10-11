grammar tal_sql;

@members{

private String rubrique = "";
private String typeDonnees = "";
private boolean count = false;

}

SELECT : 'commande'
;

COUNT : 'combien'
;	

ARTICLE : 'article' | 'articles'
;

PAGE : 'page' | 'pages'
;

UNE : 'une'
;

FOCUS :	'focus'
;

TITRE : 'titre' | 'titres'
;

EMAIL : 'adress' | 'écrit' | 'auteur'
;

THEME : 'thème'
;

BREVE : 'brève' | 'brèves'
;		

ET : 'et'
;

OU : 'ou'
;	

POINT : '.' | '?'
;

CONTENU : 'pivot'
;

DATE : 'date'
;	

WS  : (' ' |'\t' | '\r' | 'je' | 'j\'' | 'qui' | 'que' | 'quoi' | 'où' | 'dont' | 'de' | 'des' | 'du' | 'd\'' | 'le' | 'les' | 'la' | 'l\'' | 'tout' | 'tous' | 'toute' | 'toutes' 
        | 'dans' | 'par' | 'est' | 'sont' | 'liste' | 'y' | 't' | 'il' | 'a' | '-') {skip();} | '\n' 
;

VAR 	: ('A'..'Z' | 'a'..'z') ('a'..'z')*('0'..'9')*('@')?('a'..'z')*('0'..'9')* | ('0'..'9')*('/')?('0'..'9')*('/')?('0'..'9')* //| ('a'..'z')*('@')?('a'..'z')*
//('A'..'Z' | 'a'..'z')('a'..'z')+('0'..'9')*('@')?('a'..'z')*
;

listerequetes returns [String sql = ""]
	@init	{Arbre lr_arbre;}: 
		r = requete POINT
			{
				lr_arbre = $r.req_arbre;
				sql = lr_arbre.sortArbre();
			}
;


requete returns [Arbre req_arbre = new Arbre("")]
	@init {Arbre ps_arbre, par2_arbre;} : 
		(SELECT 
			{
				req_arbre.ajouteFils(new Arbre("","select distinct"));
			} 
		| COUNT
			{
				req_arbre.ajouteFils(new Arbre("","select count(*)"));
				this.count = true;
			}
		)
		(
		(ARTICLE
			{
				if(this.count == false)
				{
					req_arbre.ajouteFils(new Arbre("","article"));
				}
			}
		 | PAGE
			{
				if(this.count == false)
				{
					req_arbre.ajouteFils(new Arbre("","page"));
				}
			}
		 | UNE
		 	{
		 		if(this.count == false)
		 		{
		 			req_arbre.ajouteFils(new Arbre("","une"));
		 		}
		 		this.rubrique = "une";
		 	}
		 | FOCUS
		 	{
		 		if(this.count == false)
		 		{
		 			req_arbre.ajouteFils(new Arbre("","focus"));
		 		}
		 		this.rubrique = "focus";
		 	}
		 | BREVE
		 	{
		 		if(this.count == false)
		 		{
		 			req_arbre.ajouteFils(new Arbre("","breve"));
		 		}
		 		this.rubrique = "brève";
		 	}
		 )
		)?
		(
		(ET 
			{
				req_arbre.ajouteFils(new Arbre("", "AND"));
			}
		| OU
			{
				req_arbre.ajouteFils(new Arbre("", "OR"));
			}
		)*
		(CONTENU
			{
				req_arbre.ajouteFils(new Arbre("","from tableResume"));
				if(this.count == false)
		 		{
					req_arbre.ajouteFils(new Arbre("","where"));
				}
				this.typeDonnees="mot";
			}
		| TITRE
			{
				req_arbre.ajouteFils(new Arbre("","from tableTitre"));
				if(this.count == false)
		 		{
					req_arbre.ajouteFils(new Arbre("","where"));
				}
				this.typeDonnees="titre";
			}
		| DATE
			{
				req_arbre.ajouteFils(new Arbre("","from datepage"));
				if(this.count == false)
		 		{
					req_arbre.ajouteFils(new Arbre("","where"));
				}
				this.typeDonnees="date";
			}
		| EMAIL
			{
				req_arbre.ajouteFils(new Arbre("","from email"));
				if(this.count == false)
		 		{
					req_arbre.ajouteFils(new Arbre("","where"));
				}
				this.typeDonnees="email";
			}
		| THEME
			{
				req_arbre.ajouteFils(new Arbre("","from theme"));
				if(this.count == false)
		 		{
					req_arbre.ajouteFils(new Arbre("","where"));
				}
				this.typeDonnees="theme";
			}
		)
		
		(ps = params 
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
		)?
		)*
;



params returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = param 
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		((OU par2 = param
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		| ET par2 = param
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		
		))*
;

param returns [Arbre lepar_arbre = new Arbre("")] :
	a = VAR
		{ 
			lepar_arbre.ajouteFils(new Arbre(this.typeDonnees+" =", "'"+a.getText()+"'"));
			if(this.rubrique.length() != 0)
			{
				lepar_arbre.ajouteFils(new Arbre("", "AND"));
				lepar_arbre.ajouteFils(new Arbre("","rubrique="+"'"+rubrique+"'"));
				this.rubrique="";
			}
		}
;

