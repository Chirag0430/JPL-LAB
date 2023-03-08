class Student2 {
    int rollNo;
    String name;
    void getData(int r, String n) {
        rollNo = r;
        name = n;
    }
    void printData() {
        System.out.println("Roll number: " + rollNo);
        System.out.println("Name: " + name);
    }
}
public class Assignment_2 {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
        s1.getData(1, "Chirag");
        s2.getData(2, "Anant");
        System.out.println("Student 1:");
        s1.printData();
        System.out.println("Student 2:");
        s2.printData();
    }
}
