package Users;
import Product.Products;
public class Seller extends User {
	
	
	private String List;
	private Products[] productListed;
    @Override
	public Boolean VerifyUser() {
		
		return true;
	}
	public Products[] getProductListed() {
		return productListed;
	}
	public void setProductListed(Products[] productListed) {
		this.productListed = productListed;
	}
	public void setList(String list) {
		List = list;
	}
     

}
