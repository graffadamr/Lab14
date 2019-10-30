
public abstract class Player {

	private String name;

	public Player() {
		super();
	}

	public Player(String name, String roAnswer) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract Roshambo generateRoshambo();

}
