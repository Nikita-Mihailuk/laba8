class Person {
    String name;
    String surname;
    int birthYear;

    public Person(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }
    public void displayInfo() {
        System.out.println("Человек: " + name + " " + surname + ", год рождения: " + birthYear);
    }
}
class Car {
    String brand;
    int year;
    double engineCapacity;
    public Car(String brand, int year, double engineCapacity) {
        this.brand = brand;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }
    public void displayInfo() {
        System.out.println("Машина: " + brand + ", год выпуска: " + year + ", объём двигателя: " + engineCapacity);
    }
}
class Book {
    String title;
    String author;
    int year;
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public void displayInfo() {
        System.out.println("Книга: " + title + ", автор: " + author + ", год выпуска: " + year);
    }
    public void readBookAboutCar(Person person, Car car) {
        System.out.println(person.name + " читает книгу " + title + " про машину " + car.brand);
    }
}
public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Никита", "Михайлюк", 2006);
        Car car1 = new Car("Жигули", 1980, 2.0);
        Book book1 = new Book("Руководство по эксплуатации автомобиля", "Пушкин А.И.", 2005);

        person1.displayInfo();
        car1.displayInfo();
        book1.displayInfo();

        book1.readBookAboutCar(person1, car1);
    }
}