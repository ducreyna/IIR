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

close(FICIN);
$num = 0;
open(FICIN, "$file");

while($num < 2) {
	$_=<FICIN>;
	$num++;
}

$_=<FICIN>;
/<a href="(.*?)">/;
$url = $1;
/class="S401">(.*?)</;
$title = $1;

if ($url ne $title) {

	$url =~s/javascript:openPopup\('//g;
	$url =~s/','url_341',930,780,50,50,0,1,0,0,1,0\);//g;
	$url =~s/','url_15',640,600,50,50,0,0,0,0,1,0\);//g;
	$url =~s/','url_95',800,600,0,0,0,1,0,0,0,0\);//g;
	$url =~s/','url_25',700,600,50,50,0,0,0,0,0,0\);//g;

	
	print FICOUT "\t\t\t\t<urlArticle>$url</urlArticle>\n";
	print FICOUT "\t\t\t\t<titreArticle>$title</titreArticle>\n";
	print FICOUT "\t\t\t\t<dateArticle>$date</dateArticle>\n";
	/<a href="(.*?)"><img src="(.*?)"/;
	print FICOUT "\t\t\t\t<urlImage>";
	$url = $2;
	$url =~s/javascript:openPopup\('//g;
	$url =~s/','url_341',930,780,50,50,0,1,0,0,1,0\);//g;
	$url =~s/','url_15',640,600,50,50,0,0,0,0,1,0\);//g;
	$url =~s/','url_95',800,600,0,0,0,1,0,0,0,0\);//g;
	print FICOUT "$url" if(defined($url));
	print FICOUT "</urlImage>\n"; 

	print FICOUT "\t\t\t\t<resumeArticle>";
	/class="S48">(.*?)</;
	print FICOUT "$1" if(defined($1));	
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
}


close(FICIN);
close(FICOUT);