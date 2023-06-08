package com.map.collection;

import java.util.Map;

public class Bean {
 private String countryname;
	private Map<String, String> stateLanguage;
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public Map<String, String> getStateLanguage() {
		return stateLanguage;
	}
	public void setStateLanguage(Map<String, String> stateLanguage) {
		this.stateLanguage = stateLanguage;
	}
	@Override
	public String toString() {
		return " countryname=" + countryname + "\n stateLanguage=" + stateLanguage ;
	}
	
}
