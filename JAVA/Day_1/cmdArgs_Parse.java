 class cmdArgs_Parse
{
    public static void main(String [] args)
    {
        if(args.length>=2)
        {
            int sum=0;
            for (int i=0;i<args.length;i++)
            {
                sum = sum +Integer.parseInt(args[i]);
                // parsing is used to convert the string into integer
               // sum = sum +Float.parseFloat(args[i]); => we can also parse into other datatype

            }
            System.out.println("Result: "+ sum);
        }
        else
        {
            System.out.println("Enter min 2 arguments");
        } 
    }
}
    
/* to run on  terminal
1=>  javac cmdArgs_Parse.java
 2=> java cmdArgs_Parse 7 18

7 and 18 are the arguments
*/
