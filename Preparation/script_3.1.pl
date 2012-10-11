#!/usr/bin/perl -w

	#listage de tous les fichiers
	#du répertoire LCI
my $mainDirectory='extract_2';
my $newDirectory="extract_3";
chdir "$mainDirectory";
my @liste = `ls`;
chdir "..";

	#création du nouveau répertoire
	#seulement s'il n'existe pas
system("mkdir $newDirectory") if(system("test -d $newDirectory"));

foreach my $v (@liste)
{
	system("./script_3.2.pl $mainDirectory/$v");
}