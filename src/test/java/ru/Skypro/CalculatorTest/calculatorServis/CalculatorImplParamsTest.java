package ru.Skypro.CalculatorTest.calculatorServis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorImplParamsTest {
    CalculatorImpl calculatorImpl = new CalculatorImpl();

    private static Stream<Arguments> provideArguments() {
        return Stream.of(Arguments.of(1, 1),
                Arguments.of(2, 3),
                Arguments.of(3, 4),
                Arguments.of(5, 3));
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    public void correctPlusTest(int num1, int num2) {
        int num3 = num1 + num2;
        String actual = num1 + "+" + num2 + "=" + num3;
        String expected = calculatorImpl.plus(num1, num2);
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    public void correctMinusTest(int num1, int num2) {
        int num3 = num1 - num2;
        String actual = num1 + "-" + num2 + "=" + num3;
        String expected = calculatorImpl.minus(num1, num2);
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    public void correctmultiplyTest(int num1, int num2) {
        int num3 = num1 * num2;
        String actual = num1 + "*" + num2 + "=" + num3;
        String expected = calculatorImpl.multiply(num1, num2);
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void correctDivideTest(int num1, int num2) {
        int num3 = num1 / num2;
        String actual = num1 + "/" + num2 + "=" + num3;
        String expected = calculatorImpl.divide(num1, num2);
        assertEquals(actual, expected);
    }
}
