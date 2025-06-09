
import java.util.Scanner;


public class fibanacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.println("enter the no.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n ; i++)
        {
            i=a+b;
            a=b;
            b=i;
            System.out.println(i);
        }
    }
}
