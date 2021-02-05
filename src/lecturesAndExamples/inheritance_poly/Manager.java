package lecturesAndExamples.inheritance_poly;

public class Manager extends Employee {
	public Manager(String managersName){
		super(managersName);
	}

	@Override
	public void doWork() {
		System.out.println("Managing employees");
	}

}
