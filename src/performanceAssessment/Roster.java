package performanceAssessment;

import java.util.*;

public class Roster {
	
	static String [] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59", 
	        "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
	        "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
	        "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
	        "5,Roberto,Cases,rcases@my.wgu.edu,30,85,88,92"};
	
	static ArrayList<Student> myStudents = new ArrayList<>();	

	public static void main(String[] args) {
	//Add Student data		
		for (int i = 0; i < students.length; i++){
			String [] parts = students[i].split(",");
			
			String studentID = parts[0];
			String fn = parts[1];
			String ln = parts[2];
			String email = parts[3];
			int age = Integer.parseInt(parts[4]);
			int[] grades = {Integer.parseInt(parts[5]),Integer.parseInt(parts[6]),Integer.parseInt(parts[7])};

			Student newStudent = new Student(studentID,fn,ln,email,age,grades);
			myStudents.add(newStudent);
		}				
				
				
	//Print out the Student data
		print_all();
		print_invalid_emails();
		print_average_grade();
		remove("3");
		remove("3");
		

	}
	
	public static void add(String studentID, String fn, String ln, String email, int age, int grade1, int grade2, int grade3){
		//Create an array for my int
		int[] grades = {grade1, grade2, grade3};
		Student newStudent = new Student(studentID, fn, ln, email, age, grades);
		myStudents.add(newStudent);
	}
	
	public static void remove(String studentID){
		for (int i = 0; i < myStudents.size(); i++) {
			String ID = myStudents.get(i).getStudentID();
			if (ID.equals(studentID)) {
				myStudents.remove(i);
				System.out.println("Student ID " + studentID + " removed.");
				return;
			}
				
		}
		System.out.println("Student ID " + studentID + " was not found.");
	}

	public static void print_all(){
		//Loop through the ArrayList called students
		for(int i = 0; i < myStudents.size(); i++){
			//get each student and call the print method
			myStudents.get(i).print();
		}
	}
		
	public static void print_average_grade(){
		//loop through the ArrayList called students, use an enhanced for loop		
		for (Student s : myStudents){
				double average = (s.getGrades()[0] + s.getGrades()[1] + s.getGrades()[2]) / 3.0;
				System.out.println("Student ID: " + s.getStudentID() + "\tAvg Grade = " + average);
			}
		}
			

	
	public static void print_invalid_emails() {
        for (int i = 0; i < myStudents.size(); i++) {
            String email = myStudents.get(i).getEmail();
            
            if (email.contains("@") && email.contains(".")) {
                if (email.contains(" ") ) {
                    System.out.println("Invalid email:\t" + myStudents.get(i).getEmail());
                }
                System.out.print("");
            }
            else {                
            	System.out.println("Invalid email:\t" + myStudents.get(i).getEmail());
            }
        }
    }
		
}	

