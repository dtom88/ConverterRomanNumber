package converter;

public class Converter {
	public static String convert(int number) {
		String romeNumber = "";
		int countH = number / 100;
		int countD = (number % 100) / 10;
		int countUn = number % 10;

		if (countH == 9) {
			romeNumber = "CM";
		}
		if (countH >= 5 && countH < 9) {
			romeNumber = "D";
			for (int i = 0; i < countH - 5; i++) {
				romeNumber += "C";
			}
		}
		if (countH == 4) {
			romeNumber = "CD";
		}
		if (countH < 4) {
			for (int i = 0; i < countH; i++) {
				romeNumber += "C";
			}
		}

		if (countD == 9) {
			romeNumber += "XC";
		}
		if (countD >= 5 && countD < 9) {
			romeNumber += "L";
			for (int i = 0; i < countD - 5; i++) {
				romeNumber += "X";
			}
		}
		if (countD == 4) {
			romeNumber += "XL";
		}
		if (countD < 4) {
			for (int i = 0; i < countD; i++) {
				romeNumber += "X";
			}
		}

		if (countUn == 9) {
			romeNumber += "IX";
		}
		if (countUn >= 5 && countUn < 9) {
			romeNumber += "V";
			for (int i = 0; i < countUn - 5; i++) {
				romeNumber += "I";
			}
		}
		if (countUn == 4) {
			romeNumber += "IV";
		}
		if (countUn < 4) {
			for (int i = 0; i < countUn; i++) {
				romeNumber += "I";
			}
		}
		return romeNumber;
	}

}
