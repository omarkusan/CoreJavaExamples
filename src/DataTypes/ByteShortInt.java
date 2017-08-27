package DataTypes;

public class ByteShortInt {
	public static void main(String[] args) {

		calculateScore(true, 800, 5, 100);

		calculateScore(true, 10000, 8, 200);

		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Omar", highScorePosition);

		highScorePosition = calculateHighScorePosition(1000);
		displayHighScorePosition("Alim", highScorePosition);
		highScorePosition = calculateHighScorePosition(800);
		displayHighScorePosition("Sidik", highScorePosition);

		calcFeetAndInchesToCentimeters(0, -10);

		calcFeetAndInchesToCentimeters(100);

	}

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if ((feet >= 0) && (inches >= 0 && inches <= 12)) {
			double centimeters = (feet * 12 + inches) * 2.54;
			System.out.println(feet + " feet," + inches + " inches = " + centimeters + " cm");
			return centimeters;
		}
		System.out.println("Invalid feet or inches parameters");
		return -1;
	}

	public static double calcFeetAndInchesToCentimeters(double inches) {
		if (inches >= 0) {
			double feet = (int) inches / 12;
			double remainingInches = (int) inches % 12;
			System.out.println(inches + "inches is equal to " + feet + " feet and " + remainingInches + " inches");
			return calcFeetAndInchesToCentimeters(feet, remainingInches);
		}
		return -1;
	}

	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		System.out.println(
				playerName + " managed to get into position, " + highScorePosition + " on the high score table");
	}

	public static int calculateHighScorePosition(int score) {
		if (score >= 1000) {
			return 1;
		} else if (score >= 500 && score < 1000) {
			return 2;
		} else if (score >= 100 && score < 500) {
			return 3;
		}
		return 4;
	}

	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000;
	}

	public static int calculateScore(int score) {
		System.out.println("Unamed player scored " + score + " points");
		return score * 1000;
	}

	public static int calculateScore(boolean gameOver, int score, int levelCompeleted, int bonus) {

		if (gameOver == true) {
			int finalScore = score + (levelCompeleted * bonus);
			finalScore += 1000;
			return finalScore;
		}
		return -1;
	}

}
