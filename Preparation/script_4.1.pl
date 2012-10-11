#!/usr/bin/perl -w

#Ce script créer un fichier XML structuré et bien formé
my $mainDirectory='extract_3';
my $newDirectory="extract_4";
chdir "$mainDirectory";
@list=`ls`;
chdir "..";

	#création du nouveau répertoire
	#seulement s'il n'existe pas
system("mkdir $newDirectory") if(system("test -d $newDirectory"));


open(FICOUT, ">>$newDirectory/corpus.xml");
print FICOUT "<CORPUS>\n";

foreach $v (@list) {
	
$date=$v;
$date=~/lci-monde-(.*)-(.*)-(.*).html/;
$annee=$1;
$mois=$2;
$jour=$3;
$date=$jour;
$date.="/$mois/$annee";
	
	print FICOUT "\t<PAGE_LCI>\n\t\t\t<FICHIER>\n\t\t\t$v\t\t\t</FICHIER>\n\t\t\t<DATE_PAGE>$date</DATE_PAGE>\n";
	print FICOUT "\t\t\t<UNE>\n";

	system("./script_une.pl $mainDirectory/$v");
	print FICOUT "\t\t\t</UNE>\n\t";
	
	print FICOUT "\t\t<LES_VOIRAUSSI>\n";
	system("./script_voiraussi.pl $mainDirectory/$v");
	print FICOUT "\t\t\t</LES_VOIRAUSSI>\n\t";
	
	print FICOUT "\t\t<FOCUS>\n";
	system("./script_focus.pl $mainDirectory/$v");
	print FICOUT "\t\t\t</FOCUS>\n\t";
	
	print FICOUT "\t\t<LES_GROSTITRES>\n";
	system("./script_grostitres.pl $mainDirectory/$v");
	print FICOUT "\t\t\t</LES_GROSTITRES>\n\t";
	
	print FICOUT "\t\t<LES_RAPPELS>\n";
	system("./script_rappels.pl $mainDirectory/$v");
	print FICOUT "\t\t\t</LES_RAPPELS>\n\t";
	print FICOUT "</PAGE_LCI>\n";
}

print FICOUT "</CORPUS>";
close(FICOUT);