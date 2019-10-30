
public class EasyPlayer extends Player {
	
	public EasyPlayer(String name) {
		this.setName(name);
	}

	public EasyPlayer() {		
		
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.Rock;
	}

	@Override
	public String toString() {
		return "EasyPlayer [generateRoshambo()=" + generateRoshambo() + "]";
	}
	
	

}
