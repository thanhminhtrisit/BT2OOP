package pojo;

public class Player {
	private String name;
	private String position;
	private double skillLevel;

	public Player() {
		super();
	}

	public Player(String name, String position, double skillLevel) {
		super();
		this.name = name;
		this.position = position;
		this.skillLevel = skillLevel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(double skillLevel) {
		this.skillLevel = skillLevel;
	}

}
