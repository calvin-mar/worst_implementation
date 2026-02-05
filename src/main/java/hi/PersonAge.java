package hi;

public class PersonAge {
	String firstname;
	String lastname;
	int age;
	
	public PersonAge(String fname, String lname, int age) {
		super();
		this.firstname = fname;
		this.lastname = lname;
		this.age = age;
	}

	public String getFname() {
		return firstname;
	}

	public void setFname(String fname) {
		this.firstname = fname;
	}

	public String getLname() {
		return lastname;
	}

	public void setLname(String lname) {
		this.lastname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return firstname + " " + lastname + ", " + age;
	}
	
	public PersonAge makePerson(PersonAge that) throws underAgeException{
		if(this.age < 18) {
			throw new underAgeException();
		}
		PersonAge child = new PersonAge(this.firstname,that.lastname, 0);
		return child;
	}
	
	public static void main(String[] args) {
		PersonAge p = new PersonAge("Romeo", "Montenegue", 15);
		
		System.out.println(p);
	}
	
}
