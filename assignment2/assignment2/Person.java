package assignment2;

/**
 * Assignment 2: Person Class
 * @author Jamie Lewis
 */
public class Person {
	
	//Attributes
	private int age;
	private String name;
	private float weight;
	
	/**
	 * Non-Default Constructor
	 * @param age
	 * @param name
	 * @param weight
	 */
	public Person(int age, String name, float weight) {
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
	/**
	 * Age Attribute Getter
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Age Attribute Setter
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Name Attribute Getter
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Name Attribute Setter
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Weight Attribute Getter
	 * @return weight
	 */
	public float getWeight() {
		return weight;
	}

	/**
	 * Weight Attribute Setter
	 * @param weight
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	/**
	 * Walk Method
	 * 
	 */
	public void walk() {
		System.out.println("I can walk.");
	}
	
	/**
	 * Run Method
	 * @param distance
	 * @return
	 */
	public float run(float distance) {
		System.out.println("I can run. I am running " + distance + " feet.");
		return 0;
	}

	/**
	 * Main Method
	 * @param args
	 */
	public static void main(String[] args) {
		
		Person me = new Person(39, "Jamie", (float)215);
		System.out.println("My name is " + me.getName() + ". I am " + me.getAge() + " years old, and weigh about " + me.getWeight() + " lbs.");
		me.walk();
		me.run(10);

	}

}
