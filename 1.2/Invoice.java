
public class Invoice {

		private int numItem;
		private String descItem;
		private int qtItem;
		private float valorItem;
		
	
		
		public Invoice(int numItem, String descItem, int qtItem, float valorItem) {
			if(qtItem < 0) {
				this.qtItem = 0;
			}else {
				this.qtItem = qtItem;
			}
			if(valorItem < 0) {
				this.valorItem = 0;
			}else {
				this.valorItem = valorItem;
			}
			this.numItem = numItem;
			this.descItem = descItem;			
			
			
		}
		public int getNumItem() {
			return numItem;
		}
		public void setNumItem(int numItem) {
			this.numItem = numItem;
		}
		public String getDescItem() {
			return descItem;
		}
		public void setDescItem(String descItem) {
			this.descItem = descItem;
		}
		public int getQtItem() {
			return qtItem;
		}
		public void setQtItem(int qtItem) {
			this.qtItem = qtItem;
		}
		public float getValorItem() {
			return valorItem;
		}
		public void setValorItem(float valorItem) {
			this.valorItem = valorItem;
		}
		public float getInvoiceAmount(float valorItem, int qtItem) {
				return valorItem*qtItem;
		}
		@Override
		public String toString() {
			return "[Fatura]\nNumero do produto= " + numItem + "\nDescricao= " + descItem + "\nQnt.= " + qtItem + "\nValor unit.= "
					+ valorItem;
		}
		
		
		
		
}
