package java8.stream;

public class Employee {

	int id;
	String name;
	boolean active;
	String dept;

	public Employee() {

	}
	
	public Employee(int id, String name, boolean active, String dept) {
		
		this.id = id;
		this.name = name;
		this.active = active;
		this.dept = dept;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", active=" + active + ", dept=" + dept + "]";
	}
	
	

}
