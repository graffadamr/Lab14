
public class HumanPlayer extends Player {

	private String userChoice;
	
	public HumanPlayer(String name) {
		this.setName(name);
	}

	public HumanPlayer() {
		
	}

	public void setUserChoice(String userChoice) {
		this.userChoice = userChoice;
	}

	public String getuserChoice() {
		return userChoice;
	}

	@Override
	public Roshambo generateRoshambo() {

		if (userChoice.equalsIgnoreCase("rock")) {
			return Roshambo.Rock;
		} else if (userChoice.equalsIgnoreCase("paper")) {
			return Roshambo.Paper;
		} else {
			return Roshambo.Scissors;
		}

	}

	@Override
	public String toString() {
		return "HumanPlayer [userChoice=" + userChoice + "]";
	}

}
