/**
 *
 * @author sudipchitroda
 */
public class Earth {
    
    public static void main(String[] args) {
        
        Human human1 = new Human(23,167,"Sudip","Brown");
        human1.eat();
        human1.sleep();
        System.out.println();
        human1.speak();
        System.out.println();
        
        Human human2 = new Human(23,167,"Tarishi","Black");
        human2.speak();
    }
    
}
