package Practice;

public class Expression {
    public static void main(String[] args) {
        short value1 = 101;
        final byte zero = 0;
        final byte three = 3;
        final byte six = 6;
        double value2 = 10000000.1;
        boolean condition1 = true;
        boolean condition2 = false;
        int expression1 = (value1 + zero) / three;
        System.out.println("("+ value1 + " + " + zero + ")/" + three + "=" + "->" + expression1);
        
        double expression2 = (three * Math.pow(10, (-six))) * value2; 

        System.out.println(expression2);
        
        boolean expression3 = condition1 && condition1;
        System.out.println("("+ condition1 + " && " + condition1 + ")" + "->" + expression3);
        
        boolean expression4 = condition1 && condition2;
        System.out.println("("+ condition2 + " && " + condition1 + ")" + "->" + expression4);

        boolean expression5 = (condition2 && condition2) || expression3;
        System.out.println("(("+ condition2 + " && " + condition2 + ")" + " || " + "(" + condition1 + " && " + condition1 +"))" + "->" + expression5);

        boolean expression6 = (condition2 || condition2) && expression3;
        System.out.println("(("+ condition2 + " || " + condition2 + ")" + " && " + "(" + condition1 + " && " + condition1 +"))" +  "->" + expression6);


    }
}
