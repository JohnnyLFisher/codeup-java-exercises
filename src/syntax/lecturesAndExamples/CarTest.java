package syntax.lecturesAndExamples;

public class CarTest {

    public static void main(String[] args){
        Car lightningMcQueen = new Car(
                "Chevy","Corvette",2006
        );
//        lightningMcQueen.make = "Chevy";
//        lightningMcQueen.model = "Corvette";
//        lightningMcQueen.year = 2006;
        System.out.println(lightningMcQueen.getYear());
        lightningMcQueen.setYear(2008);
        System.out.println(lightningMcQueen.getYear());
        System.out.println(lightningMcQueen.go());

        System.out.println(Car.inventor); // static property
    }
}
