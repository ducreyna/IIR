#!/usr/bin/perl

@liste;

open(FICIN,"dico.txt");

while(<FICIN>)
{
	chomp($_);
	push(@liste,$_);
}

close(FICIN);

open(FICIN,"lexicFinalA_10V2.txt");

while(<FICIN>)
{
	/(.*)\t(.*)/;
	foreach $v (@liste)
	{
		if($v eq $1)
		{
			print "$v\n";
		}
	}
}

close(FICIN);