#!/usr/bin/perl

system("./newsegmente.pl newCorpus.xml >> temp.txt | sort -u temp.txt >> tempSort.txt");

open(FICIN,"tempSort.txt");
open(FICOUT,">>dico.txt");

while(<FICIN> ne /^a/)
{
	print FICOUT "$_\n";
}
close(FICIN);
close(FICOUT);