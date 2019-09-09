import java.util.Scanner;
public class CalculateSimpleInterest {
    public static void main(String... s)
    {
        Scanner sc=new Scanner(System.in);
        int Principal=sc.nextInt();
        int Rate=sc.nextInt();
        int Time=sc.nextInt();
        double SI=(Principal*1.0*Rate*1.0*Time*1.0)/100;
        System.out.println("Simple Interest is "+ SI);
    }
}
