// $ANTLR 3.4 /Users/nathan/Dropbox/lo17/tal_sql.g 2012-01-09 14:05:56

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class tal_sqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARTICLE", "AUTEUR", "BREVE", "CONTENU", "COUNT", "DATE", "ET", "FOCUS", "OU", "PAGE", "POINT", "SELECT", "THEME", "TITRE", "UNE", "VAR", "WS"
    };

    public static final int EOF=-1;
    public static final int ARTICLE=4;
    public static final int AUTEUR=5;
    public static final int BREVE=6;
    public static final int CONTENU=7;
    public static final int COUNT=8;
    public static final int DATE=9;
    public static final int ET=10;
    public static final int FOCUS=11;
    public static final int OU=12;
    public static final int PAGE=13;
    public static final int POINT=14;
    public static final int SELECT=15;
    public static final int THEME=16;
    public static final int TITRE=17;
    public static final int UNE=18;
    public static final int VAR=19;
    public static final int WS=20;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public tal_sqlParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public tal_sqlParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return tal_sqlParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/nathan/Dropbox/lo17/tal_sql.g"; }



    private String rubrique = "";
    private String typeDonnees = "";
    private String choixArticlePage = "";
    private boolean count = false;




    // $ANTLR start "listerequetes"
    // /Users/nathan/Dropbox/lo17/tal_sql.g:65:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
    public final String listerequetes() throws RecognitionException {
        String sql =  "";


        Arbre r =null;


        Arbre lr_arbre;
        try {
            // /Users/nathan/Dropbox/lo17/tal_sql.g:66:25: (r= requete POINT )
            // /Users/nathan/Dropbox/lo17/tal_sql.g:67:3: r= requete POINT
            {
            pushFollow(FOLLOW_requete_in_listerequetes447);
            r=requete();

            state._fsp--;


            match(input,POINT,FOLLOW_POINT_in_listerequetes449); 


            				lr_arbre = r;
            				sql = lr_arbre.sortArbre();
            			

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return sql;
    }
    // $ANTLR end "listerequetes"



    // $ANTLR start "requete"
    // /Users/nathan/Dropbox/lo17/tal_sql.g:75:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( SELECT | COUNT ) ( ( ARTICLE | PAGE | UNE | FOCUS | BREVE ) )? ( ( ET | OU )? ( CONTENU | TITRE | DATE | AUTEUR | THEME ) (ps= params )? )* ;
    public final Arbre requete() throws RecognitionException {
        Arbre req_arbre =  new Arbre("");


        Arbre ps =null;


        Arbre ps_arbre, par2_arbre;
        try {
            // /Users/nathan/Dropbox/lo17/tal_sql.g:76:38: ( ( SELECT | COUNT ) ( ( ARTICLE | PAGE | UNE | FOCUS | BREVE ) )? ( ( ET | OU )? ( CONTENU | TITRE | DATE | AUTEUR | THEME ) (ps= params )? )* )
            // /Users/nathan/Dropbox/lo17/tal_sql.g:77:3: ( SELECT | COUNT ) ( ( ARTICLE | PAGE | UNE | FOCUS | BREVE ) )? ( ( ET | OU )? ( CONTENU | TITRE | DATE | AUTEUR | THEME ) (ps= params )? )*
            {
            // /Users/nathan/Dropbox/lo17/tal_sql.g:77:3: ( SELECT | COUNT )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==SELECT) ) {
                alt1=1;
            }
            else if ( (LA1_0==COUNT) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // /Users/nathan/Dropbox/lo17/tal_sql.g:77:4: SELECT
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete478); 


                    				req_arbre.ajouteFils(new Arbre("","select distinct"));
                    			

                    }
                    break;
                case 2 :
                    // /Users/nathan/Dropbox/lo17/tal_sql.g:81:5: COUNT
                    {
                    match(input,COUNT,FOLLOW_COUNT_in_requete491); 


                    				this.count = true;
                    			

                    }
                    break;

            }


            // /Users/nathan/Dropbox/lo17/tal_sql.g:86:3: ( ( ARTICLE | PAGE | UNE | FOCUS | BREVE ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ARTICLE||LA3_0==BREVE||LA3_0==FOCUS||LA3_0==PAGE||LA3_0==UNE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/nathan/Dropbox/lo17/tal_sql.g:87:3: ( ARTICLE | PAGE | UNE | FOCUS | BREVE )
                    {
                    // /Users/nathan/Dropbox/lo17/tal_sql.g:87:3: ( ARTICLE | PAGE | UNE | FOCUS | BREVE )
                    int alt2=5;
                    switch ( input.LA(1) ) {
                    case ARTICLE:
                        {
                        alt2=1;
                        }
                        break;
                    case PAGE:
                        {
                        alt2=2;
                        }
                        break;
                    case UNE:
                        {
                        alt2=3;
                        }
                        break;
                    case FOCUS:
                        {
                        alt2=4;
                        }
                        break;
                    case BREVE:
                        {
                        alt2=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;

                    }

                    switch (alt2) {
                        case 1 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:87:4: ARTICLE
                            {
                            match(input,ARTICLE,FOLLOW_ARTICLE_in_requete509); 


                            				if(this.count == false)
                            				{
                            					req_arbre.ajouteFils(new Arbre("","page"));
                            				}
                            				else
                            				{
                            					req_arbre.ajouteFils(new Arbre("","select count(distinct article)"));
                            					req_arbre.ajouteFils(new Arbre("","from titreresume"));	
                            				}
                            				this.choixArticlePage = "article";
                            			

                            }
                            break;
                        case 2 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:100:6: PAGE
                            {
                            match(input,PAGE,FOLLOW_PAGE_in_requete521); 


                            				if(this.count == false)
                            				{
                            					req_arbre.ajouteFils(new Arbre("","page"));
                            				}
                            				else
                            				{
                            					req_arbre.ajouteFils(new Arbre("","select count(distinct page)"));
                            					req_arbre.ajouteFils(new Arbre("","from datepage"));	
                            				}
                            				this.choixArticlePage = "page";
                            			

                            }
                            break;
                        case 3 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:113:6: UNE
                            {
                            match(input,UNE,FOLLOW_UNE_in_requete533); 


                            		 		if(this.count == false)
                            		 		{
                            		 			req_arbre.ajouteFils(new Arbre("","page"));
                            		 		}
                            		 		else
                            		 		{
                            		 			req_arbre.ajouteFils(new Arbre("","select count(distinct article)"));
                            		 			req_arbre.ajouteFils(new Arbre("","from titreresume"));
                            		 		}
                            		 		this.rubrique = "une";
                            		 	

                            }
                            break;
                        case 4 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:126:6: FOCUS
                            {
                            match(input,FOCUS,FOLLOW_FOCUS_in_requete546); 


                            		 		if(this.count == false)
                            		 		{
                            		 			req_arbre.ajouteFils(new Arbre("","page"));
                            		 		}
                            		 		else
                            		 		{
                            		 			req_arbre.ajouteFils(new Arbre("","select count(distinct article)"));
                            		 			req_arbre.ajouteFils(new Arbre("","from titreresume"));
                            		 		}
                            		 		this.rubrique = "focus";
                            		 	

                            }
                            break;
                        case 5 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:139:6: BREVE
                            {
                            match(input,BREVE,FOLLOW_BREVE_in_requete559); 


                            		 		if(this.count == false)
                            		 		{
                            		 			req_arbre.ajouteFils(new Arbre("","page"));
                            		 		}
                            		 		else
                            		 		{
                            		 			req_arbre.ajouteFils(new Arbre("","select count(distinct article)"));
                            		 			req_arbre.ajouteFils(new Arbre("","from titreresume"));
                            		 		}
                            		 		this.rubrique = "breve";
                            		 	

                            }
                            break;

                    }


                    }
                    break;

            }


            // /Users/nathan/Dropbox/lo17/tal_sql.g:154:3: ( ( ET | OU )? ( CONTENU | TITRE | DATE | AUTEUR | THEME ) (ps= params )? )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==AUTEUR||LA7_0==CONTENU||(LA7_0 >= DATE && LA7_0 <= ET)||LA7_0==OU||(LA7_0 >= THEME && LA7_0 <= TITRE)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/nathan/Dropbox/lo17/tal_sql.g:155:3: ( ET | OU )? ( CONTENU | TITRE | DATE | AUTEUR | THEME ) (ps= params )?
            	    {
            	    // /Users/nathan/Dropbox/lo17/tal_sql.g:155:3: ( ET | OU )?
            	    int alt4=3;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==ET) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==OU) ) {
            	        alt4=2;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // /Users/nathan/Dropbox/lo17/tal_sql.g:155:4: ET
            	            {
            	            match(input,ET,FOLLOW_ET_in_requete584); 


            	            				req_arbre.ajouteFils(new Arbre("", "AND"));
            	            			

            	            }
            	            break;
            	        case 2 :
            	            // /Users/nathan/Dropbox/lo17/tal_sql.g:159:5: OU
            	            {
            	            match(input,OU,FOLLOW_OU_in_requete596); 


            	            				req_arbre.ajouteFils(new Arbre("", "OR"));
            	            			

            	            }
            	            break;

            	    }


            	    // /Users/nathan/Dropbox/lo17/tal_sql.g:164:3: ( CONTENU | TITRE | DATE | AUTEUR | THEME )
            	    int alt5=5;
            	    switch ( input.LA(1) ) {
            	    case CONTENU:
            	        {
            	        alt5=1;
            	        }
            	        break;
            	    case TITRE:
            	        {
            	        alt5=2;
            	        }
            	        break;
            	    case DATE:
            	        {
            	        alt5=3;
            	        }
            	        break;
            	    case AUTEUR:
            	        {
            	        alt5=4;
            	        }
            	        break;
            	    case THEME:
            	        {
            	        alt5=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt5) {
            	        case 1 :
            	            // /Users/nathan/Dropbox/lo17/tal_sql.g:164:4: CONTENU
            	            {
            	            match(input,CONTENU,FOLLOW_CONTENU_in_requete611); 


            	            				if(this.count == false || this.typeDonnees.length() > 0)
            	            		 		{
            	            		 			req_arbre.ajouteFils(new Arbre("","from titreresume"));
            	            					req_arbre.ajouteFils(new Arbre("","where"));
            	            				}
            	            				else
            	            				{
            	            					req_arbre.ajouteFils(new Arbre("","where"));
            	            				}
            	            				this.typeDonnees="mot";
            	            			

            	            }
            	            break;
            	        case 2 :
            	            // /Users/nathan/Dropbox/lo17/tal_sql.g:177:5: TITRE
            	            {
            	            match(input,TITRE,FOLLOW_TITRE_in_requete622); 


            	            				if(this.count == false)
            	            		 		{
            	            		 			req_arbre.ajouteFils(new Arbre("","from titre"));
            	            					req_arbre.ajouteFils(new Arbre("","where"));
            	            				}
            	            				else
            	            				{
            	            					req_arbre.ajouteFils(new Arbre("","where"));
            	            				}
            	            				this.typeDonnees="titre";
            	            			

            	            }
            	            break;
            	        case 3 :
            	            // /Users/nathan/Dropbox/lo17/tal_sql.g:190:5: DATE
            	            {
            	            match(input,DATE,FOLLOW_DATE_in_requete633); 


            	            				if(this.count == false)
            	            		 		{
            	            		 			if(this.choixArticlePage.equals("article"))
            	            		 			{
            	            		 				req_arbre.ajouteFils(new Arbre("","from datearticle"));
            	            		 			}
            	            		 			else
            	            		 			{
            	            		 				req_arbre.ajouteFils(new Arbre("","from datepage"));
            	            		 			}
            	            					req_arbre.ajouteFils(new Arbre("","where"));
            	            				}
            	            				else
            	            				{
            	            					req_arbre.ajouteFils(new Arbre("","where"));
            	            				}
            	            				this.typeDonnees="date";
            	            			

            	            }
            	            break;
            	        case 4 :
            	            // /Users/nathan/Dropbox/lo17/tal_sql.g:210:5: AUTEUR
            	            {
            	            match(input,AUTEUR,FOLLOW_AUTEUR_in_requete644); 


            	            				if(this.count == false)
            	            		 		{
            	            		 			req_arbre.ajouteFils(new Arbre("","from email"));
            	            					req_arbre.ajouteFils(new Arbre("","where"));
            	            				}
            	            				else
            	            				{
            	            					req_arbre.ajouteFils(new Arbre("","select count(distinct email)"));
            	            					req_arbre.ajouteFils(new Arbre("","from email"));
            	            				}
            	            				this.typeDonnees="email";
            	            			

            	            }
            	            break;
            	        case 5 :
            	            // /Users/nathan/Dropbox/lo17/tal_sql.g:224:5: THEME
            	            {
            	            match(input,THEME,FOLLOW_THEME_in_requete655); 


            	            				if(this.count == false)
            	            		 		{
            	            		 			req_arbre.ajouteFils(new Arbre("","from theme"));
            	            					req_arbre.ajouteFils(new Arbre("","where"));
            	            				}
            	            				else
            	            				{
            	            					req_arbre.ajouteFils(new Arbre("","select count(distinct theme)"));
            	            					req_arbre.ajouteFils(new Arbre("","from theme"));
            	            				}
            	            				this.typeDonnees="mot";
            	            			

            	            }
            	            break;

            	    }


            	    // /Users/nathan/Dropbox/lo17/tal_sql.g:240:3: (ps= params )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==VAR) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // /Users/nathan/Dropbox/lo17/tal_sql.g:240:4: ps= params
            	            {
            	            pushFollow(FOLLOW_params_in_requete676);
            	            ps=params();

            	            state._fsp--;



            	            				ps_arbre = ps;
            	            				req_arbre.ajouteFils(ps_arbre);
            	            			

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return req_arbre;
    }
    // $ANTLR end "requete"



    // $ANTLR start "params"
    // /Users/nathan/Dropbox/lo17/tal_sql.g:251:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : (par1= param )+ ( ( OU par2= param | ET par2= param ) )* ;
    public final Arbre params() throws RecognitionException {
        Arbre les_pars_arbre =  new Arbre("");


        Arbre par1 =null;

        Arbre par2 =null;


        Arbre par1_arbre, par2_arbre;
        try {
            // /Users/nathan/Dropbox/lo17/tal_sql.g:252:40: ( (par1= param )+ ( ( OU par2= param | ET par2= param ) )* )
            // /Users/nathan/Dropbox/lo17/tal_sql.g:253:3: (par1= param )+ ( ( OU par2= param | ET par2= param ) )*
            {
            // /Users/nathan/Dropbox/lo17/tal_sql.g:253:3: (par1= param )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==VAR) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/nathan/Dropbox/lo17/tal_sql.g:253:4: par1= param
            	    {
            	    pushFollow(FOLLOW_param_in_params721);
            	    par1=param();

            	    state._fsp--;



            	    				par1_arbre = par1;
            	    				les_pars_arbre.ajouteFils(par1_arbre);
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            // /Users/nathan/Dropbox/lo17/tal_sql.g:259:3: ( ( OU par2= param | ET par2= param ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ET) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==VAR) ) {
                        alt10=1;
                    }


                }
                else if ( (LA10_0==OU) ) {
                    int LA10_3 = input.LA(2);

                    if ( (LA10_3==VAR) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // /Users/nathan/Dropbox/lo17/tal_sql.g:259:4: ( OU par2= param | ET par2= param )
            	    {
            	    // /Users/nathan/Dropbox/lo17/tal_sql.g:259:4: ( OU par2= param | ET par2= param )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==OU) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==ET) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // /Users/nathan/Dropbox/lo17/tal_sql.g:259:5: OU par2= param
            	            {
            	            match(input,OU,FOLLOW_OU_in_params745); 

            	            pushFollow(FOLLOW_param_in_params751);
            	            par2=param();

            	            state._fsp--;



            	            				par2_arbre = par2;
            	            				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
            	            				les_pars_arbre.ajouteFils(par2_arbre);
            	            			

            	            }
            	            break;
            	        case 2 :
            	            // /Users/nathan/Dropbox/lo17/tal_sql.g:265:5: ET par2= param
            	            {
            	            match(input,ET,FOLLOW_ET_in_params762); 

            	            pushFollow(FOLLOW_param_in_params768);
            	            par2=param();

            	            state._fsp--;



            	            				par2_arbre = par2;
            	            				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
            	            				les_pars_arbre.ajouteFils(par2_arbre);
            	            			

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return les_pars_arbre;
    }
    // $ANTLR end "params"



    // $ANTLR start "param"
    // /Users/nathan/Dropbox/lo17/tal_sql.g:275:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
    public final Arbre param() throws RecognitionException {
        Arbre lepar_arbre =  new Arbre("");


        Token a=null;

        try {
            // /Users/nathan/Dropbox/lo17/tal_sql.g:275:51: (a= VAR )
            // /Users/nathan/Dropbox/lo17/tal_sql.g:276:2: a= VAR
            {
            a=(Token)match(input,VAR,FOLLOW_VAR_in_param800); 

             
            			lepar_arbre.ajouteFils(new Arbre(this.typeDonnees+" =", "'"+a.getText()+"'"));
            			if(this.rubrique.length() != 0)
            			{
            				lepar_arbre.ajouteFils(new Arbre("", "AND"));
            				lepar_arbre.ajouteFils(new Arbre("","rubrique = "+"'"+rubrique+"'"));
            				this.rubrique="";
            			}
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return lepar_arbre;
    }
    // $ANTLR end "param"

    // Delegated rules


 

    public static final BitSet FOLLOW_requete_in_listerequetes447 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_POINT_in_listerequetes449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete478 = new BitSet(new long[]{0x0000000000073EF2L});
    public static final BitSet FOLLOW_COUNT_in_requete491 = new BitSet(new long[]{0x0000000000073EF2L});
    public static final BitSet FOLLOW_ARTICLE_in_requete509 = new BitSet(new long[]{0x00000000000316A2L});
    public static final BitSet FOLLOW_PAGE_in_requete521 = new BitSet(new long[]{0x00000000000316A2L});
    public static final BitSet FOLLOW_UNE_in_requete533 = new BitSet(new long[]{0x00000000000316A2L});
    public static final BitSet FOLLOW_FOCUS_in_requete546 = new BitSet(new long[]{0x00000000000316A2L});
    public static final BitSet FOLLOW_BREVE_in_requete559 = new BitSet(new long[]{0x00000000000316A2L});
    public static final BitSet FOLLOW_ET_in_requete584 = new BitSet(new long[]{0x00000000000302A0L});
    public static final BitSet FOLLOW_OU_in_requete596 = new BitSet(new long[]{0x00000000000302A0L});
    public static final BitSet FOLLOW_CONTENU_in_requete611 = new BitSet(new long[]{0x00000000000B16A2L});
    public static final BitSet FOLLOW_TITRE_in_requete622 = new BitSet(new long[]{0x00000000000B16A2L});
    public static final BitSet FOLLOW_DATE_in_requete633 = new BitSet(new long[]{0x00000000000B16A2L});
    public static final BitSet FOLLOW_AUTEUR_in_requete644 = new BitSet(new long[]{0x00000000000B16A2L});
    public static final BitSet FOLLOW_THEME_in_requete655 = new BitSet(new long[]{0x00000000000B16A2L});
    public static final BitSet FOLLOW_params_in_requete676 = new BitSet(new long[]{0x00000000000316A2L});
    public static final BitSet FOLLOW_param_in_params721 = new BitSet(new long[]{0x0000000000081402L});
    public static final BitSet FOLLOW_OU_in_params745 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_param_in_params751 = new BitSet(new long[]{0x0000000000001402L});
    public static final BitSet FOLLOW_ET_in_params762 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_param_in_params768 = new BitSet(new long[]{0x0000000000001402L});
    public static final BitSet FOLLOW_VAR_in_param800 = new BitSet(new long[]{0x0000000000000002L});

}