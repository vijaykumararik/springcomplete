package com;

import java.util.List;

public class IPl {
private String teamname;
private String captainname;
private List<String> player;
public String getTeamname() {
	return teamname;
}
public void setTeamname(String teamname) {
	this.teamname = teamname;
}
public String getCaptainname() {
	return captainname;
}
public void setCaptainname(String captainname) {
	this.captainname = captainname;
}
public List<String> getPlayer() {
	return player;
}
public void setPlayer(List<String> player) {
	this.player = player;
}
@Override
public String toString() {
	return "IPl [teamname=" + teamname + ", captainname=" + captainname + ", player=" + player + "]";
}

}
