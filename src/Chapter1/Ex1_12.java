package Chapter1;

public class Ex1_12 {
    public static void main(String[] args) {

        double miles = 24;
        double kilometers = miles * 1.6;

        double timeInSeconds = 3600 + (40*60) + 35;
        double timeInHours = timeInSeconds / 3600;

        double averageSpeedInKilometersPerHour = kilometers / timeInHours;

        System.out.println(averageSpeedInKilometersPerHour);

    }

}
