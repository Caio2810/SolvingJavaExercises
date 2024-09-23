package Chapter1;

/*
(Approximate pi) pi can be computed using the following formula:

PI = 4 * (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + ...);

Write a program that displays the result of 4 * (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11));
and 4 * (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + (1/13);
*/

public class Ex1_7 {
    public static void main(String[] args) {

        double firstPI = 4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        double secondPI = 4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13));

        System.out.println(firstPI);
        System.out.println(secondPI);
    }

}
