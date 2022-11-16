class Student
{
    String name;
    int age;

    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name+" "+age;
    }
}

interface Interf
{
    public Student getStudent(String name, int age);
}
public class ConstructorReference {
    public static void main(String[] args) {
        // creating object by lambda expression
        Interf i = (name, age) -> new Student(name, age);
        Student s1 = i.getStudent("Shivam", 21);
        System.out.println(s1);

        // creating object by constructor reference
        Interf i2 = Student::new;
        Student s2 = i2.getStudent("Rohan", 26);
        System.out.println(s2);
    }
}
