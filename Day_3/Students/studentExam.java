import java.util.Scanner;
public class studentExam {
   static stuInfo [] stu;
    static
    {
        stu=new stuInfo[5];
        stu[0]=new stuInfo(1,"chomu");
        stu[1]=new stuInfo(2,"talent");
        stu[2]=new stuInfo(3,"jamya");
        stu[3]=new stuInfo(4,"rahulya");
        stu[4]=new stuInfo(5,"ajya");
        int cnt=5;
    }

    public static void addPerson()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id :");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("enter name :");
        String name=sc.nextLine();
        stu[4]=new stuInfo(id,name);
        cnt++;
    }
}
