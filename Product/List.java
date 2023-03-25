package Product;

public class List {
	

	private String List;
	
	public String getList() {
		return List;
	}

	public void setList(String list) {
		List = list;
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
