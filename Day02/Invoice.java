//Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item
//sold at the store. An Invoice should include four pieces of information as fields—a part number
//(type String), a part description (type String), a quantity of the item being purchased (type int) and a
//price per item (double). Your class should have a constructor
//that initializes the four instance variables. Provide a set and a get method for each instance variable.
//calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
//amount as a double value.
//If the quantity is not positive, it should be set to 0.
//If the price per item is not positive, it should be set to 0.0.
//Write a test application named InvoiceTest that demonstrate class Invoice’s capabilitie
package P1;

public class Invoice {
	
		
		String partno;
		String partdesc;
		int quant;
		double price;
		
		public Invoice(String partno, String partdesc, int quant, double price) 
		{
			super();
			
			this.partno = partno;
			this.partdesc = partdesc;
			this.quant = quant;
			this.price = price;
		}
		public Invoice() {
			
		}
		public String getPartno() {
			return partno;
		}
		public void setPartno(String partno) {
			this.partno = partno;
		}
		public String getPartdesc() {
			return partdesc;
		}
		public void setPartdesc(String partdesc) {
			this.partdesc = partdesc;
		}
		public int getQuant() {
			return quant;
		}
		public void setQuant(int quant) {
			this.quant = quant;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		
		double Calculate() {
			
			return price*quant;
		}
		
		
		
}
