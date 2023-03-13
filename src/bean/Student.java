package bean;

public class Student {
	private int Student_id;
	private String Student_FirstName;
	private String Student_MiddleName;
	private String Student_LastName;
	private String Address;
	private String Gender;
	private int Age;
	private String Stream;
	
	public Student()
	{
		
	}

	public Student(int student_id, String student_FirstName, String student_MiddleName, String student_LastName,
			String address, String gender, int age, String stream) {
		super();
		Student_id = student_id;
		Student_FirstName = student_FirstName;
		Student_MiddleName = student_MiddleName;
		Student_LastName = student_LastName;
		Address = address;
		Gender = gender;
		Age = age;
		Stream = stream;
	}

	public int getStudent_id() {
		return Student_id;
	}

	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}

	public String getStudent_FirstName() {
		return Student_FirstName;
	}

	public void setStudent_FirstName(String student_FirstName) {
		Student_FirstName = student_FirstName;
	}

	public String getStudent_MiddleName() {
		return Student_MiddleName;
	}

	public void setStudent_MiddleName(String student_MiddleName) {
		Student_MiddleName = student_MiddleName;
	}

	public String getStudent_LastName() {
		return Student_LastName;
	}

	public void setStudent_LastName(String student_LastName) {
		Student_LastName = student_LastName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getStream() {
		return Stream;
	}

	public void setStream(String stream) {
		Stream = stream;
	}

	@Override
	public String toString() {
		return "Student [Student_id=" + Student_id + ", Student_FirstName=" + Student_FirstName
				+ ", Student_MiddleName=" + Student_MiddleName + ", Student_LastName=" + Student_LastName + ", Address="
				+ Address + ", Gender=" + Gender + ", Age=" + Age + ", Stream=" + Stream + "]";
	}
	
	

}
