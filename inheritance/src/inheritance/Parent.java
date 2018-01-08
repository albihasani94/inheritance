package inheritance;

public class Parent {
	private int age = 38;
	private String name = "Parent";
	private String species = "Human";

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	@Override
	public String toString() {
		return "Parent [age=" + age + ", name=" + name + ", species=" + species + "]";
	}
}
