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
    public String CalculatorWelcome() {
        return calculatorImpl.welcome();
    }

    @GetMapping("/plus")
    public String CalculatorPlus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorImpl.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String CalculatorMinus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorImpl.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String CalculatrorMultiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorImpl.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String CalculatorDivide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorImpl.divide(num1, num2);
    }

}
