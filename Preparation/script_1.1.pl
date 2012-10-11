#!/usr/bin/perl -w

	#listage de tous les fichiers
	#du répertoire LCI
my $mainDirectory='LCI';
my $newDirectory="extract_1";
chdir "$mainDirectory";
my @liste = `ls`;
chdir "..";

	#création du nouveau répertoire
	#seulement s'il n'existe pas
system("mkdir $newDirectory") if(system("test -d $newDirectory"));

foreach my $v (@liste)
{
	system("./script_1.2.pl $mainDirectory/$v");
}

#lo17a012    ohod2UNE