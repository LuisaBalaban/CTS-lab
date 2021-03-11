package g1092.course3.entities;

public class Student {
	boolean hasScholarship;
	boolean isEnrolled;
	int age;
	void incrementAge() {

		this.age=(this.age<20 )? (this.age+=2) : (this.age+=1);
	}

}
