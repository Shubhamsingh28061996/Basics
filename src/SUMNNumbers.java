import java.util.Scanner;
public class SUMNNumbers {
    public static  void main(String... s) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       /* int counter = 1;
        int sum = 0;
        while (counter <= n) {
            sum = sum + counter;
            counter++;
        }
        System.out.println(sum); */

 // instead of using loops we can also use the below formula for sum of N natural numbers.

 System.out.println((n*(n+1))/2);

    }
}
