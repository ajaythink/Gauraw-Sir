class Student_{
    private String name;
    private int age;
    private int grade;

    public Student_(String n, int a, int g) {
        setName(n);
        setAge(a);
        setGrade(g);
        // this.name = n;
        // this.age = a;
        // this.grade = g;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("this not positive number. ");
        }
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 12) {
            this.grade = grade;
        } else {
            System.out.println("Grade is not between 1 to 12");
        }
    }

    // getter method to get the value and return something
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

}

public class Student1 {
    
    public static void main(String[] args) {
        Student_ stu = new Student_("Ajay", 20, 10);

        System.out.println("Name: " + stu.getName());
        System.out.println("Age: " + stu.getAge());
        System.out.println("Grade: " + stu.getGrade());
    }
}
