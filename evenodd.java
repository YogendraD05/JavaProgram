import java.util.Scanner;
class evenodd implements Escape{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("eneter the no.");
        int num1=sc.nextInt();
    if(num1%2==0)
    {
        System.out.println("even");
    }
    else
    {
        System.out.println("the no. is odd");
    }

    }
}