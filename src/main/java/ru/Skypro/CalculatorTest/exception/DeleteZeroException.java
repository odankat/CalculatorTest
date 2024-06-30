package ru.Skypro.CalculatorTest.exception;

public class DeleteZeroException extends IllegalArgumentException {
    public DeleteZeroException(String massage) {
        super(massage);
    }

}
