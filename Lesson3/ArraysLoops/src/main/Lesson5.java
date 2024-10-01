package main;
import model.Human;
import model.Car;
public class Lesson5 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.firstName = "Aram";
        human1.lastName = "Aramyan";
        human1.gender = 'm';
        human1.isArmenian = true;
        human1.year = 2000;

        model.Human human2 = new model.Human();
        human2.firstName = "Anna";
        human2.lastName = "Grigoryan";
        human2.gender = 'm';
        human2.isArmenian = true;
        human2.year = 2002;

        System.out.println(human1.firstName + " " + human1.lastName);

        if (human1.year < human2.year)
            System.out.println(human1.firstName);
        else
            System.out.println(human2.firstName);  // es amen@ grenq aveli krjat dzevov

        System.out.println(human1.year < human2.year ? human1.firstName : human2.firstName);


        Car car1 = new Car();
        car1.setYear(2020);

        System.out.println(car1.getEngine());
        System.out.println(car1.getModel());

        Human h = new Human(); // ete menqhuman classum humanin anun enqdrel, apa cankacac human kdirakvi tvyal anunov
        h.firstName = "Ani";
        System.out.println(h.firstName); // menq karox enq anun@ poxel ver@ nshvac hramanov

        h.sayHello();
        human2.sayHello();

        // System.out.println(human1.firstName + " " + human1.lastName);
        //System.out.println(human2.firstName + " " + human2.lastName);
        //System.out.println(h.firstName + " " + h.lastName);

        human1.printFullName();
        human2.printFullName();
        h.printFullName();

        String s = human1.fullName();
        System.out.println("Full Name of human1 is " + s);

        human1.sum(4, 6);

        human2.print1toN(5);
        human2.print1toN(15);

        Car car = new Car();
        //  car.engine = -8.8;
        car.setEngine(-8.8);
        System.out.println(car.getEngine());

        car.setModel("Jeep");
        car.setEngine(5.5);
        car.setYear(2020);
        System.out.println(car.getModel() + ", " + car.getYear());


        String text = "Hello from Lesson 5"; //charer
        System.out.println(text.length());   //mez asum e te String@ qani simvol e parunakum`erkarutyun
        System.out.println(text.charAt(0));  //sranov asum e indz index@ tur,es char@ veradardznem orinak ete tanq zro, keri H

        for (int i = 0; i < text.length(); i++) { //ete text@ liner array, voch te String piti greinq text.Lenght aranc pakagceri
            System.out.println(text.charAt(i)); //isk estex text[i]

            //hashvenq Stringi mej s tareri qanak@,vercnum enq hashvich

        }
        System.out.println("--------------");
        int countOfS = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 's'){
                countOfS++;

            }

        }
        System.out.println(countOfS);

        System.out.println(text.toUpperCase()); //bolor tarer@ sarquma mecatar

    }
}












