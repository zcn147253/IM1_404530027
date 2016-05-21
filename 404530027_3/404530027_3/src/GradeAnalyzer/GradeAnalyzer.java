package GradeAnalyzer;

public class GradeAnalyzer {

	// 哦! 有趣!
	private final int Aplus = 98;
	private final int A = 92;
	private final int Aminus = 90;
	private final int Bplus = 88;
	private final int B = 82;
	private final int Bminus = 80;
	private final int Cplus = 78;
	private final int C = 72;
	private final int Cminus = 70;
	private final int D = 60;
	private final int F = 59;
	private final int MAX = 110;
	private final int MIN = 0;

	private int numberOfAplus = 0;
	private int numberOfA = 0;
	private int numberOfAminus = 0;
	private int numberOfBplus = 0;
	private int numberOfB = 0;
	private int numberOfBminus = 0;
	private int numberOfCplus = 0;
	private int numberOfC = 0;
	private int numberOfCminus = 0;
	private int numberOfD = 0;
	private int numberOfF = 0;

	private int totalGrades = 0;
	private double sumOfGrades = 0;
	private double sumOfSquareOfGrades = 0;
	private double averageOfGrades = 0;
	private double StandardDeviationOfGrades = 0;

	public boolean isValidGrade(double aGrade) {
		if (aGrade <= MAX && aGrade >= MIN) {
			return true;
		} else {
			return false;
		}
	}

	public void addGrade(double aGrade) {

		if (isValidGrade(aGrade)) {
			totalGrades++;
			sumOfGrades = sumOfGrades + aGrade;
			sumOfSquareOfGrades = sumOfSquareOfGrades + (aGrade + aGrade);

			if ((int) aGrade >= Aplus) {
				numberOfAplus++;
			} else if ((int) aGrade < Aplus && (int) aGrade >= A) {
				numberOfA++;
			} else if ((int) aGrade < A && (int) aGrade >= Aminus) {
				numberOfAminus++;
			} else if ((int) aGrade < Aminus && (int) aGrade >= Bplus) {
				numberOfBplus++;
			} else if ((int) aGrade < Bplus && (int) aGrade >= B) {
				numberOfB++;
			} else if ((int) aGrade < B && (int) aGrade >= Bminus) {
				numberOfBminus++;
			} else if ((int) aGrade < Bminus && (int) aGrade >= Cplus) {
				numberOfCplus++;
			} else if ((int) aGrade < Cplus && (int) aGrade >= C) {
				numberOfC++;
			} else if ((int) aGrade < C && (int) aGrade >= Cminus) {
				numberOfCminus++;
			} else if ((int) aGrade < Cminus && (int) aGrade >= D) {
				numberOfD++;
			} else if ((int) aGrade <= F) {
				numberOfF++;
			}
		}
	}

	public void analyzeGrades() {
		// 我覺得你把它寫得好複雜喔...
		this.averageOfGrades = this.sumOfGrades / ((double) this.totalGrades);
		double sumOfSquareOfGrades = this.sumOfGrades * this.sumOfGrades;
		double StandardDeviationDenominator = ((double) this.totalGrades);
		double StandardDeviationNumerator = (this.sumOfSquareOfGrades
				- ((1 / (double) this.totalGrades * sumOfGrades)));
		double StandardDeviationFraction = StandardDeviationNumerator / StandardDeviationDenominator;
		this.StandardDeviationOfGrades = Math.sqrt(StandardDeviationFraction);
	}

	public String toString() {
		String outputString = "";
		if (this.totalGrades >= 2) {
			outputString = " You entered " + totalGrades + "valid grades from 0 to 110. ";
			outputString = outputString + " Invalid grades are ignored!\n\n ";
			outputString = outputString + " The average = " + (int) averageOfGrades;
			outputString = outputString + " with a standard deviation = " + (int) StandardDeviationOfGrades + "\n\n";
			outputString = outputString + " The grade distribution is: \n\n";
			outputString = outputString + " A+ = " + numberOfAplus + "\n";
			outputString = outputString + " A = " + numberOfA + "\n";
			outputString = outputString + " A- = " + numberOfAminus + "\n";
			outputString = outputString + " B+ = " + numberOfBplus + "\n";
			outputString = outputString + " B = " + numberOfB + "\n";
			outputString = outputString + " B- = " + numberOfBminus + "\n";
			outputString = outputString + " C+ = " + numberOfCplus + "\n";
			outputString = outputString + " C = " + numberOfC + "\n";
			outputString = outputString + " C- = " + numberOfCminus + "\n";
			outputString = outputString + " D = " + numberOfD + "\n";
			outputString = outputString + " F = " + numberOfF + "\n";
		} else {
			outputString = " You did not enter enough grades to analyze. Please enter at least 2 valid grades ";

		}
		return outputString;
	}
}
