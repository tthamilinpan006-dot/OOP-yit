class Student{
	int id;
	String name;
	
	void setStudent(){
		this.id=1000;
		this.name="Tamil";
	}
	void setStudent(int id){
		this.id=id;
		this.name="Nishan";
	}
	void getStudent(){
		System.out.println("ID :"+this.id);
		System.out.println("name :"+this.name);
	}
	
}