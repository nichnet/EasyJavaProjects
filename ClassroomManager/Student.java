/**
 * Represents a student
 * each student has name and id
 *
 */
public class Student {
	/**
	 * the name of the student
	 */
	String name;
	
	/**
	 * the id of the student
	 */
	String id;
	
	
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}

	/**
	 * returns name of student.
	 */
	public String toString() {
		return this.name;
	}
	
}
