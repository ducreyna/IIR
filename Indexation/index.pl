#!/usr/bin/perl

$balise = shift(@ARGV);
while (<>) {
	if (/<FICHIER>(.*)<\/FICHIER>/) {
		$fichier="\t".$1;
		}
	elsif (/<$balise>(.*)<\/$balise>/) {
		$tabindex{$1} = $tabindex{$1}.$fichier;
		}
	}
@cleindex = keys %tabindex ;
foreach (@cleindex) {
	print $_.$tabindex{$_}."\n";
	}
