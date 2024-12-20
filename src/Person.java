public class Person {
    String name;
    String surname;
    int age;
    boolean gender;

    Person(String name, String surname, int age, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    void tostring() {
        if (gender == true) {
            System.out.println("Hi i'm " + name + " " + surname + " a " + age + " years old ,[gender male]" );
        }
    else {
            System.out.println("Hi i'm " + name + " " + surname + " a " + age + " years old ,[gender female]");
         }
    }
}
