package Chapter1;

public class Ex1_13 {
    public static void main(String[] args) {

        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;
        double determinant = (a*d) - (b*c);

            if (determinant != 0) {
                double x = (e*d - b*f) / determinant;
                double y = (a*f - e*c) / determinant;
                System.out.println(x);
                System.out.println(y);
            } else {
                System.out.println("ad - bc = 0");
            }


    }

}
