class Hospital{

	int noOfDr = 20;
	String name = "Sancheti";

	

	public void service(){

		System.out.println("Name of hospital is "+name);
		System.out.println("Number of Doctors "+name+" has "+noOfDr);
		Visiting dr = new Visiting();
		dr.infoDr();
	}
}
class Visiting {

	int noOfHr = 4;
	String name = "M.K.Shaha";
	String specialization = "neuro-sergen";

	public void infoDr(){
		System.out.println("Name of Visiting dr is "+name);
		System.out.println("No of hours Visiting is "+noOfHr);
		System.out.println(name+"'s specialization is "+specialization);
	}

}
class Patient{

	int age = 20;

	
	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		hospital.service();
	}

}