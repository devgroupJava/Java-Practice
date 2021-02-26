class Outer{

	//instance variable declaration
	int x = 10;


	//Inner class
	class Inner{
		void xyz(){
			System.out.println("In inner class !");
		}
	}

//Entry point method
	public static void main(String[] args){

//		System.out.println(x);					//non static variable x can not be referenced from static context
//		Inner in1 = new Inner();
//		in1.xyz();								//non staticc variable this can not be referenced from static context

		System.out.println("x : " +new Outer().x);

//method 1
		Outer out1 = new Outer();
		Inner in1 = out1.new Inner();
		in1.xyz();								//In inner class !

//method 2
		Inner in2 = new Outer().new Inner();
		in2.xyz();							//In inner class !

//method 3
		new Outer().new Inner().xyz();		//In inner class !

	}	
}