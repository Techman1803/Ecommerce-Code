package Users;
import Cart.Cart;
public class Customer extends User {
	
    
	private Cart cart;
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	@Override
	public Boolean VerifyUser() {
		return true;
	}
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String UserID) {
		this.UserID = UserID;
	}
	
}
