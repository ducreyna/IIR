#!/usr/bin/perl

system("./newcreefiltre.pl lemmes.txt >> filtre_lemmes.pl");
system("chmod +x filtre_lemmes.pl");
system("./filtre_lemmes.pl newCorpus.xml >> newCorpus_2.xml");