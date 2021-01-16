/*
 * Author: Brian Klein
 * Date: 9/25/17
 * Program: Student.java
 * Description:
 */

public abstract class Student {
    
    private String name;
    private int [] testList;
    private String grade;
    
    protected final static int NUM_OF_TESTS = 3;

    public Student() {
        this("Unknown");
    }

    public Student(String name) {
        this.name = name;
        this.testList = new int [NUM_OF_TESTS];
        this.grade = "Undetermined";
    }

    public Student(String name, int[] testList, String grade) {
        this.name = name;
        this.testList = testList;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getTestList() {
        return testList;
    }

    public void setTestList(int[] testList) {
        this.testList = testList;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    //abstract method
    public abstract void computeGrade();

    @Override
    public String toString() {
        return "\nStudent name: " + name +  
               "\nGrade: " + grade;
               //"\nList: " + testList;
    }
    
    
    
}//end class
