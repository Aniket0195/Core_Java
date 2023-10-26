import java.util.Scanner;

class MAIN{ 
    public static void main(String [] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the no:");
            int num=sc.nextInt();
            int i;
             sc.close();
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
