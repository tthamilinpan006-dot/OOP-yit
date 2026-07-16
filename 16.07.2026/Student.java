class Student{
	int id; // Instance Variable
	String name;

	void setStudent(int id,String name){
		this.id=id;
		this.name=name;
	}
	void getStudent(){
		System.out.println("ID :"+id);
		System.out.println("Name :"+name);
	
	}
}