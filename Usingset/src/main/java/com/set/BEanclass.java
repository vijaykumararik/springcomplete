package com.set;

import java.util.Set;

public class BEanclass {
 private Set<String> movieSets;

public Set<String> getMovieSets() {
	return movieSets;
}

public void setMovieSets(Set<String> movieSets) {
	this.movieSets = movieSets;
}

@Override
public String toString() {
	return "BEanclass [movieSets=" + movieSets + "]";
}
 
}
