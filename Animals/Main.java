
package Animals;


public class Main 
{
    public static void main(String[] args) 
    {
        Animals sc = new Animals();
        sc.speak();
        
        sc = new Dog();
        sc.speak();
        
        sc = new Cat();
        sc.speak();
        
    }
    
}