package Chapter1;

public class Ex1_10 {
    public static void main(String[] args) {

        double kilometers = 14;
        double miles = kilometers / 1.6;

        double timeInSeconds = (45*60) + 30;
        double timeInHours = timeInSeconds / 3600;

        double averageSpeedInMilesPerHour = miles / timeInHours;

        System.out.println(averageSpeedInMilesPerHour);

    }

}
