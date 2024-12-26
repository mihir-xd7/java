public class Student {
    int roll;
    String name;
    float cgpa;

    public Student() {
        this(0,null,0f);
    }
    public Student(int roll, String name, float cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }
}
