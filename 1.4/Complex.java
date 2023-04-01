
public class Complex {

		private float real;
		private float imaginario;
		public float denominador;
		
		public Complex() {
			this.setReal(0);
			this.setImaginario(0);
		}
		public Complex(int real) {
			this.setReal(real);
			
		}
		public Complex(int real, int imaginario) {
			this.setReal(real);
			this.setImaginario(imaginario);
		}

		public float devolveReal() {
			return getReal();
			
		}
		public String devolveImaginario() {
			if(getImaginario()>0) {
			return "+"+getImaginario() + "i";
			}
			else {
			return ""+getImaginario() + "i";
			}
		}
		public double modulo() {
			return Math.sqrt((getReal()*getReal())+(getImaginario()*getImaginario()));
		}
		public double angulo() {
			float a = (getImaginario()/getReal());
			return Math.toDegrees(Math.atan(a));
		}
		public String inverso() {
			this.denominador = (getReal()*getReal())+(getImaginario()*getImaginario());
			return getReal()+"+"+"("+(-getImaginario())+"i"+")"+"/"+(this.denominador);
		}
		
		public Complex soma(Complex num1, Complex num2){
			Complex soma = new Complex();
			soma.real = num1.real + num2.real;
			soma.imaginario = num1.imaginario + num2.imaginario;
			return soma;
		}
		public Complex subtracao(Complex num1, Complex num2){
			Complex subtracao = new Complex();
			subtracao.real = num1.real - num2.real;
			subtracao.imaginario = num1.imaginario - num2.imaginario;
			return subtracao;
		}
		public Complex multiplica(Complex num1, Complex num2){
			Complex multiplica = new Complex();
			multiplica.real = ((num1.real*num2.real)-(num1.imaginario*num2.imaginario));
			multiplica.imaginario = ((num1.imaginario*num2.real)+(num2.imaginario*num1.real));
			return multiplica;
		}
		public Complex divide(Complex num1, Complex num2){
			Complex divide = new Complex();
			divide.real = ((num1.real*num2.real)+(-(num1.imaginario*-num2.imaginario)));
			divide.imaginario = (num1.real*-num2.imaginario)+(num1.imaginario*num2.real);
			divide.denominador = ((num2.real*num2.real)+(num2.imaginario*num2.imaginario));
			return divide;
		}
		public void compara(Complex num1, Complex num2) {
			if(num1.real == num2.real) {
				if(num1.imaginario == num2.imaginario) {
					System.out.println("Numeros complexos sao iguais");
				}else if(num1.imaginario == (-num2.imaginario)) {
					System.out.println("Numero 1 e conjulgado de Numero 2");
				}else {
					System.out.println("Numero 1 e diferente de Numero 2");
				}
			}else if(num1.real == (-num2.real)) {
				if(num1.imaginario == (-num2.imaginario)) {
					System.out.println("Numero 1 e oposto de Numero 2");
				
			}
		}else if(num1.real != num2.real) {
			System.out.println("Numero 1 e diferente de Numero 2");
		}
		
		}
		
		
		
		
		
		@Override
		public String toString() {
			if(getImaginario()>0) {
			return "Numero complexo: "+getReal()+" + "+getImaginario()+"i";
			}else {
				return "Numero complexo: "+getReal()+" "+getImaginario()+"i";
			}
		}
		
		
		public float getReal() {
			return real;
		}


		public void setReal(float real) {
			this.real = real;
		}


		public float getImaginario() {
			return imaginario;
		}


		public void setImaginario(float imaginario) {
			this.imaginario = imaginario;
		}
		
	
}
