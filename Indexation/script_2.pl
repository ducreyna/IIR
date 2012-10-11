#!/usr/bin/perl

system("./newsegmente.pl newCorpus.xml >> temp.txt");

open(FICIN,"temp.txt");
open(FICOUT,">>temp2.txt");

while(<FICIN>)
{
	if(!/^\d+\D.*/)
	{
		chomp($_);
		print FICOUT "$_\n";
	}
}
close(FICOUT);
close(FICIN);

system("rm temp.txt");
system("sort -u temp2.txt >> filtre_2.txt");
system("rm temp2.txt");

system("./tronc.pl filtre_2.txt >> filtreTronc.txt");
#system("rm filtre_2.txt");
#system("./filtronc.pl -v filtreTronc.txt >> lemmes.txt");
#system("rm filtreTronc.txt");