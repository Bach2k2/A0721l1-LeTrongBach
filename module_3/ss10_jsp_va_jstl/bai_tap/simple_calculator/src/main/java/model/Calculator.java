package model;

public class Calculator {
    public static double calculate(double firstNum,double secondNum,String operator)
    {
        switch (operator)
        {
            case "+":
            {
                return firstNum+secondNum;
            }
            case "-":
            {
                return firstNum-secondNum;
            }
            case "*":
            {
                return firstNum*secondNum;
            }
            case "/":
            {
                if(secondNum!=0)
                return firstNum/secondNum;
                else{
                    throw new RuntimeException("Divided by zero");
                }
            }
            default:
                throw new RuntimeException("Invalid Operator");
        }
    }
}
