#!/usr/bin/perl -w

	#nom du fichier passé en entrée
	#est stocké dans une variable
my $file=$ARGV[0];

	#récupération du nom de dossier extract_1
	#et création du nouveau nom de fichier
$file=~/(.*)\/(.*)/;
my $newDirectory = "extract_2";
my $newFile = $2;

open(FICIN,"$file");
open(FICOUT,">>$newDirectory/$newFile");

while(<FICIN>) #on lit une ligne
{
	#mettre toutes les informations sur une ligne
	$_=~s/\n//;
	$_=~s/\r//;
	$_=~s/\f//;
	print FICOUT;
}

close(FICIN);
close(FICOUT);