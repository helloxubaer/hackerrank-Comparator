package com.zubaer.hackerrank;

import java.util.Comparator;

public class Checker implements Comparator<Player> {

	@Override
	public int compare(Player a, Player b) {
		if(a.score == b.score) {
			return a.name.compareTo(b.name);
		}
		if(a.score < b.score) {
			return 1;
		}
		else {
			return -1;
		}
		
	}

	
}
