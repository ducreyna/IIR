#!/usr/bin/perl

use Encode; 

	#nom du fichier passé en entrée
	#est stocké dans une variable
my $file=$ARGV[0];

	#création du nouveau nom de fichier
my $newDirectory = "extract_4";

$annee=$file;
$annee=~/lci-monde-(.*)-(.*)-(.*).html/;
$annee=$1;
$mois;
$jour;

open(FICIN,"$file");
open(FICOUT,">>$newDirectory/corpus.xml");

	$_=<FICIN>;
	$_=<FICIN>;
	$_=<FICIN>;
	$_=<FICIN>;
	$_=<FICIN>;
	$fin;

		while(/class="S63">/)
		{
			print FICOUT "\t\t\t\t<RAPPEL>\n";
			
			/class="S301">(.*?)<\/span>/;
			$theme=$1;
			/<a href="(.*?)" class="S63">/;
			$url=$1;
			/class="S63">(.*?)<\/a>(.*)/;
			$titre=$1;
			$fin=$2;
			
			if(/class="S48">(.*?)cembre<\/span>/)
			{
				$jour=$1;
				$jour=~s/ .*//;
				$mois="12";
			}
			elsif(/class="S48">(.*?) novembre<\/span>/)
			{
				$jour=$1;
				$mois="11";
			}
			elsif(/class="S48">(.*?) octobre<\/span>/)
			{
				$jour=$1;
				$mois="10";
			}
			elsif(/class="S48">(.*?) septembre<\/span>/)
			{
				$jour=$1;
				$mois="09";
				$fin=$3;
			}
			elsif(/class="S48">(.*?) ao(.*?)t<\/span>/)
			{
				$jour=$1;
				$jour=~s/ .*//;
				$mois="08";
			}
			elsif(/class="S48">(.*?) juillet<\/span>/)
			{
				$jour=$1;
				$mois="07";
			}
			elsif(/class="S48">(.*?) juin<\/span>/)
			{
				$jour=$1;
				$mois="06";
			}
			elsif(/class="S48">(.*?) mai<\/span>/)
			{
				$jour=$1;
				$mois="05";
			}
			elsif(/class="S48">(.*?) avril<\/span>/)
			{
				$jour=$1;
				$mois="04";
			}
			elsif(/class="S48">(.*?) mars<\/span>/)
			{
				$jour=$1;
				$mois="03";
			}
			elsif(/class="S48">(.*?)vrier<\/span>/)
			{
				$jour=$1;
				$jour=~s/ .*//;
				$mois="02";
			}
			elsif(/class="S48">(.*?) janvier<\/span>/)
			{
				$jour=$1;
				$mois="01";
			}
			
			$date="$jour/$mois/$annee";
			
			print FICOUT "\t\t\t\t\t<dateArticle>$date</dateArticle>\n";
			print FICOUT "\t\t\t\t\t<themeArticle>$theme</themeArticle>\n";
			print FICOUT "\t\t\t\t\t<urlArticle>$url</urlArticle>\n";
			print FICOUT "\t\t\t\t\t<titreArticle>$titre</titreArticle>\n";
									
			$_=$fin;
			print FICOUT "\t\t\t\t</RAPPEL>\n";
		}	

close(FICIN);
close(FICOUT);