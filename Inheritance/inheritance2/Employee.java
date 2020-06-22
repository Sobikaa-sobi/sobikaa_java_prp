
class Employee extends Person {
	double annual_salary;
	public Employee(String name, double annual_salary, int year_employee_started, String national_insurance_num) {
		super(name);
		this.annual_salary = annual_salary;
		this.year_employee_started = year_employee_started;
		this.national_insurance_num = national_insurance_num;
	}
	int year_employee_started;
	public double getAnnual_salary() {
		return annual_salary;
	}
	public void setAnnual_salary(double annual_salary) {
		this.annual_salary = annual_salary;
	}
	@Override
	public String toString() {
		return "name="+name+", annual_salary=" + annual_salary + ", year_employee_started=" + year_employee_started
				+ ", national_insurance_num=" + national_insurance_num + "]";
	}
	public int getYear_employee_started() {
		return year_employee_started;
	}
	public void setYear_employee_started(int year_employee_started) {
		this.year_employee_started = year_employee_started;
	}
	public String getNational_insurance_num() {
		return national_insurance_num;
	}
	public void setNational_insurance_num(String national_insurance_num) {
		this.national_insurance_num = national_insurance_num;
	}
	String national_insurance_num;
}
