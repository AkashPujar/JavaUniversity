package in.ac.kletech;

public class JavaUniversity {
	final static String code1="E030";
	final static String code2="E241";
	int noOfStud[]=new int[8];
	School[] s=new School[8];
	static 
	{
		System.out.println("Welcome to KLETECH University");
		System.out.println("CET codes:"+code1+" and "+code2);
	}
	class School{
		private String sProgramCode;
		private String sSchoolCoordinator;
		private int iNoOfStud;
		private int iNoOfStaff;
		

		public String getsProgramCode() {
			return sProgramCode;
		}


		public String getsSchoolCoordinator() {
			return sSchoolCoordinator;
		}


		public int getiNoOfStud() {
			return iNoOfStud;
		}


		public int getiNoOfStaff() {
			return iNoOfStaff;
		}


		public School(String sProgramCode, String sSchoolCoordinator,
				int iNoOfStud, int iNoOfStaff) {
			super();
			this.sProgramCode = sProgramCode;
			this.sSchoolCoordinator = sSchoolCoordinator;
			if(iNoOfStud>120)
				System.out.println("Intake exceeded in "+this.sProgramCode);
			else
				this.iNoOfStud = iNoOfStud;
			this.iNoOfStaff = iNoOfStaff;
		}
		
		
	}
	void createSchool()
	{
		s[0]=new School("EC", "Jon",65,25);
		s[1]=new School("EE", "Akash",100,45);
		s[2]=new School("CS", "Sony",70,21);
		s[3]=new School("Chemical", "Simpson",80,10);
		s[4]=new School("BT", "Sean",90,29);
		s[5]=new School("Robotics", "Rock",30,45);
		s[6]=new School("IP", "Casy",130,89);
		s[7]=new School("Mechanical", "Peter",110,70);
	}
	
	void calNoOfStud()
	{
		for(int i=0;i<noOfStud.length;i++)
		{
			noOfStud[i]=s[i].getiNoOfStud();
		}
	}
}

