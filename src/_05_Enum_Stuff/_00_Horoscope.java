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
			JOptionPane.showMessageDialog(frame, "ARIES");
			break;
		}
		case TAURUS: {
			JOptionPane.showMessageDialog(frame, "TAURUS");
			break;
		}
		case GEMINI: {
			JOptionPane.showMessageDialog(frame, "GEMINI");
			break;
		}
		case CANCER: {
			JOptionPane.showMessageDialog(frame, "CANCER");
			break;
		}
		case LEO: {
			JOptionPane.showMessageDialog(frame, "LEO");
			break;
		}
		case VIRGO: {
			JOptionPane.showMessageDialog(frame, "VIRGO");
			break;
		}
		case LIBRA: {
			JOptionPane.showMessageDialog(frame, "LIBRA");
			break;
		}
		case SCORPIO: {
			JOptionPane.showMessageDialog(frame, "SCORPIO");
			break;
		}
		case SAGITTARIUS: {
			JOptionPane.showMessageDialog(frame, "SAGITTARIUS");
			break;
		}
		case CAPRICORN: {
			JOptionPane.showMessageDialog(frame, "CAPRICORN");
			break;
		}
		case AQUARIUS: {
			JOptionPane.showMessageDialog(frame, "AQUARIUS");
			break;
		}
		case PISCES: {
			JOptionPane.showMessageDialog(frame, "PISCES");
			break;
		}
		}
	}

	// 3. Make a main method to test your method
	public static void main(String[] args) {
		_00_Horoscope hs = new _00_Horoscope();
		hs.Zod(Zodiac.AQUARIUS);
	}
}
