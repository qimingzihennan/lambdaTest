package cn.tsa.lambda.test;

import cn.tsa.lambda.test.api.GreetingService1;

public class Java8Tester {

    public static void main(String[] args) {
        Java8Tester tester = new Java8Tester();

       /* MathOperation addition = (int a, int b) -> a + b;

        MathOperation subtraction = (a, b) -> a - b;

        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };

        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        GreetingService greetingService = message -> {
            System.out.println("Hello " + message);
        };
        GreetingService greetingService1 = message -> {
            System.out.println("Hello " + message);
        };

        greetingService.sayMessage("Runoob");
        greetingService1.sayMessage("Google");

*/
        GreetingService1 greetingService11 = (message, code) ->{
           StringBuilder stringBuilder = new StringBuilder("收到的值为message:")
                   .append(message).append(",code").append(code);
           return stringBuilder.toString();
        };

        tester.operateMessage("1001","1002",greetingService11);
        tester.operateMessage("1003","1004",greetingService11);
        tester.operateMessage("1005","1006",greetingService11);
        tester.operateMessage("1007","1008",greetingService11);
        tester.operateMessage("1009","1010",greetingService11);
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    private void operateMessage(String message,String code,GreetingService1 greetingService1){
    String result = greetingService1.sayMessage1(message,code);
    System.out.println("result："+result+",message:"+message+",code:"+code);
}
}
