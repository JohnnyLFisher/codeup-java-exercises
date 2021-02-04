package syntax.lecturesAndExamples;

public class Car {
//    static Person inventor= new Person("Karl", "Benz");
    static String inventor = "Karl Benz";
    private String make;
    private String model;
    private int year;

    String go(){
        return "Kachow!";
    }

    Car(){
        this("Toyota", "Camry", 2021); // default values
//        this.make = "Toyota";
//        this.model = "Camry";
//        this.year = 2021;
    }

    Car(String make, String model, int year){   // constructor with params
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // getters
    String getMake(){
        return this.make;
    }
    String getModel(){
        return this.model;
    }
    int getYear(){
        return this.year;
    }

    // setters
    void setMake(String newMake){
        this.make = newMake;
    }
    void setModel(String newModel){
        this.model = newModel;
    }
    void setYear(int newYear){
        this.year = newYear;
    }

}
