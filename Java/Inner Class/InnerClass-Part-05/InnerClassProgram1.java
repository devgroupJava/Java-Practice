class Hospital{

	static class Doctor{
		void serviceAt(){
			System.out.println("Work at hospital");
		}
	}

	public static void main(String[] args) {
	/*	Hospital hosp = new Hospital();
		Hospital.Doctor shaha = hosp.new Doctor();
		shaha.serviceAt();
	*/
		Doctor d = new Doctor();
		d.serviceAt();

	}
}