#!/usr/bin/perl -w

	#nom du fichier passé en entrée
	#est stocké dans une variable
my $file=$ARGV[0];

	#création du nouveau nom de fichier
my $newDirectory = "extract_4";

$date=$file;
$date=~/lci-monde-(.*)-(.*)-(.*).html/;
$annee=$1;
$mois=$2;
$jour=$3;
$date=$jour;
$date.="/$mois/$annee";

open(FICIN,"$file");
open(FICOUT,">>$newDirectory/corpus.xml");

	$_=<FICIN>;
	/<a class="S2" href="(.*)">Lire l'article<\/a>/;
	print FICOUT "\t\t\t\t<urlArticle>$1</urlArticle>\n";
	/class="S431" style="line-height:normal;">(.*?)<\/a>/;
	print FICOUT "\t\t\t\t<titreArticle>$1</titreArticle>\n";
	print FICOUT "\t\t\t\t<dateArticle>$date</dateArticle>\n";
	/class="S431"(.*)<a href="(.*?)"><img src="(.*?)" border="0" (alt|title)(.*)class="S48">/;
	print FICOUT "\t\t\t\t<urlImage>$3</urlImage>\n";

	print FICOUT "\t\t\t\t<resumeArticle>";
	# si 3 résumés d'article
	if(/vspace="1" hspace="1">(.*?)<(.*)vspace="1" hspace="1">(.*?)<(.*)vspace="1" hspace="1">(.*?)</)
	{
		print FICOUT "$1" if(defined($1));
		print FICOUT "$3" if(defined($3));
		print FICOUT "$5" if(defined($5));
	}
	#si 2 résumés d'article
	elsif(/vspace="1" hspace="1">(.*?)<(.*)vspace="1" hspace="1">(.*?)</)
	{
		print FICOUT "$1" if(defined($1));
		print FICOUT "$3" if(defined($3));
	}
	#si 1 résumé d'article
	else
	{
		/vspace="1" hspace="1">(.*?)</;
		print FICOUT "$1" if(defined($1));	
	}
	print FICOUT "</resumeArticle>\n";
	
	if(/mailto:(.*?)"/)
	{
		print FICOUT "\t\t\t\t<mailTo>$1</mailTo>\n";
	}
	else
	{
		print FICOUT "\t\t\t\t<mailTo></mailTo>\n";
	}
	if(/mailto:(.*) class="S14">(.*?)</)
	{
		print FICOUT "\t\t\t\t<auteur>$2</auteur>\n";
	}
	else
	{
		print FICOUT "\t\t\t\t<auteur></auteur>\n";
	}


close(FICIN);
close(FICOUT);