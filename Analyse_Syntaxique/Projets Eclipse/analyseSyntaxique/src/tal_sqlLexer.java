// $ANTLR 3.4 /Users/nathan/Dropbox/lo17/tal_sql.g 2012-01-09 14:05:56

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class tal_sqlLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public tal_sqlLexer() {} 
    public tal_sqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public tal_sqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/nathan/Dropbox/lo17/tal_sql.g"; }

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nathan/Dropbox/lo17/tal_sql.g:12:8: ( 'commande' )
            // /Users/nathan/Dropbox/lo17/tal_sql.g:12:10: 'commande'
            {
            match("commande"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "COUNT"
    public final void mCOUNT() throws RecognitionException {
        try {
            int _type = COUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nathan/Dropbox/lo17/tal_sql.g:15:7: ( 'combien' )
            // /Users/nathan/Dropbox/lo17/tal_sql.g:15:9: 'combien'
            {
            match("combien"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COUNT"

    // $ANTLR start "ARTICLE"
    public final void mARTICLE() throws RecognitionException {
        try {
            int _type = ARTICLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nathan/Dropbox/lo17/tal_sql.g:18:9: ( 'article' | 'articles' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='a') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='r') ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2=='t') ) {
                        int LA1_3 = input.LA(4);

                        if ( (LA1_3=='i') ) {
                            int LA1_4 = input.LA(5);

                            if ( (LA1_4=='c') ) {
                                int LA1_5 = input.LA(6);

                                if ( (LA1_5=='l') ) {
                                    int LA1_6 = input.LA(7);

                                    if ( (LA1_6=='e') ) {
                                        int LA1_7 = input.LA(8);

                                        if ( (LA1_7=='s') ) {
                                            alt1=2;
                                        }
                                        else {
                                            alt1=1;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 1, 6, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 1, 5, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 4, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // /Users/nathan/Dropbox/lo17/tal_sql.g:18:11: 'article'
                    {
                    match("article"); 



                    }
                    break;
                case 2 :
                    // /Users/nathan/Dropbox/lo17/tal_sql.g:18:23: 'articles'
                    {
                    match("articles"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARTICLE"

    // $ANTLR start "PAGE"
    public final void mPAGE() throws RecognitionException {
        try {
            int _type = PAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nathan/Dropbox/lo17/tal_sql.g:21:6: ( 'page' | 'pages' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='p') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='a') ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2=='g') ) {
                        int LA2_3 = input.LA(4);

                        if ( (LA2_3=='e') ) {
                            int LA2_4 = input.LA(5);

                            if ( (LA2_4=='s') ) {
                                alt2=2;
                            }
                            else {
                                alt2=1;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /Users/nathan/Dropbox/lo17/tal_sql.g:21:8: 'page'
                    {
                    match("page"); 



                    }
                    break;
                case 2 :
                    // /Users/nathan/Dropbox/lo17/tal_sql.g:21:17: 'pages'
                    {
                    match("pages"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PAGE"

    // $ANTLR start "UNE"
    public final void mUNE() throws RecognitionException {
        try {
            int _type = UNE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nathan/Dropbox/lo17/tal_sql.g:24:5: ( 'une' )
            // /Users/nathan/Dropbox/lo17/tal_sql.g:24:7: 'une'
            {
            match("une"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNE"

    // $ANTLR start "FOCUS"
    public final void mFOCUS() throws RecognitionException {
        try {
            int _type = FOCUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nathan/Dropbox/lo17/tal_sql.g:27:7: ( 'focus' )
            // /Users/nathan/Dropbox/lo17/tal_sql.g:27:9: 'focus'
            {
            match("focus"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOCUS"

    // $ANTLR start "TITRE"
    public final void mTITRE() throws RecognitionException {
        try {
            int _type = TITRE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nathan/Dropbox/lo17/tal_sql.g:30:7: ( 'titre' | 'titres' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='t') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='i') ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2=='t') ) {
                        int LA3_3 = input.LA(4);

                        if ( (LA3_3=='r') ) {
                            int LA3_4 = input.LA(5);

                            if ( (LA3_4=='e') ) {
                                int LA3_5 = input.LA(6);

                                if ( (LA3_5=='s') ) {
                                    alt3=2;
                                }
                                else {
                                    alt3=1;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 4, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /Users/nathan/Dropbox/lo17/tal_sql.g:30:9: 'titre'
                    {
                    match("titre"); 



                    }
                    break;
                case 2 :
                    // /Users/nathan/Dropbox/lo17/tal_sql.g:30:19: 'titres'
                    {
                    match("titres"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TITRE"

    // $ANTLR start "AUTEUR"
    public final void mAUTEUR() throws RecognitionException {
        try {
            int _type = AUTEUR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nathan/Dropbox/lo17/tal_sql.g:33:8: ( 'adress' | 'Žcrit' | 'auteur' )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='a') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='d') ) {
                    alt4=1;
                }
                else if ( (LA4_1=='u') ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA4_0=='\u00E9') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /Users/nathan/Dropbox/lo17/tal_sql.g:33:10: 'adress'
                    {
                    match("adress"); 



                    }
                    break;
                case 2 :
                    // /Users/nathan/Dropbox/lo17/tal_sql.g:33:21: 'Žcrit'
                    {
                    match("Žcrit"); 



                    }
                    break;
                case 3 :
                    // /Users/nathan/Dropbox/lo17/tal_sql.g:33:31: 'auteur'
                    {
                    match("auteur"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AUTEUR"

    // $ANTLR start "THEME"
    public final void mTHEME() throws RecognitionException {
        try {
            int _type = THEME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nathan/Dropbox/lo17/tal_sql.g:36:7: ( 'thme' )
            // /Users/nathan/Dropbox/lo17/tal_sql.g:36:9: 'thme'
            {
            match("thme"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THEME"

    // $ANTLR start "BREVE"
    public final void mBREVE() throws RecognitionException {
        try {
            int _type = BREVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nathan/Dropbox/lo17/tal_sql.g:39:7: ( 'brve' | 'brves' | 'rappel' )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='b') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='r') ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3=='\u00E8') ) {
                        int LA5_4 = input.LA(4);

                        if ( (LA5_4=='v') ) {
                            int LA5_5 = input.LA(5);

                            if ( (LA5_5=='e') ) {
                                int LA5_6 = input.LA(6);

                                if ( (LA5_6=='s') ) {
                                    alt5=2;
                                }
                                else {
                                    alt5=1;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 5, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 4, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA5_0=='r') ) {
                alt5=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /Users/nathan/Dropbox/lo17/tal_sql.g:39:9: 'brve'
                    {
                    match("brve"); 



                    }
                    break;
                case 2 :
                    // /Users/nathan/Dropbox/lo17/tal_sql.g:39:19: 'brves'
                    {
                    match("brves"); 



                    }
                    break;
                case 3 :
                    // /Users/nathan/Dropbox/lo17/tal_sql.g:39:30: 'rappel'
                    {
                    match("rappel"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BREVE"

    // $ANTLR start "ET"
    public final void mET() throws RecognitionException {
        try {
            int _type = ET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nathan/Dropbox/lo17/tal_sql.g:42:4: ( 'et' )
            // /Users/nathan/Dropbox/lo17/tal_sql.g:42:6: 'et'
            {
            match("et"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ET"

    // $ANTLR start "OU"
    public final void mOU() throws RecognitionException {
        try {
            int _type = OU;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nathan/Dropbox/lo17/tal_sql.g:45:4: ( 'ou' )
            // /Users/nathan/Dropbox/lo17/tal_sql.g:45:6: 'ou'
            {
            match("ou"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OU"

    // $ANTLR start "POINT"
    public final void mPOINT() throws RecognitionException {
        try {
            int _type = POINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nathan/Dropbox/lo17/tal_sql.g:48:7: ( '.' | '?' )
            // /Users/nathan/Dropbox/lo17/tal_sql.g:
            {
            if ( input.LA(1)=='.'||input.LA(1)=='?' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POINT"

    // $ANTLR start "CONTENU"
    public final void mCONTENU() throws RecognitionException {
        try {
            int _type = CONTENU;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nathan/Dropbox/lo17/tal_sql.g:51:9: ( 'pivot' )
            // /Users/nathan/Dropbox/lo17/tal_sql.g:51:11: 'pivot'
            {
            match("pivot"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONTENU"

    // $ANTLR start "DATE"
    public final void mDATE() throws RecognitionException {
        try {
            int _type = DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nathan/Dropbox/lo17/tal_sql.g:54:6: ( 'date' )
            // /Users/nathan/Dropbox/lo17/tal_sql.g:54:8: 'date'
            {
            match("date"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DATE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nathan/Dropbox/lo17/tal_sql.g:57:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'j\\'' | 'qui' | 'que' | 'quoi' | 'o' | 'dont' | 'de' | 'des' | 'du' | 'd\\'' | 'le' | 'les' | 'la' | 'l\\'' | 'tout' | 'tous' | 'toute' | 'toutes' | 'dans' | 'par' | 'est' | 'sont' | 'liste' | 'y' | 't' | 'il' | 'a' | '-' | 'mot' | 'mots' ) | '\\n' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\t'||LA7_0=='\r'||LA7_0==' '||LA7_0=='-'||LA7_0=='a'||(LA7_0 >= 'd' && LA7_0 <= 'e')||(LA7_0 >= 'i' && LA7_0 <= 'j')||(LA7_0 >= 'l' && LA7_0 <= 'm')||(LA7_0 >= 'o' && LA7_0 <= 'q')||(LA7_0 >= 's' && LA7_0 <= 't')||LA7_0=='y') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\n') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /Users/nathan/Dropbox/lo17/tal_sql.g:57:7: ( ' ' | '\\t' | '\\r' | 'je' | 'j\\'' | 'qui' | 'que' | 'quoi' | 'o' | 'dont' | 'de' | 'des' | 'du' | 'd\\'' | 'le' | 'les' | 'la' | 'l\\'' | 'tout' | 'tous' | 'toute' | 'toutes' | 'dans' | 'par' | 'est' | 'sont' | 'liste' | 'y' | 't' | 'il' | 'a' | '-' | 'mot' | 'mots' )
                    {
                    // /Users/nathan/Dropbox/lo17/tal_sql.g:57:7: ( ' ' | '\\t' | '\\r' | 'je' | 'j\\'' | 'qui' | 'que' | 'quoi' | 'o' | 'dont' | 'de' | 'des' | 'du' | 'd\\'' | 'le' | 'les' | 'la' | 'l\\'' | 'tout' | 'tous' | 'toute' | 'toutes' | 'dans' | 'par' | 'est' | 'sont' | 'liste' | 'y' | 't' | 'il' | 'a' | '-' | 'mot' | 'mots' )
                    int alt6=34;
                    switch ( input.LA(1) ) {
                    case ' ':
                        {
                        alt6=1;
                        }
                        break;
                    case '\t':
                        {
                        alt6=2;
                        }
                        break;
                    case '\r':
                        {
                        alt6=3;
                        }
                        break;
                    case 'j':
                        {
                        int LA6_4 = input.LA(2);

                        if ( (LA6_4=='e') ) {
                            alt6=4;
                        }
                        else if ( (LA6_4=='\'') ) {
                            alt6=5;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;

                        }
                        }
                        break;
                    case 'q':
                        {
                        int LA6_5 = input.LA(2);

                        if ( (LA6_5=='u') ) {
                            switch ( input.LA(3) ) {
                            case 'i':
                                {
                                alt6=6;
                                }
                                break;
                            case 'e':
                                {
                                alt6=7;
                                }
                                break;
                            case 'o':
                                {
                                alt6=8;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 20, input);

                                throw nvae;

                            }

                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 5, input);

                            throw nvae;

                        }
                        }
                        break;
                    case 'o':
                        {
                        alt6=9;
                        }
                        break;
                    case 'd':
                        {
                        switch ( input.LA(2) ) {
                        case 'o':
                            {
                            alt6=10;
                            }
                            break;
                        case 'e':
                            {
                            int LA6_22 = input.LA(3);

                            if ( (LA6_22=='s') ) {
                                alt6=12;
                            }
                            else {
                                alt6=11;
                            }
                            }
                            break;
                        case 'u':
                            {
                            alt6=13;
                            }
                            break;
                        case '\'':
                            {
                            alt6=14;
                            }
                            break;
                        case 'a':
                            {
                            alt6=23;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 7, input);

                            throw nvae;

                        }

                        }
                        break;
                    case 'l':
                        {
                        switch ( input.LA(2) ) {
                        case 'e':
                            {
                            int LA6_26 = input.LA(3);

                            if ( (LA6_26=='s') ) {
                                alt6=16;
                            }
                            else {
                                alt6=15;
                            }
                            }
                            break;
                        case 'a':
                            {
                            alt6=17;
                            }
                            break;
                        case '\'':
                            {
                            alt6=18;
                            }
                            break;
                        case 'i':
                            {
                            alt6=27;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 8, input);

                            throw nvae;

                        }

                        }
                        break;
                    case 't':
                        {
                        int LA6_9 = input.LA(2);

                        if ( (LA6_9=='o') ) {
                            int LA6_30 = input.LA(3);

                            if ( (LA6_30=='u') ) {
                                int LA6_40 = input.LA(4);

                                if ( (LA6_40=='t') ) {
                                    int LA6_42 = input.LA(5);

                                    if ( (LA6_42=='e') ) {
                                        int LA6_46 = input.LA(6);

                                        if ( (LA6_46=='s') ) {
                                            alt6=22;
                                        }
                                        else {
                                            alt6=21;
                                        }
                                    }
                                    else {
                                        alt6=19;
                                    }
                                }
                                else if ( (LA6_40=='s') ) {
                                    alt6=20;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 6, 40, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 30, input);

                                throw nvae;

                            }
                        }
                        else {
                            alt6=29;
                        }
                        }
                        break;
                    case 'p':
                        {
                        alt6=24;
                        }
                        break;
                    case 'e':
                        {
                        alt6=25;
                        }
                        break;
                    case 's':
                        {
                        alt6=26;
                        }
                        break;
                    case 'y':
                        {
                        alt6=28;
                        }
                        break;
                    case 'i':
                        {
                        alt6=30;
                        }
                        break;
                    case 'a':
                        {
                        alt6=31;
                        }
                        break;
                    case '-':
                        {
                        alt6=32;
                        }
                        break;
                    case 'm':
                        {
                        int LA6_17 = input.LA(2);

                        if ( (LA6_17=='o') ) {
                            int LA6_32 = input.LA(3);

                            if ( (LA6_32=='t') ) {
                                int LA6_41 = input.LA(4);

                                if ( (LA6_41=='s') ) {
                                    alt6=34;
                                }
                                else {
                                    alt6=33;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 32, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 17, input);

                            throw nvae;

                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;

                    }

                    switch (alt6) {
                        case 1 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:57:8: ' '
                            {
                            match(' '); 

                            }
                            break;
                        case 2 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:57:13: '\\t'
                            {
                            match('\t'); 

                            }
                            break;
                        case 3 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:57:20: '\\r'
                            {
                            match('\r'); 

                            }
                            break;
                        case 4 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:57:27: 'je'
                            {
                            match("je"); 



                            }
                            break;
                        case 5 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:57:34: 'j\\''
                            {
                            match("j'"); 



                            }
                            break;
                        case 6 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:57:42: 'qui'
                            {
                            match("qui"); 



                            }
                            break;
                        case 7 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:57:50: 'que'
                            {
                            match("que"); 



                            }
                            break;
                        case 8 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:57:58: 'quoi'
                            {
                            match("quoi"); 



                            }
                            break;
                        case 9 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:57:67: 'o'
                            {
                            match("o"); 



                            }
                            break;
                        case 10 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:57:74: 'dont'
                            {
                            match("dont"); 



                            }
                            break;
                        case 11 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:57:83: 'de'
                            {
                            match("de"); 



                            }
                            break;
                        case 12 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:57:90: 'des'
                            {
                            match("des"); 



                            }
                            break;
                        case 13 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:57:98: 'du'
                            {
                            match("du"); 



                            }
                            break;
                        case 14 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:57:105: 'd\\''
                            {
                            match("d'"); 



                            }
                            break;
                        case 15 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:57:113: 'le'
                            {
                            match("le"); 



                            }
                            break;
                        case 16 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:57:120: 'les'
                            {
                            match("les"); 



                            }
                            break;
                        case 17 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:57:128: 'la'
                            {
                            match("la"); 



                            }
                            break;
                        case 18 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:57:135: 'l\\''
                            {
                            match("l'"); 



                            }
                            break;
                        case 19 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:57:143: 'tout'
                            {
                            match("tout"); 



                            }
                            break;
                        case 20 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:57:152: 'tous'
                            {
                            match("tous"); 



                            }
                            break;
                        case 21 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:57:161: 'toute'
                            {
                            match("toute"); 



                            }
                            break;
                        case 22 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:57:171: 'toutes'
                            {
                            match("toutes"); 



                            }
                            break;
                        case 23 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:58:11: 'dans'
                            {
                            match("dans"); 



                            }
                            break;
                        case 24 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:58:20: 'par'
                            {
                            match("par"); 



                            }
                            break;
                        case 25 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:58:28: 'est'
                            {
                            match("est"); 



                            }
                            break;
                        case 26 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:58:36: 'sont'
                            {
                            match("sont"); 



                            }
                            break;
                        case 27 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:58:45: 'liste'
                            {
                            match("liste"); 



                            }
                            break;
                        case 28 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:58:55: 'y'
                            {
                            match('y'); 

                            }
                            break;
                        case 29 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:58:61: 't'
                            {
                            match('t'); 

                            }
                            break;
                        case 30 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:58:67: 'il'
                            {
                            match("il"); 



                            }
                            break;
                        case 31 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:58:74: 'a'
                            {
                            match('a'); 

                            }
                            break;
                        case 32 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:58:80: '-'
                            {
                            match('-'); 

                            }
                            break;
                        case 33 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:58:86: 'mot'
                            {
                            match("mot"); 



                            }
                            break;
                        case 34 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:58:94: 'mots'
                            {
                            match("mots"); 



                            }
                            break;

                    }


                    skip();

                    }
                    break;
                case 2 :
                    // /Users/nathan/Dropbox/lo17/tal_sql.g:58:114: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nathan/Dropbox/lo17/tal_sql.g:61:6: ( ( 'a' .. 'z' | 'å' .. 'Ÿ' )* ( '0' .. '9' )* ( '@' )? ( 'a' .. 'z' | 'å' .. 'Ÿ' )* ( '0' .. '9' )* | ( '0' .. '9' )* ( '/' )? ( '0' .. '9' )* ( '/' )? ( '0' .. '9' )* )
            int alt18=2;
            switch ( input.LA(1) ) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
            case '\u00C2':
            case '\u00C3':
            case '\u00C4':
            case '\u00C5':
            case '\u00C6':
            case '\u00C7':
            case '\u00C8':
            case '\u00C9':
            case '\u00CA':
            case '\u00CB':
            case '\u00CC':
            case '\u00CD':
            case '\u00CE':
            case '\u00CF':
            case '\u00D0':
            case '\u00D1':
            case '\u00D2':
            case '\u00D3':
            case '\u00D4':
            case '\u00D5':
            case '\u00D6':
            case '\u00D7':
            case '\u00D8':
            case '\u00D9':
            case '\u00DA':
            case '\u00DB':
            case '\u00DC':
            case '\u00DD':
            case '\u00DE':
            case '\u00DF':
            case '\u00E0':
            case '\u00E1':
            case '\u00E2':
            case '\u00E3':
            case '\u00E4':
            case '\u00E5':
            case '\u00E6':
            case '\u00E7':
            case '\u00E8':
            case '\u00E9':
            case '\u00EA':
            case '\u00EB':
            case '\u00EC':
            case '\u00ED':
            case '\u00EE':
            case '\u00EF':
            case '\u00F0':
            case '\u00F1':
            case '\u00F2':
            case '\u00F3':
            case '\u00F4':
            case '\u00F5':
            case '\u00F6':
            case '\u00F7':
            case '\u00F8':
            case '\u00F9':
            case '\u00FA':
            case '\u00FB':
            case '\u00FC':
                {
                alt18=1;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case '@':
                {
                alt18=1;
                }
                break;
            case '/':
                {
                alt18=2;
                }
                break;
            default:
                alt18=1;
            }

            switch (alt18) {
                case 1 :
                    // /Users/nathan/Dropbox/lo17/tal_sql.g:61:9: ( 'a' .. 'z' | 'å' .. 'Ÿ' )* ( '0' .. '9' )* ( '@' )? ( 'a' .. 'z' | 'å' .. 'Ÿ' )* ( '0' .. '9' )*
                    {
                    // /Users/nathan/Dropbox/lo17/tal_sql.g:61:9: ( 'a' .. 'z' | 'å' .. 'Ÿ' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= 'a' && LA8_0 <= 'z')||(LA8_0 >= '\u00C2' && LA8_0 <= '\u00FC')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/nathan/Dropbox/lo17/tal_sql.g:
                    	    {
                    	    if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C2' && input.LA(1) <= '\u00FC') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    // /Users/nathan/Dropbox/lo17/tal_sql.g:61:33: ( '0' .. '9' )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Users/nathan/Dropbox/lo17/tal_sql.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    // /Users/nathan/Dropbox/lo17/tal_sql.g:61:44: ( '@' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='@') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:61:45: '@'
                            {
                            match('@'); 

                            }
                            break;

                    }


                    // /Users/nathan/Dropbox/lo17/tal_sql.g:61:50: ( 'a' .. 'z' | 'å' .. 'Ÿ' )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0 >= 'a' && LA11_0 <= 'z')||(LA11_0 >= '\u00C2' && LA11_0 <= '\u00FC')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /Users/nathan/Dropbox/lo17/tal_sql.g:
                    	    {
                    	    if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C2' && input.LA(1) <= '\u00FC') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    // /Users/nathan/Dropbox/lo17/tal_sql.g:61:74: ( '0' .. '9' )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /Users/nathan/Dropbox/lo17/tal_sql.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/nathan/Dropbox/lo17/tal_sql.g:61:88: ( '0' .. '9' )* ( '/' )? ( '0' .. '9' )* ( '/' )? ( '0' .. '9' )*
                    {
                    // /Users/nathan/Dropbox/lo17/tal_sql.g:61:88: ( '0' .. '9' )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /Users/nathan/Dropbox/lo17/tal_sql.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    // /Users/nathan/Dropbox/lo17/tal_sql.g:61:99: ( '/' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='/') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:61:100: '/'
                            {
                            match('/'); 

                            }
                            break;

                    }


                    // /Users/nathan/Dropbox/lo17/tal_sql.g:61:105: ( '0' .. '9' )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // /Users/nathan/Dropbox/lo17/tal_sql.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    // /Users/nathan/Dropbox/lo17/tal_sql.g:61:116: ( '/' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='/') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /Users/nathan/Dropbox/lo17/tal_sql.g:61:117: '/'
                            {
                            match('/'); 

                            }
                            break;

                    }


                    // /Users/nathan/Dropbox/lo17/tal_sql.g:61:122: ( '0' .. '9' )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // /Users/nathan/Dropbox/lo17/tal_sql.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR"

    public void mTokens() throws RecognitionException {
        // /Users/nathan/Dropbox/lo17/tal_sql.g:1:8: ( SELECT | COUNT | ARTICLE | PAGE | UNE | FOCUS | TITRE | AUTEUR | THEME | BREVE | ET | OU | POINT | CONTENU | DATE | WS | VAR )
        int alt19=17;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // /Users/nathan/Dropbox/lo17/tal_sql.g:1:10: SELECT
                {
                mSELECT(); 


                }
                break;
            case 2 :
                // /Users/nathan/Dropbox/lo17/tal_sql.g:1:17: COUNT
                {
                mCOUNT(); 


                }
                break;
            case 3 :
                // /Users/nathan/Dropbox/lo17/tal_sql.g:1:23: ARTICLE
                {
                mARTICLE(); 


                }
                break;
            case 4 :
                // /Users/nathan/Dropbox/lo17/tal_sql.g:1:31: PAGE
                {
                mPAGE(); 


                }
                break;
            case 5 :
                // /Users/nathan/Dropbox/lo17/tal_sql.g:1:36: UNE
                {
                mUNE(); 


                }
                break;
            case 6 :
                // /Users/nathan/Dropbox/lo17/tal_sql.g:1:40: FOCUS
                {
                mFOCUS(); 


                }
                break;
            case 7 :
                // /Users/nathan/Dropbox/lo17/tal_sql.g:1:46: TITRE
                {
                mTITRE(); 


                }
                break;
            case 8 :
                // /Users/nathan/Dropbox/lo17/tal_sql.g:1:52: AUTEUR
                {
                mAUTEUR(); 


                }
                break;
            case 9 :
                // /Users/nathan/Dropbox/lo17/tal_sql.g:1:59: THEME
                {
                mTHEME(); 


                }
                break;
            case 10 :
                // /Users/nathan/Dropbox/lo17/tal_sql.g:1:65: BREVE
                {
                mBREVE(); 


                }
                break;
            case 11 :
                // /Users/nathan/Dropbox/lo17/tal_sql.g:1:71: ET
                {
                mET(); 


                }
                break;
            case 12 :
                // /Users/nathan/Dropbox/lo17/tal_sql.g:1:74: OU
                {
                mOU(); 


                }
                break;
            case 13 :
                // /Users/nathan/Dropbox/lo17/tal_sql.g:1:77: POINT
                {
                mPOINT(); 


                }
                break;
            case 14 :
                // /Users/nathan/Dropbox/lo17/tal_sql.g:1:83: CONTENU
                {
                mCONTENU(); 


                }
                break;
            case 15 :
                // /Users/nathan/Dropbox/lo17/tal_sql.g:1:91: DATE
                {
                mDATE(); 


                }
                break;
            case 16 :
                // /Users/nathan/Dropbox/lo17/tal_sql.g:1:96: WS
                {
                mWS(); 


                }
                break;
            case 17 :
                // /Users/nathan/Dropbox/lo17/tal_sql.g:1:99: VAR
                {
                mVAR(); 


                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\2\26\1\16\3\26\1\16\5\26\1\uffff\1\26\1\uffff\4\26\1\16\2\26\1"+
        "\uffff\16\26\1\104\1\26\1\106\1\16\2\26\3\16\1\26\2\16\2\26\1\16"+
        "\6\26\1\16\1\26\1\131\7\26\1\uffff\1\16\1\uffff\3\26\3\16\1\26\1"+
        "\16\2\26\1\16\5\26\1\157\1\26\1\uffff\3\26\2\16\3\26\1\170\3\16"+
        "\1\26\2\16\5\26\1\157\1\uffff\1\177\1\u0080\1\u0082\1\u0083\1\16"+
        "\1\u0085\1\u0087\1\26\1\uffff\1\16\3\26\2\u0085\2\uffff\1\u0082"+
        "\2\uffff\1\16\1\uffff\1\u0087\1\uffff\1\u0087\1\26\1\u008d\1\u008f"+
        "\1\u0090\1\uffff\1\u008f\2\uffff";
    static final String DFA19_eofS =
        "\u0091\uffff";
    static final String DFA19_minS =
        "\1\11\1\157\1\60\1\141\1\156\1\157\1\60\1\143\1\162\1\141\1\163"+
        "\1\165\1\uffff\1\47\1\uffff\1\47\1\165\1\47\1\157\1\60\1\154\1\157"+
        "\1\uffff\1\155\1\164\1\162\1\164\1\147\1\166\1\145\1\143\1\164\1"+
        "\u00e8\1\165\1\162\1\u00e8\1\160\1\60\1\164\2\60\2\156\3\60\1\145"+
        "\2\60\1\163\1\156\1\60\1\164\1\142\1\151\3\145\1\60\1\157\1\60\1"+
        "\165\1\162\1\155\1\163\1\151\1\166\1\160\1\uffff\1\60\1\uffff\1"+
        "\145\1\163\1\164\3\60\1\151\1\60\2\164\1\60\1\141\1\151\1\143\1"+
        "\163\1\165\1\60\1\164\1\uffff\1\163\2\145\2\60\1\164\2\145\4\60"+
        "\1\145\2\60\1\156\1\145\1\154\1\163\1\162\1\60\1\uffff\7\60\1\154"+
        "\1\uffff\1\60\1\144\1\156\1\145\2\60\2\uffff\1\60\2\uffff\1\60\1"+
        "\uffff\1\60\1\uffff\1\60\1\145\3\60\1\uffff\1\60\2\uffff";
    static final String DFA19_maxS =
        "\1\u00e9\1\157\1\u00fc\1\151\1\156\1\157\1\u00fc\1\143\1\162\1\141"+
        "\1\164\1\u00f9\1\uffff\1\165\1\uffff\1\145\1\165\1\151\1\157\1\u00fc"+
        "\1\154\1\157\1\uffff\1\155\1\164\1\162\1\164\1\162\1\166\1\145\1"+
        "\143\1\164\1\u00e8\1\165\1\162\1\u00e8\1\160\1\u00fc\1\164\2\u00fc"+
        "\1\164\1\156\3\u00fc\1\157\2\u00fc\1\163\1\156\1\u00fc\1\164\1\155"+
        "\1\151\3\145\1\u00fc\1\157\1\u00fc\1\165\1\162\1\155\1\164\1\151"+
        "\1\166\1\160\1\uffff\1\u00fc\1\uffff\1\145\1\163\1\164\3\u00fc\1"+
        "\151\1\u00fc\2\164\1\u00fc\1\141\1\151\1\143\1\163\1\165\1\u00fc"+
        "\1\164\1\uffff\1\163\2\145\2\u00fc\1\164\2\145\4\u00fc\1\145\2\u00fc"+
        "\1\156\1\145\1\154\1\163\1\162\1\u00fc\1\uffff\7\u00fc\1\154\1\uffff"+
        "\1\u00fc\1\144\1\156\1\145\2\u00fc\2\uffff\1\u00fc\2\uffff\1\u00fc"+
        "\1\uffff\1\u00fc\1\uffff\1\u00fc\1\145\3\u00fc\1\uffff\1\u00fc\2"+
        "\uffff";
    static final String DFA19_acceptS =
        "\14\uffff\1\15\1\uffff\1\20\7\uffff\1\21\55\uffff\1\13\1\uffff\1"+
        "\14\22\uffff\1\5\25\uffff\1\4\10\uffff\1\17\6\uffff\1\16\1\6\1\uffff"+
        "\1\7\1\11\1\uffff\1\10\1\uffff\1\12\5\uffff\1\2\1\uffff\1\3\1\1";
    static final String DFA19_specialS =
        "\u0091\uffff}>";
    static final String[] DFA19_transitionS = {
            "\2\16\2\uffff\1\16\22\uffff\1\16\14\uffff\1\16\1\14\20\uffff"+
            "\1\14\41\uffff\1\2\1\10\1\1\1\15\1\12\1\5\2\uffff\1\24\1\17"+
            "\1\uffff\1\21\1\25\1\uffff\1\13\1\3\1\20\1\11\1\22\1\6\1\4\3"+
            "\uffff\1\23\157\uffff\1\7",
            "\1\27",
            "\12\26\6\uffff\1\26\40\uffff\3\26\1\31\15\26\1\30\2\26\1\32"+
            "\5\26\107\uffff\73\26",
            "\1\33\7\uffff\1\34",
            "\1\35",
            "\1\36",
            "\12\26\6\uffff\1\26\40\uffff\7\26\1\40\1\37\5\26\1\41\13\26"+
            "\107\uffff\73\26",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\46\1\45",
            "\1\47\u0083\uffff\1\50",
            "",
            "\1\16\71\uffff\1\51\3\uffff\1\53\11\uffff\1\52\5\uffff\1\54",
            "",
            "\1\16\75\uffff\1\55",
            "\1\56",
            "\1\16\71\uffff\1\60\3\uffff\1\57\3\uffff\1\61",
            "\1\62",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\1\63",
            "\1\64",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71\12\uffff\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\1\105",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\1\110\5\uffff\1\107",
            "\1\111",
            "\12\26\6\uffff\1\26\40\uffff\22\26\1\112\7\26\107\uffff\73"+
            "\26",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\1\114\3\uffff\1\113\5\uffff\1\115",
            "\12\26\6\uffff\1\26\40\uffff\22\26\1\116\7\26\107\uffff\73"+
            "\26",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\1\117",
            "\1\120",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\1\121",
            "\1\123\12\uffff\1\122",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\1\130",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\136\1\135",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\1\145",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\1\146",
            "\1\147",
            "\12\26\6\uffff\1\26\40\uffff\22\26\1\150\7\26\107\uffff\73"+
            "\26",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\12\26\6\uffff\1\26\40\uffff\22\26\1\156\7\26\107\uffff\73"+
            "\26",
            "\1\160",
            "",
            "\1\161",
            "\1\162",
            "\1\163",
            "\12\26\6\uffff\1\26\40\uffff\4\26\1\164\25\26\107\uffff\73"+
            "\26",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\1\165",
            "\1\166",
            "\1\167",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\1\171",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\12\26\6\uffff\1\26\40\uffff\22\26\1\u0081\7\26\107\uffff\73"+
            "\26",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\12\26\6\uffff\1\26\40\uffff\22\26\1\u0084\7\26\107\uffff\73"+
            "\26",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\12\26\6\uffff\1\26\40\uffff\22\26\1\u0086\7\26\107\uffff\73"+
            "\26",
            "\1\u0088",
            "",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "",
            "",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "",
            "",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\1\u008c",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "\12\26\6\uffff\1\26\40\uffff\22\26\1\u008e\7\26\107\uffff\73"+
            "\26",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "",
            "\12\26\6\uffff\1\26\40\uffff\32\26\107\uffff\73\26",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( SELECT | COUNT | ARTICLE | PAGE | UNE | FOCUS | TITRE | AUTEUR | THEME | BREVE | ET | OU | POINT | CONTENU | DATE | WS | VAR );";
        }
    }
 

}