class Outer{
	//instance var
	int x = 10;
	//inner class
	class Inner{

		void xyz(){
			System.out.println("In Inner class !");
		}

	}

}

class InnerDemo{

	void myMethod(){
		System.out.println("Inner Demo method !");
		
		//method1
		Outer o = new Outer();
		Outer.Inner in = o.new Inner();				//In inner class
		in.xyz();

		//method2
		new Outer().new Inner().xyz();				//In Inner class

	}

	public static void main(String[] args) {
		
		InnerDemo in2 = new InnerDemo();
		in2.myMethod();

	}

}