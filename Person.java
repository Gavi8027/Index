class Person
{
	static void work(String company,double salary)
	{
	System.out.println("Entered the company salary :");
	if(company=="infosys" && salary==5.2)
	{
		System.out.println("company: "+company);
		System.out.println("salary: "+salary);
		return;
	}
	}
     static void Work(String company,double salary, String designation)
	 {
		 System.out.println("Entered the company salary designation :");
		 if(company=="infosys" && salary==5.2 && designation=="Team leader")
		 {
			 System.out.println("company: "+company);
			 System.out.println("salary: "+salary);
			 System.out.println("designation: "+designation);
		 return;
		 }
	 }
}