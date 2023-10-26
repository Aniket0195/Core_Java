import java.util.Scanner;
public class menuDrive 
{
    
     static void printTable(int num)
     {
        
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"*"+ i +"="+(num*i));
        }
    
     }

     static void printPattern(int num)
    {
       for(int i=0;i<=num;i++)
       {
        for(int j=0;j<=i;j++)
        {
           System.out.print("*");
        }
         System.out.println();
       }
    }

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
       
    
       
public static void main(String [] args)

        {
           Scanner sc = new Scanner(System.in);
           int choice;
           
           
           do{
                
                 System.out.println("enter a choice ");
                 System.out.println("1:table");
                System.out.println("2:pattern");
                System.out.println("3:prime or not");
                System.out.println("0:exit");
                choice= sc.nextInt();
                switch(choice)
                {
                    
                    case 1: 
                        System.out.println("Enter the num which you want to print table");
                        int num=sc.nextInt();
                        menuDrive.printTable(num);
                            break;
                    case 2:
                    menuDrive.printPattern(4);
                        break;

                        case 3:
                        menuDrive.primeOrNot();
                       // break;
                  

                }
            }
            while(choice!=0);
            System.out.println("program is terminiate");
              
            sc.close();
        }
    
}
