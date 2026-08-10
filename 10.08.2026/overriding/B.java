class B extends A{
	int z;
	int y;
	
	B(){
		this.y=30;
		this.z=70;
	
	}
	void gety(){
		System.out.println("By :"+this.y);
		super.getx();
	}
	void getx(){
		System.out.println("Bz :"+this.z);
		
	}
	
}