public class SquareDigit {

    public int squareDigits(int n) {
        String number = n + "";
        String[] digits = number.split("");
        String squaredNum = "";

        for (int i = 0; i < digits.length; i++) {
            squaredNum += Integer.parseInt(digits[i]) * Integer.parseInt(digits[i]) + "";
        }

        return Integer.parseInt(squaredNum);
    }

}