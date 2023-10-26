public class wrapperClass 
{
    public static void main(String[] args) 
    {
        String s="Test_Kisng";
        String s1="Hello";
        String s2="Hello";
        String s3="Welcome";
        String s4="Welcome";
        String s5=new String("Hello");

        System.out.println(s1==s5);//false
        System.out.println(s1.equals(s5));//true
        System.out.println(s1.compareTo(s5));//positive value
        System.out.println(s1.compareTo(s3));//negetive value
         


        System.out.println(s3.toUpperCase());
          System.out.println(s3.toLowerCase());
       String t1="abcpqrpxyz";
       //System.out.println(t1.split(","));
       String [] so=t1.split("p");
       
       System.out.println(so[0]+"    "+so[1]+"    "+so[2]);
     
       System.out.println(s.lastIndexOf("s"));
         //lastIndexOf it will search charcater from where last position 
       System.out.println(s.indexOf("s"));
       //indexOf it will search charcater from front position
    }
    
}
