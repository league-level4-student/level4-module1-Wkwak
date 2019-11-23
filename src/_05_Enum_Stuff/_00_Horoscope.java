package _05_Enum_Stuff;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import _04_Intro_To_Enums.IntroToEnums.DataTypes;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs.
	JFrame frame = new JFrame();

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane
	// to display
	// a different horoscope based on the Zodiac's state.
	public void Zod(Zodiac zod) {
		// They can also be used in a switch statement
		switch (zod) {
		// Notice that 'DataTypes.' is not requires when accessing categories
		case ARIES: {
			JOptionPane.showMessageDialog(frame, "Aries");
			break;
		}
		case TAURUS: {
			JOptionPane.showMessageDialog(frame, "Taurus");
			break;
		}
		case GEMINI: {
			JOptionPane.showMessageDialog(frame, "Gemini");
			break;
		}
		case CANCER: {
			JOptionPane.showMessageDialog(frame, "Cancer");
			break;
		}
		case LEO: {
			JOptionPane.showMessageDialog(frame, "Leo");
			break;
		}
		case VIRGO: {
			JOptionPane.showMessageDialog(frame, "Virgo");
			break;
		}
		case LIBRA: {
			JOptionPane.showMessageDialog(frame, "Libra");
			break;
		}
		case SCORPIO: {
			JOptionPane.showMessageDialog(frame, "Scorpio");
			break;
		}
		case SAGITTARIUS: {
			JOptionPane.showMessageDialog(frame, "Saggitarius");
			break;
		}
		case CAPRICORN: {
			JOptionPane.showMessageDialog(frame, "Capricorn");
			break;
		}
		case AQUARIUS: {
			JOptionPane.showMessageDialog(frame, "Aquarius");
			break;
		}
		case PISCES: {
			JOptionPane.showMessageDialog(frame, "Pisces");
			break;
		}
		}
	}

	// 3. Make a main method to test your method
	public static void main(String[] args) {
		_00_Horoscope hs = new _00_Horoscope();
		hs.Zod(Zodiac.VIRGO);
	}
}
