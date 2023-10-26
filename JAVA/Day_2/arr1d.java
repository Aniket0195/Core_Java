import java.util.Scanner;
public class arr1d {
    public static void main(String[] args) 
    {
        System.out.println("Enter the size of Array :");
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
                arr[i]=sc.nextInt();

        }

         for(int i=0;i<arr.length;i++)
        {
                System.out.print(arr[i] + " ");
                
        }
        
    }
}
