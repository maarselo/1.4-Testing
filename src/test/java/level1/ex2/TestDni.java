package level1.ex2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class TestDni {

    @ParameterizedTest
    @CsvSource({
            "Z, 12345678",
            "X, 87654321",
            "H, 11111111",
            "J, 22222222",
            "P, 33333333",
            "A, 44444444",
            "K, 55555555",
            "Q, 66666666",
            "B, 77777777",
            "Y, 88888888"
    })
    void testCalculatorDni(char correctLetter, int numero) {
        assertEquals(correctLetter, CalculateDni.calculateDni(numero));
    }
}
