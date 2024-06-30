package ru.Skypro.CalculatorTest.calculatorServis;


import org.junit.jupiter.api.Test;
import ru.Skypro.CalculatorTest.exception.DeleteZeroException;


import static org.junit.jupiter.api.Assertions.*;

class CalculatorImplTest {
    CalculatorImpl calculatorImpl = new CalculatorImpl();
    int num1 = 2;
    int num2 = 1;
    int zero = 0;

    @Test
    void correctWelcomeTest() {
        String actual = "Добро пожаловать в калькулятор";
        String expected = calculatorImpl.welcome();
        assertEquals(actual, expected);

    }

    @Test
    void correctPlusTest() {
        int num3 = num1 + num2;
        String actual = num1 + "+" + num2 + "=" + num3;
        String expected = calculatorImpl.plus(num1, num2);
        assertEquals(actual, expected);
    }

    @Test
    void correctMinusTest() {
        int num3 = num1 - num2;
        String actual = num1 + "-" + num2 + "=" + num3;
        String expected = calculatorImpl.minus(num1, num2);
        assertEquals(actual, expected);
    }

    @Test
    void correctMultiplyTest() {
        int num3 = num1 * num2;
        String actual = num1 + "*" + num2 + "=" + num3;
        String expected = calculatorImpl.multiply(num1, num2);
        assertEquals(actual, expected);
    }

    @Test
    void correctDivideTest() {
        int num3 = num1 / num2;
        String actual = num1 + "/" + num2 + "=" + num3;
        String expected = calculatorImpl.divide(num1, num2);
        assertEquals(actual, expected);
    }

    @Test
    void correctDivideZeroTest() {
        assertThrows(
                DeleteZeroException.class, () -> calculatorImpl.divide(num1, zero));
    }
}

