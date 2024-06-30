package ru.Skypro.CalculatorTest.calculatorServis;

import org.springframework.stereotype.Service;
import ru.Skypro.CalculatorTest.calculatorIntrerface.CalculatorInterface;
import ru.Skypro.CalculatorTest.exception.DeleteZeroException;


@Service

public class CalculatorImpl implements CalculatorInterface {
    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(int num1, int num2) {
        int num3 = num1 + num2;
        return num1 + "+" + num2 + "=" + num3;
    }

    @Override
    public String minus(int num1, int num2) {
        int num3 = num1 - num2;
        return num1 + "-" + num2 + "=" + num3;
    }

    @Override
    public String multiply(int num1, int num2) {
        int num3 = num1 * num2;
        return num1 + "*" + num2 + "=" + num3;
    }

    @Override
    public String divide(int num1, int num2) {
        if (num2 == 0) {
            throw new DeleteZeroException("на ноль делить нельзя");
        } else {
            int num3 = num1 / num2;
            return num1 + "/" + num2 + "=" + num3;
        }
    }
}