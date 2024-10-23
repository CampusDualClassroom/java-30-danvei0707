package com.campusdual.classroom;

public class Exercise30 {

    public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException{
        if (divisor == 0){
            throw new DivisionByZeroException();
        } else {
            return dividend / divisor;
        }
    }

    public static void main(String[] args) {
        try {
            int i = divisionWithCustomException(1651425, 0);
        }
        catch (DivisionByZeroException e){
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
