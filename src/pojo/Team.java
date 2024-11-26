package pojo;

import java.util.ArrayList;
import java.util.List;

public class Team {
	private List<Player> players = new ArrayList<Player>();
	private double totalSkillLevel;

	public Team() {
		super();
	}

	public Team(List<Player> players, double totalSkillLevel) {
		super();
		this.players = players;
		this.totalSkillLevel = totalSkillLevel;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public double getTotalSkillLevel() {
		return totalSkillLevel;
	}

	public void setTotalSkillLevel(double totalSkillLevel) {
		this.totalSkillLevel = totalSkillLevel;
	}

	public double calculateTotalSkillLevel() {
		for (Player player : this.players) {
			this.totalSkillLevel += player.getSkillLevel();
		}
		return this.totalSkillLevel;
	}

	public void display() {
		System.out.println("The player in team:");
		for (Player player : this.players) {
			System.out.println("Name of the player: "+player.getName());
			System.out.println("Possition of the player: "+player.getPosition());
			System.out.println("Skill of the player: "+player.getSkillLevel());
		}
		System.out.println("Total skill level: "+calculateTotalSkillLevel());
	}
}
