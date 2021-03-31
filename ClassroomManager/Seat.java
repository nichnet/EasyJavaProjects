/**
 * Represents a seat in a classroom.
 * each seat has a row and column,
 * may have  a student assigned to it.
 *
 */
public class Seat {
	/**
	 * the row of the seat in the classroom
	 */
	int row;

	/**
	 * the column of the seat in the classroom
	 */
	int col;
	
	/**
	 * student assigned to seat, otherwise null
	 */
	Student studentInSeat;
	
	public Seat(int row, int col) {
		this.row = row;
		this.col = col;
	}
	
	/**
	 * Assigns student to seat
	 * @param student to assign
	 */
	public void putStudentInSeat(Student student) {
		this.studentInSeat = student;
	}
	
	
	/**
	 * returns the row, col and student of seat
	 */
	public String toString() {
		return this.row + ", " + this.col + ": " + this.studentInSeat;
	}
}

