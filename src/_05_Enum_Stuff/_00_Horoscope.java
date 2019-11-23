package _05_Enum_Stuff;

import javax.swing.JOptionPane;

import _04_Intro_To_Enums.IntroToEnums.DataTypes;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs.

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane
	// to display
	// a different horoscope based on the Zodiac's state.
	public void Zod(Zodiac zod) {
		// They can also be used in a switch statement
		switch (zod) {
		// Notice that 'DataTypes.' is not requires when accessing categories
		case ARIES: {

			break;
		}
		case TAURUS: {

			break;
		}
		case GEMINI: {

			break;
		}
		case CANCER: {

			break;
		}
		case LEO: {

			break;
		}
		case VIRGO: {

			break;
		}
		case LIBRA: {

			break;
		}
		case SCORPIO: {

			break;
		}
		case SAGITTARIUS: {

			break;
		}
		case CAPRICORN: {

			break;
		}
		case AQUARIUS: {

		}
		case PISCES: {

		}
		}
	}

	// 3. Make a main method to test your method
	public static void main(String[] args) {

	}
}
