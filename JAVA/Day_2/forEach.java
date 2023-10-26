import java.util.Scanner;
public class forEach 
{
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
        int s=0;
        for(int val:arr)
        {
            s=s+val;
        }
        System.out.println("addition of array elements : "+s);
        
    }
    
}
