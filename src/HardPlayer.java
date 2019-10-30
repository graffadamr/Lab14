
public class HardPlayer extends Player {

	public HardPlayer(String name) {
		this.setName(name);
	}
	
	public HardPlayer() {
		
	}
	
	@Override
	public Roshambo generateRoshambo() {
		
		int i = (int)(Math.random()*3) + 1;
		
		switch(i) {
		
		case 1:
			return Roshambo.Paper;
			
		case 2:
			return Roshambo.Rock;
			
		default:
			return Roshambo.Scissors;
			
		}
	}

}
