import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("nece olculu bir array yaratmaq isteyirsiniz");
        int number = scanner.nextInt();
        int[] numbers = new int[number];
        int i = 0;

        while (numbers.length > i) {

            numbers[i] = new Scanner(System.in).nextInt();
            System.out.println(numbers[i]);
            i++;
        }
        int maxbir = numbers[0];

        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] >= maxbir) {
                maxbir = numbers[i];
            }

        }
        System.out.println("En boyuk ededin" + maxbir);

        if (maxbir % 2 == 0) {

            int factorial =1 ;

            for ( i = 1; i <= maxbir; i++) {
                factorial = factorial * i;
            }

            System.out.println(factorial);

        } else

            System.out.println(maxbir);
    }}
















