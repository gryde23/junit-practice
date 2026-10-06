import org.example.task1.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "0, 0, 0",
            "-1, 1, 0",
            "1000000, 1, 1000001"
    })
    void shouldReturnSumOfInts(int a, int b, int expResult) {
        Calculator calculator = new Calculator();


        int result = calculator.add(a, b);

        assertEquals(expResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "100, 10, 90",
            "10, 20, -10",
            "-10, -10, 0",
            "1000000, 1, 999999"
    })
    void shouldReturnSubstructOfInts(int a, int b, int expResult) {
        Calculator calculator = new Calculator();

        int result = calculator.substruct(a, b);

        assertEquals(expResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "10000, 10000, 100000000",
            "1, 0, 0",
            "-10, 10, -100",
            "-2, -2, 4",
            "5, 1, 5"
    })
    void shouldReturnProductOfInts(int a, int b, int expResult) {
        Calculator calculator = new Calculator();

        int result = calculator.multiply(a, b);

        assertEquals(expResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "1000, 10, 100",
            "1, 2, 0.5",
            "-10, 1, -10",
            "-2, -2, 1",
            "1000000, 1000, 1000",
            "0, 10, 0"
    })
    void shouldReturnDivideOfInts(int a, int b, double expResult) {
        Calculator calculator = new Calculator();

        double result = calculator.divide(a, b);

        assertEquals(expResult, result);
    }

    @Test
    void shouldReturnThrowWhenDivideByZero() {
        Calculator calculator = new Calculator();
        int a = 100;
        int b = 0;

        assertThrows(ArithmeticException.class, () -> calculator.divide(a, b));
    }
}
