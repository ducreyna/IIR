#!/usr/bin/perl -w

	#nom du fichier passé en entrée
	#est stocké dans une variable
my $file=$ARGV[0];

	#création du nouveau nom de fichier
my $newDirectory = "extract_4";

open(FICIN,"$file");
open(FICOUT,">>$newDirectory/corpus.xml");

	$_=<FICIN>;
	$_=<FICIN>;
	
	if(/<span>/)
	{
		while(/<a(.*)/)
		{
			print FICOUT "\t\t\t\t<VOIRAUSSI>\n";
			
			/<a href="(.*?)" class="S48">(.*?) \((.*?)\)(.*)/;
			print FICOUT "\t\t\t\t\t<dateArticle>$3</dateArticle>\n";
			$url = $1;
			$title = $2;
			$next = $4;
			$url =~s/javascript:VerifCookie\('4','//g;
			$url =~s/',700,600,52\);//g;
			$url =~s/javascript:openPopup\('//g;
			$url =~s/','url_25',700,600,50,50,0,0,0,0,0,0\);//g;
			$url =~s/','url_15',640,600,50,50,0,0,0,0,1,0\);//g;
			$url =~s/','url_105',684,570,50,5,0,0,0,0,0,0\);//g;
			print FICOUT "\t\t\t\t\t<urlArticle>$url</urlArticle>\n";

			
			print FICOUT "\t\t\t\t\t<titreArticle>$title</titreArticle>\n";
			$_=$next;
			
			print FICOUT "\t\t\t\t</VOIRAUSSI>\n\t";	
		}
	}

close(FICIN);
close(FICOUT);