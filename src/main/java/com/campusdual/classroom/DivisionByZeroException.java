package com.campusdual.classroom;

public class DivisionByZeroException extends ArithmeticException{
    public DivisionByZeroException(){
        super("Cannot divide by Zero");
    }
}
