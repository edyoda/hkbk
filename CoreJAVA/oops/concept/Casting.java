package oops.concept;

public class Casting{
	
	public static void main(String args[])
	{
		Dog dog = new Dog();
		Dog petDog = new PetDog();//upcasting
		Dog policeDog = new PoliceDog();//upcasting
		dog.getType();//upcasting
		dog.getClass();
		petDog.getType();
		petDog.getClass();
		policeDog.getType();
		policeDog.getClass();
		((PoliceDog)policeDog).secretId();//downcasting
	}
}


class Dog{ 
   public String getType () {
      System.out.println("NormalDog");
      return "NormalDog";
   }
 }

/**
 * Pet Dog has an extra method dogName()
 */   
class PetDog extends Dog{ 
   public String getType () {
      System.out.println("PetDog");
      return "PetDog";
   }
   public String dogName () {
      System.out.println("I don't have Name !!");
      return "NO Name";
   }
 }

/**
 * Police Dog has an extra method secretId()
 */
class PoliceDog extends PetDog{

 public String secretId() {
    System.out.println("ID");
    return "ID";
 }

 public String getType () {
     System.out.println("I am a Police Dog");
     return "Police Dog";
 }
}