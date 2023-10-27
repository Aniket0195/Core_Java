public class arrayOfObj 
{
  arrayOfObj()
  {
    System.out.println("msd the GOAT");
  }
    public static void main(String[] args) 
    {
      arrayOfObj[] objs=new arrayOfObj[5];

     for(int i=0;i<5;i++)
     {
       objs[i]=new arrayOfObj();
     }
        
    }
    
}
