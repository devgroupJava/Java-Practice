class Hospital{

	int noOfDoc = 20;
	String name = "Dinanath";
	VisitingDoc obj1 = new VisitingDoc();
	public void hospitalService(){
		System.out.println("Name of hospital is "+name);
		obj1.visitingDr();
	}
}
	

class VisitingDoc{

	String name = "M.K.Shaha";

	void visitingDr(){
		System.out.println("Name is : "+name);
		System.out.println(name+" Gives good service");
	}

}
class Patient{
	 public static void main(String[] args) {
			Hospital h = new Hospital();
		h.hospitalService();
		
	}

}