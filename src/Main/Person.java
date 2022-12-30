package Main;

public class Person {

    private static int counter = 1;

    private int numberPerson;
    private String name;
    private String idNumber;
    private String email;

    public Person() {}

    public Person(String name, String idNumber, String email) {
        this.numberPerson = Person.counter;
        this.name = name;
        this.idNumber = idNumber;
        this.email = email;

        counter += 1;
    }

    public int getNumberPerson() {
        return this.numberPerson;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIdNumber () {
        return idNumber;
    }
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    public String getEmail () {
        return email;
    }
    public void  setEmail(String email) {
        this.email = email;
    }




    public String toString() {
        return  "\nName: " + this.getName() +
                "\nIdentity Number: " + this.getIdNumber() +
                "\nEmail: " + this.getEmail();

    }


}