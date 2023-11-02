import java.util.Scanner;
public class PrimeOrNot {
	static void primeOrNot()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        int num=sc.nextInt();
        int i;

        // sc.close();.......here no need to close scanner ,it is always need to close in only main function
        //if here you try to close it then it give exceptio handling

        for( i=2;i<num;i++)
        {
            if(num%i==0)
            break;
        }
        if(num==i)
        System.out.println("prime");
        else
        System.out.println("not prime");
    }

}
