import java.util.ArrayList;

/**
 * Represents a classroom with students
 * Each classroom has a list of students, 
 * and an array that represents the seats in the classroom.
 *
 */
public class Classroom {

	/**
	 * Name of building
	 */
	String buildingName;
	
	/**
	 * Name of classroom
	 */
	String roomName;
	
	ArrayList<Student> students;
	
	/*
	 * Seats in the classroom.
	 */
	Seat[][] seats;
	
	/**
	 * Creates a classroom with given building name, room anme, number of seat rows and cols
	 * @param buildingName
	 * @param roomName
	 * @param seatRows
	 * @param seatCols
	 */
	public Classroom(String buildingName, String roomName, int seatRows, int seatCols) {
		this.buildingName = buildingName;
		this.roomName = roomName;
		this.seats = new Seat[seatRows][seatCols];
		
		//populate seats instances of seat class.
		for(int i = 0; i < seatRows; i++) {
			for(int j = 0; j < seatCols; j++) {
				seats[i][j] = new Seat(i, j);
			}
		}
		
		//create an empty array list of students
		this.students = new ArrayList<Student>();
	}
	
	/**
	 * Adds a student to the list of students
	 * @param student to be added
	 */
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	/**
	 * Assigns a student the next available seat.
	 * @param student to be added to an available seat
	 */
	public void assignStudentToSeat(Student student) {
		//iterate each seat and find an available seat
		//a seat is available if the studentInSeat variable is null.
		for(int i = 0; i < seats.length; i++) {//rows
			for(int j = 0; j < seats[i].length; j++) {//cols
				//get seat in location and see if its available.

				if(seats[i][j].studentInSeat == null) {
					this.seats[i][j].studentInSeat = student;
					return;
				}
			}
		}
	}
	
	/**
	 * Prints out all students in the class
	 */
	public void printAllStudents() { 
		System.out.println("Students in class:");
		for(Student student : students) {
			System.out.println(student);//since the toString method is overriden in the Student class, it will call toString method
		}
	}

	/**
	 * returns a string of the class's setup.
	 */
	public String toString() {
		String s = "\n";
		
		for(int i = 0; i < seats.length; i++) {//rows
			for(int j = 0; j < seats[i].length; j++) {//cols
				s += this.seats[i][j] + "\t";//toString method in seat class.
			}
			
			s += "\n";
		}
		
		return s;
	}
	
	/**
	 * The entry point for the program
	 * @param args
	 */
	public static void main(String[] args) {
		Classroom classroom = new Classroom("HH", "105",10, 5);
		
		//create test/dummy students
		Student finn = new Student("finn", "1");
		classroom.addStudent(finn);
		classroom.assignStudentToSeat(finn);
		
		Student john  = new Student("john", "2");
		classroom.addStudent(john);
		classroom.assignStudentToSeat(john);
		
		Student bob = new Student("bob", "3");
		classroom.addStudent(bob);
		classroom.assignStudentToSeat(bob);
		
		Student blake = new Student("blake", "4");
		classroom.addStudent(blake);
		classroom.assignStudentToSeat(blake);

		Student tim = new Student("tim", "5");
		classroom.addStudent(tim);
		classroom.assignStudentToSeat(tim);
		
		Student ben = new Student("ben", "6");
		classroom.addStudent(ben);
		classroom.assignStudentToSeat(ben);
		
		//print all students in class.
		classroom.printAllStudents();
		
		System.out.println(classroom);//toString of classroom type..
	}

}
