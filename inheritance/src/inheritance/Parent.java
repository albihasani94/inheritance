package inheritance;

public class Parent {
	private int age = 38;
	private String name = "Parent";
	private String species = "Human";

	@Override
	public String toString() {
		return "Parent [age=" + age + ", name=" + name + ", species=" + species + "]";
	}

}
