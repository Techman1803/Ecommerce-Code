package Users;

public abstract class User {

String UserID = "";
String Password = "";
String LoginStatus = "";
abstract Boolean VerifyUser ();
public String getUserID() {
	return UserID;
}
public void setUserID(String userID) {
	UserID = userID;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getLoginStatus() {
	return LoginStatus;
}
public void setLoginStatus(String loginStatus) {
	LoginStatus = loginStatus;
}

}
