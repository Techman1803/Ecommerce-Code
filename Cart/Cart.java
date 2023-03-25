package Cart;
import Product.Products;
public class Cart {
	
	private String CartID;
	private String SellerID;
	
	public String getSellerID() {
		return SellerID;
	}

	public void setSellerID(String sellerID) {
		SellerID = sellerID;
	}

	public String getCartID() {
		return CartID;
	}

	public void setCartID(String cartID) {
		CartID = cartID;
	}

	private Products[] listOfproduct;

	public Products[] getListOfproduct() {
		return listOfproduct;
	}

	public void setListOfproduct(Products[] listOfproduct) {
		this.listOfproduct = listOfproduct;
	}
	public boolean Checkout() {
		return true;
	}
	

}
