class PersonRunner{
	public static void main(String[] dev)
	{	
	String company = "infosys";
	double salary = 5.2;
	String designation = "Team leader";
    Person.work(company,salary);
	Person.work(company,salary,designation);
	}
}