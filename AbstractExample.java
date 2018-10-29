abstract class Animals{
	String color;
	String breed;
	String name;
	abstract void eat();
	void speak(){
		System.out.println("Animal is speaking");
	}
	
}
class AbstractExample extends Animals{
	void eat(){
		System.out.println("Animals are eating");
	}
	public static void main(String[] args){
	AbstractExample ae=new AbstractExample();
	ae.eat();
	ae.speak();
}}