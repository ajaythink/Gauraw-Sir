public class Student {
    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be a positive integer.");
        }
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 12) {
            this.grade = grade;
        } else {
            System.out.println("Grade must be between 1 and 12.");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 16, 11);
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Grade: " + student1.getGrade());

        // Modifying attributes using setter methods
        student1.setName("Bob");
        student1.setAge(15);
        student1.setGrade(10);

        System.out.println("\nUpdated Information:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Grade: " + student1.getGrade());
    }
}
