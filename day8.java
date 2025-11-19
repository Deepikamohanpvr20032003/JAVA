interface Vehicle{
   void start(); 
   void stop();
}
interface FuelBased{
 void refuel();
}

class car implements Vehicle,FuelBased{
    public void start() {
      System.out.println("car engine started");
   }

   public void stop() {
      System.out.println("car engine stopped");
   } 
   public void refuel() {
      System.out.println("car is refueling at the station");
   } 
}
class ElectricScooter implements Vehicle{
    public void start() {
      System.out.println("Electric scooter powered on");
   }

   public void stop() {
      System.out.println("Electric scooter powered off");
   } 
}
public class RentalSystem{
   public static void main(String args[]) {
      car a = new car();
      a.start();
      a.stop();
      a.refuel();

      ElectricScooter b = new ElectricScooter();
        b.start();  
        b.stop();
   }
}


