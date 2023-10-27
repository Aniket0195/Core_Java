public class person_1 {
// In java 
      int pid;
     String pname;

     person_1()
     {
       // this(0,null);//==>this is object which implicitly call parameterized constructor
       //when we dont pass any argument in this object it will cause recursion ==>error
          System.out.println("Def");
        
        pid=0;
        pname=null;
      
     }
     person_1(int pid,String pname)
     {
        this.pid=pid;
        this.pname=pname;
        System.out.println("para");
     }

    //  void displayData() {
    //     System.out.println("pid = "+pid);   //we can't use this pointer in static fun there we create non stacic function 
    //     System.out.println("pname = "+pname);        
    //  }
     public String toString()
     {
            return "pid : "+pid+" pname : "+pname;
     }



    public static void main(String[] args)
     
    {
        person_1 obj=new person_1(7," MSD");
        System.out.println(obj);
        
        
    }
    
}
