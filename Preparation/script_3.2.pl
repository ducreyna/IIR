#!/usr/bin/perl -w

	#nom du fichier passé en entrée
	#est stocké dans une variable
my $file=$ARGV[0];

	#récupération du nom de dossier extract_1
	#et création du nouveau nom de fichier
$file=~/(.*)\/(.*)/;
my $newDirectory = "extract_3";
my $newFile = $2;

my $voiraussi=1; #variable bouleene indiquant s'il y a des VOIRAUSSI

open(FICIN,"$file");
open(FICOUT,">>$newDirectory/$newFile");

while(<FICIN>) #on lit une ligne
{
	#récupération de la UNE
	if(/"GeneralOuvre" -->(.*)A voir aussi :/)
	{
		print FICOUT "$1\n";
	}
	elsif(/"GeneralOuvre" -->(.*)s.tf1.fr\/mmdia\/i\/00\/4\/611004.gif/)
	{
		$voiraussi=0;
		print FICOUT "$1\n";
	}
	
	
	#récuperation des VOIRAUSSI
	if($voiraussi==1)
	{
		if(/A voir aussi :(.*)s.tf1.fr\/mmdia\/i\/00\/4\/611004.gif/)
		{
			print FICOUT "$1\n";
		}
		elsif(/A voir aussi :(.*)Bloc IBL_ID=27914 - Temps/)
		{
			print FICOUT "$1\n";
		}
	}
	else
	{
		print FICOUT "\n";
	}
	
	
	#récuperation FOCUS
	if(/s.tf1.fr\/mmdia\/i\/00\/4\/611004.gif(.*)(Bloc IBL_ID=27913 - Temps|Blc=27913)/)
	{
		print FICOUT "$1\n";
	}
	else
	{
		print FICOUT "\n";
	}
	
	
	#récuperation GROSTITRES
	if(/Bloc IBL_ID=27915 - "news\/NewsAutresArticles"(.*)Bloc IBL_ID=27916 - "news\/NewsAutresArticles"/)
	{
		print FICOUT "$1\n";
	}
	elsif(/Blc=27915, "news\/NewsAutresArticles"(.*)Blc=27916, "news\/NewsAutresArticles"/)
	{
		print FICOUT "$1\n";
	}
	
	
	#récuperation RAPPELS
	if(/Bloc IBL_ID=27916 - "news\/NewsAutresArticles"(.*)Bloc IBL_ID=27916 - Temps/)
	{
		print FICOUT "$1\n";
	}
	elsif(/Blc=27916, "news\/NewsAutresArticles"(.*)Blc=45211, "recherche\/LiensContextuels"/)
	{
		print FICOUT "$1\n";
	}
	else
	{
		print FICOUT "\n";
	}
}

close(FICIN);
close(FICOUT);