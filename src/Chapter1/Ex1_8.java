package Chapter1;

/*
(Area and perimeter of a circle) Write a program that displays the area and pe-
rimeter of a circle that has a radius of 5.5 using the following formulas:

perimeter = 2 * radius * pi
area = radius * radius * pi

*/

public class Ex1_8 {
    public static void main(String[] args) {

        double radius = 5.5;
        double perimeter = 2 * radius * 3.14;
        double area = radius * radius * 3.14;

        System.out.println(perimeter);
        System.out.println(area);

    }

}
