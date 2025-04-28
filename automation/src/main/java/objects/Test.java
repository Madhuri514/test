package objects;

class Testcase {
	
	 String Requirement;
	 String Precondition;
	 String ExpectedResult;
	 int TestcaseID;
	 String postconditions;
	 
	
	
public static void main(String[] args) {
	
Testcase t1 = new Testcase();
Testcase t2 = new Testcase();
Testcase t3 = new Testcase();
Testcase t4 = new Testcase();
Testcase t5 = new Testcase();

t1.Requirement = "Techelliptica";
t2.Precondition = "Sysytem Restart";
t3.ExpectedResult = "Pass";
t4.TestcaseID = 1 ;
t5.postconditions = "cleanup";
t5.TestcaseID = 5 ;
t1.Precondition = "Data cleanup";
}

//private void Requirementoutput(String string) {
	// TODO Auto-generated method stub
	
}

