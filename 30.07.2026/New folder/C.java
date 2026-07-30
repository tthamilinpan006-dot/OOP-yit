class C extends B{
	int z;
	C(int x,int y,int z){
		super(y,x);
		this.z=z;
		
	}
	void getz(){
		System.out.println("Cz :"+this.z);
	}
}