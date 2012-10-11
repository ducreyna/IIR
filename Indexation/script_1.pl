#!/usr/bin/perl

system("./newcreefiltre.pl dico.txt >> filtre_1.pl");
system("chmod +x filtre_1.pl");
system("./filtre_1.pl corpusA09.xml >> newCorpus.xml");