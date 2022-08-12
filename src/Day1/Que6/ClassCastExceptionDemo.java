package Day1.Que6;

public class ClassCastExceptionDemo {

	public static void main(String[] args) {
		Animal a1= new Animal();
		a1.eat("horse");

		cat c1 = (cat) new dog();
//		here we get class cast exception
		c1.eat("mickey");
		
		/*
		 *  Animal a = new Dog();
			Dog d = (Dog) a; // No problem, the type animal can be casted to a dog, because it's a dog.
			Cat c = (Dog) a; // Will cause a compiler error for type mismatch; you can't cast a dog to a cat.
		 * */
		
	}

}

class Animal{
	public void eat(String s) {
		System.out.println("Eat anything");
	}
	
}
class dog extends Animal{
	@Override
	public void eat(String s) {
		System.out.println("eat meet");
	}
}

class cat extends dog{
	@Override
	public void eat(String s) {
		System.out.println("eat biscuit");
	}
}
