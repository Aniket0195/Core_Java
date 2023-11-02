import java.util.Scanner;

public class menuDrive {public static void main(String [] args)

{
   Scanner sc = new Scanner(System.in);
   int choice;
   
   
   do{
        
         System.out.println("Enter a choice ");
         System.out.println("1:To print table");
        System.out.println("2:To print pattern");
        System.out.println("3:To print prime or not");
        System.out.println("0:Exit");
        choice= sc.nextInt();
        switch(choice)
        {
            
            case 1: 
                System.out.println("Enter the num which you want to print table");
                int num=sc.nextInt();
                Printable.printTable(num);
                    break;
            case 2:
            PrintPattern.printPattern(4);
                break;

                case 3:
                	PrimeOrNot.primeOrNot();
                break;
          

        }
    }
    while(choice!=0);
    System.out.println("program is terminiate");
      
    sc.close();
}

}

