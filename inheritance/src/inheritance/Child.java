package inheritance;

public class Child extends Parent {
	private int age = 5;
	private String name = "Child";

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Child [age=" + this.getAge() + ", name=" + this.getName() + ", species=" + this.getSpecies() + "]";
	}

}
