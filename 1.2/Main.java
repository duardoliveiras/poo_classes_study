
public class Main {
		
		public static void main(String args[]){
			
			Invoice fatura = new Invoice(158,"Mouse Fallen pro F75",2,359.99f);
			System.out.println(fatura.toString());
			System.out.println("Valor tot.= "+ fatura.getInvoiceAmount(fatura.getValorItem(), fatura.getQtItem()));
			
		
			Invoice fatura2 = new Invoice(159,"Teclado Fallen pro Falcao",-5,-279.99f);
			System.out.println("\n"+fatura2.toString());
			System.out.println("Valor tot.= "+ fatura2.getInvoiceAmount(fatura2.getValorItem(), fatura2.getQtItem()));
			
			
		}
	
}
