package in.ac.kletech;

public class JavaUniversityDemo {

	public static void main(String[] args) {
	JavaUniversity KLETECH=new JavaUniversity();
		
		KLETECH.createSchool();
		KLETECH.calNoOfStud();
		for(int i=0;i<KLETECH.noOfStud.length;i++)
		{
			if(KLETECH.noOfStud[i]!=0)
				System.out.println("No of students in "+KLETECH.s[i].getsProgramCode()+" are: "+KLETECH.noOfStud[i]);
		}

	}


}


