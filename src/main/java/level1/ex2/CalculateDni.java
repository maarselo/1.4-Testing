package level1.ex2;

public class CalculateDni {
    private static final char[] letters = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J',
            'Z', 'S', 'Q', 'V', 'H', 'L', 'C',
            'K', 'E'};

    public static char calculateDni(int number) {
        if (number < 0 || number > 99999999)
            throw  new IllegalArgumentException("Invalid dni number");
        return (letters[number % 23]);
    }
}
