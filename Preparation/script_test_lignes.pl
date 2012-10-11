#!/usr/bin/perl -w

#Ce script vérifie que chaque fichier de extract_2 ne contient que 1 ligne
my $mainDirectory='extract_2';

chdir "$mainDirectory";
my @liste = `ls`;

$count = 1;
$count2 = 1;
foreach my $v (@liste)
{
	open(FICIN, "$v");
	while (<FICIN>) {
		
	$_=~/"GeneralOuvre"(.*)A voir aussi :/;
	

	
	if(defined($1))
	{
		print "$count\n";
		$count++;
	}
	else
	{
		$_=~/"GeneralOuvre"(.*)s.tf1.fr\/mmdia\/i\/00\/4\/611004.gif/;	
		if(defined($1))
		{
			print "$count2\n";
			$count2++;
		}
	}
	}
}

