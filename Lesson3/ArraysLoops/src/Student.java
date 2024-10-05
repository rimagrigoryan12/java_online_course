public class Student {
    private String name;
    private int age;
    public Student() {  // sa kochvum e konstruktor,menq karox enq azmativ tvyalnerov konstruktor sahmanel,orinak
        System.out.println("creadit");
        name = "Anna";


    }
    public Student(String n){  // sa el konstruktori ayl dzev e, konstruktor nshanakum e oyekt sarqelu dzev
        name = n;  // estarerakov anun tvecinq miangamic sarqelu pahin

    }
    public Student (String n, int age) {
        name = n;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void sum(int a, int b){
        System.out.println(a + b);
    }
    public void sum(int a,int b, int c){
        System.out.println(a + b + c);// nuyn anunov, bayc tarer parametrerov funkcian kochvum e overloding, parametreri cank@ partadir petq e tarber linen

    }
}

