public class stuInputData 
{
    public static void main(String[] args) 
    {
        stuInfo ob1=new stuInfo(7,"msd");
        ob1.displayStudent();
        System.out.println(ob1);//it give instance object like(stuInfo@15db9742)
        stuInfo ob2=new stuInfo(18,"virat");
        ob2.displayStudent();
    }
    
}
