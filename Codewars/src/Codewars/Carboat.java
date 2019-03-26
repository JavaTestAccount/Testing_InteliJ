package study_works;

public class Carboat {

    public static String howmuch(int m, int n) {
        int max;
        int min;
        int boats;
        int cars;
        int amount;
        String finalResult = "[";

        if (m >= n) {
            max = m;
            min = n;
        } else {
            min = m;
            max = n;
        }
        for (int x = min; max >= x; x++) {

            if (((x - 2) % 7 == 0) && ((x - 1) % 9 == 0)) {
                boats = ((x - 2) / 7);
                cars = ((x - 1) / 9);
                amount = x;
                finalResult += "[M: " + amount + " B: " + boats + " C: " + cars + "]";
            }
        }
        return finalResult + "]";
    }
}
