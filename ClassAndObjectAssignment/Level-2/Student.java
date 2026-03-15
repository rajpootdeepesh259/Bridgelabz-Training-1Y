
class Student {
    
    String name;
    int rollNumber;
    double marks;

    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B+";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    void displayReport() {
        System.out.println("Student Report:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        
        Student student1 = new Student("Alice", 101, 92.5);
        Student student2 = new Student("Bob", 102, 76.0);
        Student student3 = new Student("Charlie", 103, 58.0);

        student1.displayReport();
        student2.displayReport();
        student3.displayReport();
    }
}