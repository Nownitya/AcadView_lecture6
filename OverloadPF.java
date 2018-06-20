
public class OverloadPF 
{
    
    static void print()
    {
        System.out.println("Null Argument : ");
        
    }
    static void  print(int a)
    {
        System.out.println("One Integer Argument : "+a);        
        
    }
    static void print(float b)
    {
        System.out.println("One Float Argument : "+b);
    }
    public static void main(String[] args) 
    {
        int a =1;
        float b = (float) 1.11;
        
        OverloadPF.print();
        OverloadPF.print(a);
        OverloadPF.print(b);
        
        
    }
    
}
