package ru.Skypro.CalculatorTest.calculatorController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.Skypro.CalculatorTest.calculatorServis.CalculatorImpl;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorImpl calculatorImpl;

    public CalculatorController(CalculatorImpl calculatorImpl) {
        this.calculatorImpl = calculatorImpl;
    }

    @GetMapping()
    public String сalculatorWelcome() {
        return calculatorImpl.welcome();
    }

    @GetMapping("/plus")
    public String сalculatorPlus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorImpl.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String сalculatorMinus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorImpl.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String сalculatrorMultiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorImpl.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String сalculatorDivide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorImpl.divide(num1, num2);
    }

}
