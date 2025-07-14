package level3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class TestCalculator {
    @Test
    public void TestAdditionOperation(){
        assertEquals(20, Calculator.addition(15, 5));
    }

    @Test
    public void TestSubtractionOperation() {
        assertEquals(10, Calculator.subtraction(15, 5));
    }

    @Test
    public void TestMultiplicationOperation(){
        assertEquals(75, Calculator.multiplication(15, 5));
    }

    @Test
    public void TestDivisionOperation(){
        assertEquals(3, Calculator.division(15, 5));
    }
    @Test
    public void TestRestDivision() {
        assertEquals(2, Calculator.restDivision(12, 5));
    }

    @Test
    public void TestPowOperation(){
        assertEquals(8.0, Calculator.pow(2, 3));
    }

    @Test
    public void TestDivisionBetweenZero() {
        assertThatThrownBy(()->Calculator.division(10, 0))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("It is not possible to divide by zero.");

    }

    @Test
    public void TestNumberIsEven() {
        assertThat(Calculator.isEven(4)).isTrue();
        assertThat(Calculator.isEven(5)).isFalse();
    }

    @Test
    public void TestNumberIsOdd() {
        assertThat(Calculator.isOdd(5)).isTrue();
        assertThat(Calculator.isOdd(4)).isFalse();
    }

}
