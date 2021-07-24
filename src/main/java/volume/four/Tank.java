package volume.four;
//Exercise 12:Create a class called Tank that can be filled and emptied, and has a termination condition that it must be empty when the object is cleaned up.
// Write a finalize( ) that verifies this termination condition.
// In main( ), test the possible scenarios that can occur when your Tank is used.
public class Tank {
    boolean fillout= false;
   Tank(boolean fillout){
       fillout=true;
       System.out.println("Tank is filled");
   }
   void isEmpty(){
       fillout=false;
       System.out.println("Tank is empty");
   }
   protected void finalize(){
       if(!fillout){
           System.out.println("Error: The Tank is not empty");
       }
   }
    public static void main(String[] args) {
        Tank tank=new Tank(true);
        tank.isEmpty();
        new Tank(true);
        System.gc();
    }
}
