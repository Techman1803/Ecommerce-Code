package E_Commerce;
import java.util.Scanner;
import Users.Customer;
import Cart.Cart;
import Product.Products;
import Product.Catalogue;
import Users.Seller;

    public class Store {

	public static void main(String[] args) {
        System.out.println("*******************************");
		System.out.println("Welcomw to the **VH** Online Store");
		System.out.println("********************************");
		System.out.println("Which User are You  1.Customer 2.Seller 3.Adminstrator");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		String typeOfuser;

		if (choice == 1) {
			typeOfuser = "Customer";

			Customer current = new Customer();
			System.out.println("Please Enter your UserID");
			sc.nextLine();
			current.setUserID(sc.nextLine());
			System.out.println("Enter your Password");
			current.setPassword(sc.nextLine());
			if (current.VerifyUser() == true) {
				System.out.println("User Verified");
				while (true) {

					System.out.println("Do you want to 1.View Products 2.View Cart 3.Contact us 4.Exit");
					choice = sc.nextInt();
					if (choice == 1) {
						Catalogue catlogue = new Catalogue();
						Products[] allProducts = catlogue.getListofAllProducts();

						for (int i = 0; i < allProducts.length; i++) {

							System.out.println(allProducts[i].getProductID() + " " + allProducts[i].getName() + " "
									+ allProducts[i].getCost() + "Rs");
						}
						System.out.println("Do you Want to Add  items to Cart Y/N");
						sc.nextLine();
						String addtoCart = sc.nextLine();
						if (addtoCart.equals("Y")) {
							System.out.println("Enter the ProductID of Product Which you want to add");
							String ProductId = sc.nextLine();
							Products[] cartproducts = new Products[1];
							for (int i = 0; i < allProducts.length; i++) {
								if (allProducts[i].getProductID().equals(ProductId)) {
									cartproducts[0] = allProducts[i];
								}
							}
							Cart cart = new Cart();
							cart.setCartID("1");
							cart.setListOfproduct(cartproducts);
							System.out.println(cartproducts[0].getName());
							current.setCart(cart);
							System.out.println("Product is Successfully added into Cart");
						}

					} else if (choice == 2) {
						Products[] cartproducts = current.getCart().getListOfproduct();
						System.out.println(current.getCart().getCartID());
						for (int i = 0; i < cartproducts.length; i++) {
							System.out.println(cartproducts[i].getProductID() + " " + cartproducts[i].getName() + " "
									+ cartproducts[i].getCost());
						}
						System.out.println("Do you want to Checkout Y/N");
						sc.nextLine();
						String checkout = sc.nextLine();
						if (checkout.equals("Y"))
							if (current.getCart().Checkout())
								System.out.println("Your Oder is Placed Succesfully");
					} else if (choice == 3) {
						System.out.println("Cotact us on Ph.No : +91 9884653427");
						System.out.println("Or Email us at VH.Caters@gmail.com");
					} else if (choice == 4)
						break;
            
					else {
						System.out.println("Invalid Input. Try Again");
					}

				}
			}
		} else if (choice == 2) {

			typeOfuser = "Seller";
			Seller currentSeller = new Seller();
			System.out.println("Please Enter your UserID");
			sc.nextLine();
			currentSeller.setUserID(sc.nextLine());
			System.out.println("Enter your Password");
			currentSeller.setPassword(sc.nextLine());
			if (currentSeller.VerifyUser() == true) 
				System.out.println("User Verified");

				while (true) {

					System.out.println("What you want to do 1.View Products 2.Add Product 3.Contact Admin 4.Exit");
					choice = sc.nextInt();
					if (choice == 1) {
						Catalogue catlogue = new Catalogue();
						Products[] SellerAddedProduct = catlogue.getSellerProducts();

						for (int i = 0; i < SellerAddedProduct.length-1; i++) {
							System.out.println(SellerAddedProduct[i].getName() + " "
									+ SellerAddedProduct[i].getProductID() + " " + SellerAddedProduct[i].getCost());
						}
					}
			
					else if (choice == 2) {
						System.out.println("Select the Product ID Which you want to add");
						String productID = sc.nextLine();
						sc.nextLine();
						System.out.println("Enter the Product Name");
						String S1 =sc.nextLine();
						System.out.println("Enter the Product Price");
						String S2 = sc.nextLine();
					    System.out.println("Product successfully added");
					    System.out.println("you have selected " +S1+" of Price "+S2+" to Sell");
					}
					
					 else if (choice == 3) {
						System.out.println("Cotact us on Ph.No : +91 9884653427");
						System.out.println("Or Email us at VH.Caters@gmail.com");
					} else if (choice == 4)
						break;
					else
						System.out.println("Invalid Entry Please Try Again");
				}
			}
		 else if (choice == 3) {
			 

				while (true) {

					System.out.println("Do you want to 1.View all Products 2.Exit");
					int choiceAdmin = sc.nextInt();
					if (choiceAdmin == 1) {
					 	Catalogue catlog2 = new Catalogue();
						Products[] show = catlog2.getListofAllProducts();
						for (int i = 0; i < show.length-1; i++) {
							System.out.println(" "+show[i].getProductID() + show[i].getName() + " " + show[i].getCost());
                         
						}
						Catalogue ctlg = new Catalogue();
						Products[] show2 = ctlg.getSellerProducts();
						for (int i = 0; i < show2.length-1; i++) {
							System.out.println( " "+ show2[i].getProductID() + show2[i].getName() + " " + show2[i].getCost());
						}
					} else if (choiceAdmin == 2) {
						System.out.println("Thanks you");
						break;
					}
				}

		} else
			System.out.println("Selected Choice is invalid");
	}

}
