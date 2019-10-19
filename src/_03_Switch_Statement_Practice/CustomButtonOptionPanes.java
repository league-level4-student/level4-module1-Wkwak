package _03_Switch_Statement_Practice;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		JFrame frame = new JFrame();
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			JOptionPane.showMessageDialog(frame, "The 57 on Heinz ketchup bottles represents the number of varieties of pickles the company once had.");
			break;
		case "Monday":
			JOptionPane.showMessageDialog(frame, "Karoke means \"empty orchestra\" in Japanese.");
			break;
		case"Wednesday":
			JOptionPane.showMessageDialog(frame, "The first known contraceptive was crocodile dung, used by Egyptians in 2000 B.C.");
			break;
		case"Thursday":
			JOptionPane.showMessageDialog(frame, "Isaac Asimov is the only author to have a book in every Dewey-decimal category.");
			break;
		case"Friday":
			JOptionPane.showMessageDialog(frame, "The Australian $5 to $100 notes are made of plastic.");
			break;
		case"Saturday":
			JOptionPane.showMessageDialog(frame, "The word \"nerd\" was first coined by Dr. Seuss in \"If I Ran the Zoo.\"");
			break;

		}
	}
}
