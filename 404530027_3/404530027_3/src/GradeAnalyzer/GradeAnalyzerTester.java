/*
 * [A]96
 * [TA's Advise]
 * 1. �A���Ψ�private, final�o�ح׹��r�ܴ�.
 * 2. �����ܼƦW�٨��Ӫ��F�n������.
 * 3. ��ı�o�зǮt�����A�i�H�⥦�g�o��²��@�I.
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
			input = JOptionPane.showInputDialog(null, " please input the grades�G ");

			if (input.equalsIgnoreCase("q") == true || input.equalsIgnoreCase("Q") == true) {
				break;
			} else {
				s.add(input);
			}
		}

		// ��ı�o�o�ˤ��}�g���Ӧn, ���Ӹ�while��b�@�_, -2.

		try {
			for (int i = 0; i < s.size(); i++) {
				G.addGrade(Double.parseDouble(s.get(i)));
			}
		}

		catch (Exception e) {
			JOptionPane.showMessageDialog(null, " please enter valid number�I ");
		}

		// �èS���ˬd���\��J���ӼƳ�, -2.
		G.analyzeGrades();
		JOptionPane.showMessageDialog(null, G.toString());

	}
}
