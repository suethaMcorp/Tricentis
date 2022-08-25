package elementos;

import org.openqa.selenium.By;

public class Elementos {
	//menus
public By menuAutomobile = By.id("nav_automobile");
public By menuTruck = By.id("nav_truck");
public By menuMotorcycle = By.id("nav_motorcycle");
public By menuCamper = By.id("nav_camper");
//preencher dados 
public By campoMake = By.id("make");
public By enginePerformance = By.id("engineperformance");
public By DateOfManufacture = By.id("dateofmanufacture");
public By numberOfSeats = By.id("numberofseats");
public By fuelType = By.id("fuel");
public By listPrice = By.id("listprice");
public By licensePlateNumber = By.id("licenseplatenumber");
public By annualMileage = By.id("annualmileage");
public By botaoNext = By.id("nextenterinsurantdata");
//preencher dados do seguro
public By firstName  = By.id("firstname");
public By lastName  = By.id("lastname");
public By dateOfBirth = By.id("birthdate");
public By genderMale = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span");
public By genderFemale = By.id("genderfemale");
public By streetAdress = By.id("streetaddress");
public By zipCode = By.id("zipcode");
public By city = By.id("city");
public By ocupation = By.id("occupation");
public By hSpeeding = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span");
public By hBungee = By.id("bungeejumping");
public By hCliff = By.id("cliffdiving");
public By hSkydiving = By.id("skydiving");
public By hOther = By.id("other");
public By website = By.id("website");
public By picture = By.id("");
public By botaoNext2 = By.id("nextenterproductdata");
public By botaoPrev = By.id("preventervehicledata");
public By country = By.id("country");
public By Gender = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]");
// page produtos
public By startDate  = By.id("startdate");
public By insuranceSum  = By.id("insurancesum");
public By meritRating  = By.id("meritrating");
public By damageInsurance  = By.id("damageinsurance");
public By optionalProducts  = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span");
public By courtesyCar  = By.id("courtesycar");
public By botaoNext3 = By.id("nextselectpriceoption");
public By botaoPrev2 = By.id("preventerinsurancedata");
//Page preco
public By silver  = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span");
public By gold  = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span");
public By platinum  = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span");
public By ultimate  = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span");
public By botaoNext4 = By.xpath("//*[@id=\"nextselectpriceoption\"]");
public By botaoPrev3 = By.id("preventerproductdata");
// dados pessoais
private By email = By.id("email");
private By phone = By.id("phone");
private By username = By.id("username");
private By password = By.id("password");
private By confirmpassword = By.id("confirmpassword");
private By Comments = By.id("Comments");
private By botaoSend = By.id("sendemail");
//objetos publicos 
public By getEmail() {
	return email;
}
public By getPhone() {
	return phone;
}
public By getUsername() {
	return username;
}
public By getPassword() {
	return password;
}
public By getConfirmpassword() {
	return confirmpassword;
}
public By getComments() {
	return Comments;
}
public By getBotaoSend() {
	return botaoSend;
}


}
