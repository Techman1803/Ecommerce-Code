package Product;

public class Catalogue {
	
private	Products [] listofAllProducts;
private Products[] getSellerProducts;

	public Products[] getListofAllProducts() {
	    Products product1 = new Products();
	    product1.setProductID("M32");
	    product1.setName("Trousers");
	    product1.setCost("400 Rs");
	    Products product2 = new Products();
	    product2.setProductID("UK10");
	    product2.setName("Shoes");
	    product2.setCost("1199 Rs");
	    Products product3 = new Products();
	    product3.setProductID("L-40");
	    product3.setName("T-Shirt");
	    product3.setCost("399 Rs");
	    Products product4 = new Products();
	    product4.setProductID("XL42");
	    product4.setName("Sweat Wears");
	    product4.setCost("1299 Rs");
	    Products product5 = new Products();
	    product5.setProductID("L-42");
	    product5.setName("Jacket");
	    product5.setCost("899 Rs");
	    Products product6 = new Products();
	    product6.setProductID("L42");
	    product6.setName("Jum - Suits");
	    product6.setCost("999 Rs");

	    listofAllProducts = new Products[6];
	    listofAllProducts[0] = product1;
	    listofAllProducts[1] = product2;
	    listofAllProducts[2] = product3;
	    listofAllProducts[3] = product4;
	    listofAllProducts[4] = product5;
	    listofAllProducts[5] = product6;
		return listofAllProducts;
		
	}
	   public Products[] getSellerProducts() {
		Products product1 = new Products();
		product1.setProductID("1112");
		product1.setName("TABLE");
		product1.setCost("1000 Rs");
		Products product2 = new Products();
		product2.setProductID("2223");
		product2.setName("FRIDGE");
		product2.setCost("2000 Rs");
		Products product3 = new Products();
		product3.setProductID("3332");
		product3.setName("Drawyer");
		product3.setCost("1500 Rs");
		Products product4 = new Products();
		product4.setProductID("3332");
		product4.setName("Godrej");
		product4.setCost("2100 Rs");
		getSellerProducts = new Products[4];
		getSellerProducts[0] = product1;
		getSellerProducts[1] = product2;
		getSellerProducts[2] = product3;
		
		
		return getSellerProducts;
	}

    
	public void setListofAllProducts(Products[] listofAllProducts) {
		this.listofAllProducts = listofAllProducts;
	}
	
}
