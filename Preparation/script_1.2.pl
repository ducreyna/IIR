#!/usr/bin/perl -w

use Unicode::String qw(utf8 latin1);

# spécifie le format par défaut des chaînes en entrée
Unicode::String->stringify_as('utf8');

	#nom du fichier passé en entrée
	#est stocké dans une variable
my $file=$ARGV[0];

	#récupération du nom de dossier LCI
	#et création du nouveau nom de fichier
$file=~/(.*)\/(.*)/;
my $newDirectory = "extract_1";
my $newFile = $2;

	#création du fichier normalisé temporaire
open(FICIN,"$file");
open(FICOUT,">>$newDirectory/temp.html");

while(<FICIN>) {

  # convertir la ligne DOCTYPE .. UTF-8 en DOCTYPE .. iso8859-1
  # pour que le document converti puisse toujours
  # être affiché correctement par un navigateur
  (/DOCTYPE HTML/) && (s/[Uu][Tt][Ff]\-8/iso8859-15/);

  # instancier la chaîne en objet au format "neutre"
  $u = Unicode::String->new($_);

  # rendre la chaîne sous un format iso8859-1
  print FICOUT $u->latin1;
}

close(FICIN);
close(FICOUT);

	#création du fichier contenant les informations necessaires
open(FICIN,"$newDirectory/temp.html");
open(FICOUT,">>$newDirectory/$newFile");

while(<FICIN>) #on lit une ligne
{
	if(/IBL_ID=27303/ || /Blc=27303/) #si elle correspond
	{
		do
		{
			print FICOUT; #on l'imprime dans le fichier
			$_=<FICIN>; #on passe à la ligne suivante
		}
		until (/IBL_ID=27916 - Temps/ || /Blc=27916, [0-9]/); #jusqu'à ce qu'on arrive à ce mot clé
		print FICOUT; #on imprime la dernière ligne
	}
}

close(FICIN);
close(FICOUT);

	#suppression du fichier normalisé temporaire
system("rm $newDirectory/temp.html");

