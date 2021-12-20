package LAB21;

class Animal{
	int legs;
	String name;
	Animal(int legs){
		this.legs = legs;
	}
	
	void walk(int legs) {
		System.out.println("This animal walks on "+(legs)+(" legs."));
	}
	void eat() {
		System.out.println("");
	}
}

interface Pet{
	String getName();
	void setName(String name);
	void play();
}

class Spider extends Animal{
	Spider(int legs){
		super(legs);
	}
	void eat() {
		System.out.println("Spider eats insects.");
	}
}

class Cat extends Animal implements Pet{
	
	Cat (int legs, String name){
		super(legs);
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Cat likes to play with a ball.");
	}	
	
	void eat() {
		System.out.println("Cat eats fishes.");
	}
}

class Fish extends Animal implements Pet{
	
	Fish(int legs,String name) {
		super(legs);
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Fish likes to swim around.");
	}
	
	void eat() {
		System.out.println("Fish eats plants.");
	}
	void walk(int legs) {
		System.out.println("Fish has no legs.");
	}
	
}


public class InterfaceInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal A = new Animal(4);
		
		//Fish
		System.out.println("Fish");
		Fish F = new Fish(0,"Mimi");
		System.out.println("This fish's name is "+F.getName());
		F.eat();
		F.walk(0);
		F.setName("Momo");
		System.out.println("This fish's name is "+F.getName()+"\n");
		
		//Cat
		System.out.println("Cat");
		Cat C = new Cat(4,"Fluffy");
		System.out.println("This cat's name is "+C.getName());
		C.walk(4);
		C.eat();
		C.setName("Moose");
		System.out.println("This Cat's name is "+C.getName()+"\n");
		
		//Spider
		System.out.println("Spider");
		Spider S = new Spider(8);
		S.eat();
		S.walk(8);
		
		
	}

}
