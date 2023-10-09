package Opgaver;

public class udregn_vha_loops {
    public static void main(String[] args) {

        int sum = 0, i = 0;
        for (int j = 1; j <= 20; j++) {
            for (i = 1; i <= j; i++) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of series = " + sum);

    }
}
