package metodos;

public class HomePage extends Metodos {
	
	
public void menu(String menu) {
	if(menu.equalsIgnoreCase("automobile")) {
		clicar(el.menuAutomobile);
	}else if(menu.equalsIgnoreCase("truck")) {
		clicar(el.menuTruck);
	}else if(menu.equalsIgnoreCase("motorcycle")) {
		clicar(el.menuMotorcycle);
	}else if(menu.equalsIgnoreCase("camper")) {
		clicar(el.menuCamper);
	}else {
		System.out.println("Opção invalida");
	}
	}


}
