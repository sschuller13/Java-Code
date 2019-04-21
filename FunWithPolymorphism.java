
public class FunWithPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet p = new Pet();
		System.out.println("Pet say :"+ p.speak());
		
		PetCat pc = new PetCat();
		System.out.println("Cat says:"+ pc.speak());
		
		PetDog pd = new PetDog();
		
		System.out.println("Dog says:"+pd.speak());
		System.out.println("Dog says:"+pd.fetch());
		
		p = new PetDog();
		System.out.println("New pet dog says: " + p.speak());
		//this one will act weird depending on subclass methods, reference picture on phone
		p = new PetCat();
		System.out.println("New pet cat says: " + p.speak());
	}

}

class Pet
{
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String petName) {
		name = petName;
	}
	public String speak( ) {
		return "I'm your cuddly little pet.";
	}

}
// petdog doesnt override pet's speak moethod but does in clude a new fetch method
class PetDog extends Pet
{
	public String fetch( ) {
		return "Yes, master. Fetch I will.";
	}

}
//petcat overrides pet's speak method
class PetCat extends Pet
{
	public String speak( ) {
		return "Don’t give me orders.\n" +  "I speak only when I want to.";
	}

}