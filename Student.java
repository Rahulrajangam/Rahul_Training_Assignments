package oopsconcept;

public class Student {
	private String name;
    private int rollNo;
    private int marks;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for rollNo
    public int getRollNo() {
        return rollNo;
    }

    // Setter for rollNo
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Getter for marks
    public int getMarks() {
        return marks;
    }

    // Setter for marks with validation
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Marks must be between 0 and 100.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Rahul");
        s.setRollNo(101);
        s.setMarks(85);   // valid
        s.setMarks(150);  // invalid - will print error

        System.out.println("Student Name: " + s.getName());
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Marks: " + s.getMarks());
    }
}