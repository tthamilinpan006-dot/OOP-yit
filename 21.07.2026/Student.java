class Student{
    int id;
    String fname;
    String lname;
    int marks1;
    int marks2;
    int marks3;

    Student(String fname,String lname,int id){
        this.fname =fname;
        this.lname =lname;
        this.id =id;
    }

    void setMarks(int marks1,int marks2,int marks3){
        this.marks1 =marks1;
        this.marks2 =marks2;
        this.marks3 =marks3;
    }
	String getFullname(){ 
        return fname+" "+lname;
    }

    int getTotal(){
        return marks1+marks2+marks3;
    }

    double getAverage(){
        return getTotal()/3.0;
    }

    String getGrade() {
        double avg = getAverage();

        if (avg >=75){
            return "A";
        } else if(avg >=65){
            return "B";
        } else if(avg >=55){
            return "C";
        } else if(avg >=35){
            return "S";
        } else{
            return "F";
        }
    }

    void display(){
        System.out.println("First Name : "+fname);
        System.out.println("Last Name  : "+lname);
        System.out.println("Full Name  : "+getFullname());
        System.out.println("ID         : "+id);
        System.out.println("Marks 1    : "+marks1);
        System.out.println("Marks 2    : "+marks2);
        System.out.println("Marks 3    : "+marks3);
        System.out.println("Total      : "+getTotal());
        System.out.println("Average    : "+getAverage());
        System.out.println("Grade      : "+getGrade());
    }
}
