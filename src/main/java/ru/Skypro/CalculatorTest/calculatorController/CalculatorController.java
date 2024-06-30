package ru.Skypro.CalculatorTest.calculatorController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.Skypro.CalculatorTest.calculatorServis.CalculatorImpl;

@RestController
public class CalculatorController {
    private final CalculatorImpl calculatorImpl;

    public CalculatorController(CalculatorImpl calculatorImpl) {
        this.calculatorImpl = calculatorImpl;
    }

    @RequestMapping("/calculator")
    public String calculatorWelcome(){
        return calculatorImpl.welcome();
    }
}
