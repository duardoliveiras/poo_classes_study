
public class Empregado {
		
	private String firstName;
	private String lastName;
	private float wage;
	
	
	
	
	public Empregado(String firstName, String lastName, float wage) {
		if(wage < 0) {
			this.wage = 0;
		}
		else {
			this.wage = wage;
		}
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	@Override
	public String toString() {
		return "Empregado\nPrimeiro nome: " + firstName + "\nSobrenome: " + lastName + "\nSalario mensal: " + wage;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public float getWage() {
		return wage;
	}
	public void setWage(float wage) {
		this.wage = wage;
	}
	public void increase(float wage, float percentage) {
		this.setWage(wage + (wage*percentage/100));
		
	}
	
	public float annualWage(float salario) {
		return this.getWage()*12;
	}
	
	
	
}
