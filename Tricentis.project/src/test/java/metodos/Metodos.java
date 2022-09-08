package metodos;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import elementos.Elementos;

public class Metodos {
	public static WebDriver driver;
	Elementos el = new Elementos();

	
	public WebElement clicar(By id) {
		WebElement elemento = driver.findElement(id);
		elemento.click();
		return elemento;

	}
	

	public WebElement selecionarOpcaoMenu(By id, String valor) {
		WebElement element = driver.findElement(id);
		element.click();
		Select combo = new Select(element);
		combo.selectByValue(valor);
		return element;
	}
	public WebElement selecionarMenuValor(By id, String valor) {
		WebElement element = driver.findElement(id);
		element.click();
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);;
		return element;
	}

	public WebElement clicarEscrever(By id, String texto) {
		WebElement elemento = driver.findElement(id);
		elemento.click();
		elemento.sendKeys(texto);
		return elemento;
	}

	public WebElement selecionar(By id, String valor) {
		WebElement element = driver.findElement(id);
		Select combo = new Select(element);
		combo.selectByValue(valor);

		return element;
	}
	
	public void selecionarPreco(String tipo) {
		if(tipo.equalsIgnoreCase("Silver")) {
			clicar(el.silver);
		}else if(tipo.equalsIgnoreCase("gold")) {
			clicar(el.gold);
		}else if(tipo.equalsIgnoreCase("platinum")) {
			clicar(el.platinum);
		}else if(tipo.equalsIgnoreCase("ultimate")) {
			clicar(el.ultimate);
		}
	}
	public void validarAlert() {
		Alert alert = driver.switchTo().alert();
		String texto = alert.getText();
		Assert.assertEquals("Sending e-mail sucess!", texto);
		alert.accept();
	}
	
	/*public void evidenciarTeste(){
		TakesScreenshot scrshot = (TakesScreenshot) driver;
		File srcFile = scrshot.getScreenshotAs(OutputType.FILE);
		
	}*/
}
