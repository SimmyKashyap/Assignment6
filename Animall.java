interface animal{
	public void speak();
	public void eat();
	
}
class cat implements animal{
	public void speak(){
		System.out.println("cat is speaking");
	}
	public void eat(){
		System.out.println("cat is eating");
	}
}
class dog implements animal{
	public void speak(){
		System.out.println("dog is speaking");
	}
	public void eat(){
		System.out.println("dog is eating");
	}
}
class Animall{
	public static void main(String[] args){
		cat c=new cat();
		dog d=new dog();
		c.speak();
		c.eat();
		d.speak();
		d.eat();
	}
}