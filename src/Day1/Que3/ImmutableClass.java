package Day1.Que3;

public final class ImmutableClass {
	private final String name  ;
	private final int roll ; 


	public String getName() {
		return name;
	}


	public int getRoll() {
		return roll;
	}


	public ImmutableClass(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}


	public static void main(String[] args) {
		ImmutableClass iClass = new ImmutableClass("Anup", 01);
		System.out.println(iClass.toString());
		
	}


	@Override
	public String toString() {
		return "ImmutableClass [name=" + name + ", roll=" + roll + "]";
	}

}
