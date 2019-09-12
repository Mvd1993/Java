public class Subject {
	String name;
	int grade;
	
	public Subject(String name,int grade) {
		name = this.name;
		grade = this.grade;
	}
	public Subject(String name) {
		name = this.name;
		grade = 0;
	}
	
	//---Getters and setters------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	//---ToString----------
	@Override
	public String toString() {
		return "Subject [name=" + name + ", grade=" + grade + "]";
	}
	
	
}
