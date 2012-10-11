#!/usr/bin/perl

use utf8;

@mots=<>;
foreach $m (@mots) {
	$m =~ s/\n/ /;
	$m =~ tr/A-Z/a-z/;
	@lettre=split(//,$m);
	$rac="";
	foreach (@lettre) {	
		$rac=$rac.$_;
		%tronc=();
		foreach $elt (@mots) {
			$elt =~ tr/A-Z/a-z/;
#			print "$rac\t$elt\n";
			if ($elt =~ /^$rac(.)/) {
				$tronc{$1}++;
				}
			}
		@tronc = keys %tronc;
		$tronc = $#tronc +1;
		if ($tronc>9) {$tronc=9;}
		print "$tronc";
		}
	print "\t$m\n";	
	}