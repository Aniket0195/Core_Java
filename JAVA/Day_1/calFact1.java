import java.util.Scanner;
public class calFact1
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number ");
        num = sc.nextInt();
         int f=1;
        for(int i =2;i<=num;i++)
        {
           
            f = f * i;
        }
        System.out.println("factorial is: "+f);
        sc.close();
        // when we use scanner there ius need to close that scanner
    }
}
