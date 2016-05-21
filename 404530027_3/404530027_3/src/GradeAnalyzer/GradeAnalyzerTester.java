/*
 * [A]96
 * [TA's Advise]
 * 1. 你有用到private, final這種修飾字很棒.
 * 2. 有些變數名稱取太長了好難看懂.
 * 3. 我覺得標準差公式你可以把它寫得更簡單一點.
 * */

package GradeAnalyzer;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class GradeAnalyzerTester {
	public static void main(String[] args) {
		GradeAnalyzer G = new GradeAnalyzer();
		String input = "";
		ArrayList<String> s = new ArrayList<String>();

		while (true) {
			input = JOptionPane.showInputDialog(null, " please input the grades： ");

			if (input.equalsIgnoreCase("q") == true || input.equalsIgnoreCase("Q") == true) {
				break;
			} else {
				s.add(input);
			}
		}

		// 我覺得這樣分開寫不太好, 應該跟while放在一起, -2.

		try {
			for (int i = 0; i < s.size(); i++) {
				G.addGrade(Double.parseDouble(s.get(i)));
			}
		}

		catch (Exception e) {
			JOptionPane.showMessageDialog(null, " please enter valid number！ ");
		}

		// 並沒有檢查成功輸入的個數喔, -2.
		G.analyzeGrades();
		JOptionPane.showMessageDialog(null, G.toString());

	}
}
