class cmdArgs
{
    public static void main(String [] args)
    {
        if(args.length>=2)
        {
            System.out.println("Hello :"+ args[0]);
            System.out.println("Hello :"+ args[1]);
        }
        else 
        {
            System.out.println("Enter min 2 arguments");
        } 
    }
}