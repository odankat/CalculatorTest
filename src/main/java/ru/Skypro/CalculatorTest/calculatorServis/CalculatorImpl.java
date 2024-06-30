package ru.Skypro.CalculatorTest.calculatorServis;

import org.springframework.stereotype.Service;
import ru.Skypro.CalculatorTest.calculatorIntrerface.CalculatorInterface;
@Service

public class CalculatorImpl implements CalculatorInterface {
    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }
}
