
public class Campo {
	
	private char simbo; 
	
	public Campo() {
		this.simbo = ' ';
	}

	public char getSimbo() {
		return simbo;
	}

	public void setSimbo(char simbo) {
		if(this.simbo == ' ') {
			this.simbo = simbo;
		}
	}
	
	
	
}
