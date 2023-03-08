class Student {
    private String name;
    private String city;
    private int age;
    public void addData(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }
    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
    }
}
public class Assignment_4 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.addData("MIT", "ADT", 5);
        System.out.println("Student 1 data:");
        s1.printData();
        Student s2 = new Student();
        s2.addData("XYZ", "ABC", 19);
        System.out.println("Student 2 data:");
        s2.printData();
    }
}
