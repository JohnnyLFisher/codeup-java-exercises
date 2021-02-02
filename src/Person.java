public class Person {

	private String name;

	public String nickname;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println("Hello, my name is " + name + "!");
	}

	Person(String name) {
		this.name = name;
		this.nickname = name;
	}

	public static void main(String[] args) {
		Person tom = new Person("Tom");
		System.out.println(tom.getName());
		tom.setName("Thomas");
		tom.sayHello();

//		Person person1 = new Person("John");
//		Person person2 = new Person("John");
//		System.out.println(person1.getName().equals(person2.getName()));
//		System.out.println(person1 == person2);

//		Person person1 = new Person("John");
//		Person person2 = person1;
//		System.out.println(person1 == person2);

//		Person person1 = new Person("John");
//		Person person2 = person1;
//		System.out.println(person1.getName());
//		System.out.println(person2.getName());
//		person2.setName("Jane");
//		System.out.println(person1.getName());
//		System.out.println(person2.getName());
	}


}
