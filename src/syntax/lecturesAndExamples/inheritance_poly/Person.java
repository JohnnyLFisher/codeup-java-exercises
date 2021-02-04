package syntax.lecturesAndExamples.inheritance_poly;

class Person {
    private String name;
    protected String phone;

    public Person(String name) {
        this.name = name.trim();
    }

    // Gets the real name
    public String getName() {
        return name;
    }

    public void sayHello() {
        System.out.println("Hello from " + name + "!");
    }
}