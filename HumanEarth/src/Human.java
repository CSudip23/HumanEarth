
/**
 *
 * @author sudipchitroda
 */
public class Human {
    
    int age;
    int heightInCm;
    String name;
    String eyeColor;
    
    public Human(int Age, int HeightInCm, String Name, String EyeColor){
        
        this.age = Age;
        this.heightInCm = HeightInCm;
        this.name = Name;
        this.eyeColor = EyeColor;
        
    }
    
    public void eat(){
        System.out.println("Human is eating...");
    }
    
    public void sleep(){
        System.out.println("Human is sleeping");
    }
    
    public void speak(){
        System.out.println("Hello, my name is: " + name);
        System.out.println("My eye color is: " + eyeColor);
        System.out.println("My height in Cm is: "+ heightInCm);
        System.out.println("My age is: "+ age);
        
    }
    
    
}
