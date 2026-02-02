public class Main {
    public static void main(String[] args) {

        Calculator cal =new Calculator();//create object

        int exp1 = cal.square(cal.add(cal.multiply(3, 4),cal.multiply(5, 7)));

        int exp2 = cal.add(cal.square(cal.add(4, 7)),cal.square(cal.add(8,3)));

        System.out.println("Result 1 : " + exp1);
        System.out.println("Result 2 : " + exp2);


    }
}





public class Calculator {

    //method
    int add(int a, int b) {
        return a + b;
    }
    //method
    int multiply(int a, int b) {
        return a * b;
    }
    //method
    int square(int a) {
        return a * a;
    }


}
