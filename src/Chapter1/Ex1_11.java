package Chapter1;

import java.text.DecimalFormat;

public class Ex1_11 {
    public static void main(String[] args) {

        DecimalFormat formatter = new DecimalFormat("#,###");

        double currentPopulation = 312032486;
        double secondsInDay = 3600 * 24;
        double secondsInYear = secondsInDay * 365;
        double birthsPerYear = secondsInYear / 7;
        double deathsPerYear = secondsInYear / 13;
        double immigrantsPerYear = secondsInYear / 45;

        for (int i = 1; i <= 5; i++) {
            currentPopulation = currentPopulation + birthsPerYear + immigrantsPerYear - deathsPerYear;
            System.out.println("Year: " + i + ", Population: " + formatter.format(currentPopulation));
        }
    }
}
