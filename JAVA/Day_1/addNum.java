import java.util.Scanner;
public class addNum 
{
    public static void main(String [] arr)
        {
            System.out.println("enter two nums for addtion");
            Scanner msd=new Scanner(System.in);
        int num1=msd.nextInt();
        int num2=msd.nextInt();
        addNum.add(num1,num2);
        addNum.addDigit(num1);
            msd.close();
        }
    static void add(int a,int b)
        {
            int sum=a+b;
            System.out.println("addition is : "+sum);
        }
    static void addDigit(int num)
        {
            int temp;
            int sum =0;
            while(num!=0)
            {
                temp = num%10;
                sum= sum+temp;
                num = num/10;
            }
            System.out.println("addition is : "+sum);
            
        }
  
}
