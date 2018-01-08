package inheritance;

public class Child extends Parent {
	private int age = 2;
	private String name = "child";

	@Override
	public String toString() {
		return "Child [age=" + age + ", name=" + name + "]";
	}

}
