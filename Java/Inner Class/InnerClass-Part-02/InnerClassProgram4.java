class Outer{
	//instatnce variable
	int x = 10;

	//inner class
	class Inner{
		void xyz(){
			System.out.println("In Inner class !");
		}
	}

	//instance method
	void outerXyz(){
		System.out.println("In outers Method");
		Inner in1 = new Inner();
		in1.xyz();									//in inner class !
	}

	//entry point method
	public static void main(String[] args) {
		Outer out1 = new Outer();
		out1.outerXyz();						//In outers method --> ^
	}


}