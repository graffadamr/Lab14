import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String cont = "y";
		Player opponent;

		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.println();
		String userName = Validator.getString(scan, "Enter your name: ");
		System.out.println();

		int choice = Validator.getInt(scan,
				"Would you like to play against EasyPlayer(1) or HardPlayer(2)? (select number): ", 1, 2);

		if (choice == 1) {
			opponent = new EasyPlayer("EasyPlayer");

		} else {
			opponent = new HardPlayer("HardPlayer");

		}

		while (cont.equalsIgnoreCase("y")) {
			System.out.println();
			String input = Validator.getString(scan, "Rock, Paper or Scissors? ");

			HumanPlayer user = new HumanPlayer(userName);
			user.setUserChoice(input);

			Roshambo userRo = user.generateRoshambo();
			Roshambo opponentRo = opponent.generateRoshambo();

			System.out.println();
			System.out.println(userName + ": " + userRo);
			System.out.println(opponent.getName() + ": " + opponentRo);
			Player winner = getWinner(user, opponent, userRo, opponentRo);

			if (winner == null) {
				System.out.println("Draw!");
			} else {
				System.out.println(winner.getName() + " wins!");
			}
			System.out.println();
			cont = Validator.getString(scan, "Play again? (y/n): ");

			System.out.println();
			System.out.println("Goodbye!");
		}

		scan.close();
	}

	public static Player getWinner(Player player1, Player player2, Roshambo r1, Roshambo r2) {
		if (r1.toString().equalsIgnoreCase("Rock") && r2.toString().equalsIgnoreCase("Scissors") || r1.toString().equalsIgnoreCase("Scissors") && r2.toString().equalsIgnoreCase("Paper")
				|| r1.toString().equalsIgnoreCase("Paper") && r2.toString().equalsIgnoreCase("Rock")) {
			return player1;
		} else if (r1.equals(r2)) {
			System.out.println("Player no one wins!");

			return null;
		} else {
			System.out.println("Player 2 wins!");
			return player2;
		}
	}

}
