public class Test {
    public static void main(String[] args) {
        byte x = 4;
        int a = -129;
        x = (byte) a;
        System.out.println(x);

        x = 4;
        x = (byte) (x + 1);
        System.out.println(x);

        x++;
        System.out.println(x);

        //x = (byte) (x + 5);sra poxaren karox enq grel
        x += 5;

        x = 1;
        System.out.println(x + 5 + " Java"); // aysinqn tpelua 5+1` 6 "Java"
        System.out.println("barev " + x + 5 + " Java"); // x+5-@ 15e haskanum,qani vor irenic araj ka String,vorpisi gumar haskana,arnumenq pakagceri mej
        System.out.println("barev " + (x + 5) + " Java");

       // String s = "7";
        //System.out.println(s + 1); //vonc anenq vor voch te 71 stananq, ayl gumarman gorcoxutyun katarvi
        // String s = "7";
        // int z = Integer.parseInt(s); //oyekt@` String@, ete uzumenq sarqel int, piti gnanq inti hmp class` integer u dranov sarqenq
        //System.out.println(z + 1);// nuyn kerp orinakdoule-idepqum
        String s ="4.8";
        double z = Double.parseDouble(s);
        System.out.println(z + 1);


        Student s1 = new Student();  //nshanakum e sarqel nor Student
        s1.setAge(44);
        s1.setName("Hayk");

        Student s2 = new Student();
        Student s3 = new Student();
        System.out.println(s2.getName());
        System.out.println(s3.getName());

        Student s4 = new Student("Hayk");
        System.out.println(s4.getName());
        Student s5 = new Student("Hayk", 45);
        System.out.println(s5.getName() + " " + s5.getAge());

        s1.sum(4, 5);
        s1.sum(1,8,9);


        Teacher t1 = new Teacher();
        t1.setName("Hayk");
        t1.setYear(2000);
        t1.setSalary(1000);
        t1.setPhone("5552453");

        System.out.println("-------------");
        Administrator a1  = new Administrator();
        a1.setName("Anna");
        a1.setDepartment("Music");
        a1.setYear(1999);
        a1.setPhone("25052230");

        t1.printInfo();
        System.out.println();
        a1.printInfo();












    }
}
