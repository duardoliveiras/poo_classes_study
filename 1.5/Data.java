import java.util.Calendar;


public class Data {
	private int dia;
	private int mes;
	private int ano;
	public String date;
	
	
	
	
	public Data(int dia, int mes, int ano) {
		if(dia > 31) {
			System.out.println("Valor de dia invalido!");
			this.setDia(31);
		} else if(dia <= 0) {
			System.out.println("Valor de dia invalido!");
			this.setDia(1);
		}else {
			this.setDia(dia);
		}
		
		if(dia == 31) {
			if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				this.setDia(31);
			}else if (mes == 2) {
				if(ano%4 == 0) {
				System.out.println("Valor invalido Fevereiro de "+ano+" tem 29 dias");
				this.setDia(29);	
				}else {
					System.out.println("Valor invalido Fevereiro de "+ano+" tem 28 dias");
					this.setDia(28);	
				}
			}else {
				System.out.println("Valor invalido o mes "+mes+" tem 30 dias");
				this.setDia(30);
			}
		}else if(dia == 29) {
			if(mes == 2) {
				if(ano%4 == 0) {
					this.setDia(29);
				}else {
					System.out.println("Valor invalido Fevereiro de "+ano+" tem 28 dias");
					this.setDia(28);	
				}
			}else {
				this.setDia(29);
			}
		}
		
		
		if(mes > 12) {
			System.out.println("Valor de mes invalido!");
			this.setMes(12);
		} else if(mes <= 0) {
			System.out.println("Valor de mes invalido!");
			this.setMes(1);
		}
		else {
			this.setMes(mes);
		}
		
		this.setAno(ano);
		
		this.date = this.getDia() + "/" + this.getMes() + "/" + this.getAno();
		
	}
	public Data() {	
		Calendar c = Calendar.getInstance();
		setDia(c.get(Calendar.DAY_OF_MONTH));
		setMes(c.get(Calendar.MONTH)+1);
		setAno(c.get(Calendar.YEAR));
		
		this.date = this.getDia() + "/" + this.getMes() + "/" + this.getAno();
	}
		
	
		
	
	@Override
	public String toString() {
		return this.date;
	}
	
	
	public void nextDay() {
		
		if(this.getMes() == 2) {
			if(this.getDia() == 28) {
				if(this.getAno()%4 == 0) {
					this.setDia(this.getDia()+1);
				}else {
					this.setDia(1);
					this.setMes(this.getMes()+1);
				}
			}else if(this.getDia() == 29) {
				this.setDia(1);
				this.setMes(this.getMes()+1);
			}else {
				this.setDia(getDia()+1);
			}
		}
		
		else if(this.getMes() == 1 || this.getMes() == 3 || this.getMes() == 5 || this.getMes() == 7 || this.getMes() == 8 || this.getMes() == 10 || this.getMes() == 12) {
			if(this.getDia() == 31 && this.getMes() == 12) {
				this.setDia(1);
				this.setMes(1);
				this.setAno(this.getAno()+1);
			}
			else if(this.getDia() == 31) {
				this.setDia(1);
				this.setMes(this.getMes()+1);
			}else if(this.getDia()<= 30) {
				this.setDia(this.getDia()+1);
			}
		}else {
			if(this.getDia() == 30) {
				this.setDia(1);
				this.setMes(this.getMes()+1);
			}else {
				this.setDia(this.getDia() + 1);
			}
		}
		
		this.date = this.getDia() + "/" + this.getMes() + "/" + this.getAno();
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
}
