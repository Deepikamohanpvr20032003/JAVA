interface Animal{
    void makeSound();
    void move();
}

class Bird implements Animal{
    public void makeSound() {
      System.out.println("chirp");
   }

   public void move() {
      System.out.println("fly");
   } 
   
}
class Dog implements Animal{
    public void makeSound() {
      System.out.println("Bark");
   }

   public void move() {
      System.out.println("Run");
   } 
}
public class Zoo{
   public static void main(String args[]) {
      Bird a = new Bird();
        a.makeSound();
        a.move();
      Dog b = new Dog();
        b.makeSound();  
        b.move();
   }
}