package coding.practice.equal.hashcode;

class Employee {
	
	private int id;
	private String employeeName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public boolean equals(Object obj){
		
		if (obj == null || getClass() != obj.getClass() ) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		
		Employee e = (Employee) obj;
		return (this.getId()==e.getId()) ;
	}
	
	public int hashCode() {
		return getId();
	}
}
