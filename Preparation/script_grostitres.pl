#!/usr/bin/perl

	#nom du fichier passé en entrée
	#est stocké dans une variable
my $file=$ARGV[0];

	#création du nouveau nom de fichier
my $newDirectory = "extract_4";

open(FICIN,"$file");
open(FICOUT,">>$newDirectory/corpus.xml");


	$_=<FICIN>;
	$_=<FICIN>;
	$_=<FICIN>;
	$_=<FICIN>;
	$fin;
	$date;

		while(/<a href/)
		{
			print FICOUT "\t\t\t\t<GROSTITRE>\n";
			
			/<a href="(.*?)"><img src="(.*?)"/;
			$url=$1;
			$url =~s/javascript:openPopup\('//g;
			$url =~s/','url_15',640,600,50,50,0,0,0,0,1,0\);//g;


			$img=$2;
			/class="S301">(.*?)</;
			$theme=$1;
			/class="S63">(.*?)</;
			$titre=$1;
			/" class="S48">(.*?)<\/a>(.*)/;
			$resume=$1;
			$fin=$2;
			if(/class="S48">(.*?)<\/a><span class="S48">\((.*?)\)/)
			{
				/<span class="S48">\((.*?)\)<\/span>(.*)/;
				$date=$1;
				
				$fin=$2
			}
			else
			{
				$date="";
			}
			print FICOUT "\t\t\t\t\t<urlArticle>$url</urlArticle>\n";
			print FICOUT "\t\t\t\t\t<themeArticle>$theme</themeArticle>\n";
			print FICOUT "\t\t\t\t\t<titreArticle>$titre</titreArticle>\n";
			print FICOUT "\t\t\t\t\t<dateArticle>$date</dateArticle>\n";
			print FICOUT "\t\t\t\t\t<urlImage>$img</urlImage>\n";
			print FICOUT "\t\t\t\t\t<resumeArticle>$resume</resumeArticle>\n";
			
			/class="S48">(.*?)<\/a>(.*?)<\/table/;
			$mail = $2;
			if($mail=~/<a href="mailto:/)
			{
				/<a href="mailto:(.*?)" class="S14">(.*?)<(.*?)<\/td><\/tr>(.*)/;
				print FICOUT "\t\t\t\t\t<mailTo>$1</mailTo>\n";
				print FICOUT "\t\t\t\t\t<auteur>$2</auteur>\n";
				$fin=$4;
			}
			else
			{
				print FICOUT "\t\t\t\t\t<mailTo></mailTo>\n";
				print FICOUT "\t\t\t\t\t<auteur></auteur>\n";
			}
			$_=$fin;
			print FICOUT "\t\t\t\t</GROSTITRE>\n\t";
		}	

close(FICIN);
close(FICOUT);