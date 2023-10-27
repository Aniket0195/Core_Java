public class stuInfo 
{
    int stuid;
    String name;
    public stuInfo(int id,String name)
    {
       stuid=id;
      this. name=name;
    }
    void setStuId(int id)
    {
        stuid=id;
        
    }
     void setStuName(String name)
    {
        this.name=name;
        
    }
    
    int getStuId()
    {

        return stuid;
    }
    String getStuName()
    {

        return name;
    }
    void displayStudent()
    {
        System.out.println("student id is : "+stuid);
        System.out.println("student name is : "+name);
    }
    
}
