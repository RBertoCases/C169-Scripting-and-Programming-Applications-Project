package performanceAssessment;

import java.util.Arrays;

public class Student {
    
    private String studentID;
    private String fn;
    private String ln;
    private String email;
    private int age;
    private int[] grades;
    
    //Constructor has the same name as the class
    
    public Student(String studentID, String fn, String ln, String email, int age, int[] grades){
    	setStudentID(studentID);
    	setFN(fn);
    	setLN(ln);
    	setEmail(email);
    	setAge(age);
    	setGrades(grades);
    }
    
    //accessors - get methods
    
    public String getStudentID(){
    	return studentID;
    }
    
    public String getFN(){
    	return fn;
    }
    
    public String getLN(){
    	return ln;
    }
    
    public String getEmail(){
    	return email;
    }
    
    public int getAge(){
    	return age;
    }
    
    public int[] getGrades(){
    	return grades;
    }
    
    //mutators - set methods
    
    public void setStudentID(String studentID){
    	this.studentID = studentID;
    }
    
    public void setFN(String fn){
    	this.fn = fn;
    }
    
    public void setLN(String ln){
    	this.ln = ln;
    }
    
    public void setEmail(String email){
    	this.email = email;
    }
    
    public void setAge(int age){
    	this.age = age;
    }
    
    public void setGrades(int[] grades){
    	this.grades = grades;
    }
    
    // Print Method
    
    public void print(){
    	System.out.println("Student ID: " + getStudentID() + "\tFirst Name: " + getFN() + "\t Last Name: " + getLN() + "\tE-mail:\t"
    			+ getEmail() + "\tAge:" + getAge() + "\tGrades: " + Arrays.toString(getGrades()));
    }
    
}