package curs2;

public class Rectangle {
	
	//variabile
	private int lenght;
	private int width;
	
	//constructor
	public Rectangle(int lenght, int width) {
		this.lenght = lenght;
		this.width = width;
	}
    //metoda
	public int calculateArea () {
		return lenght * width;
		
	}
	
	
	/*clasa Driver --> Chrome
	 * 
	 * clasa de PageObjects
	 * public PageObjects(driver){
	 * this.driver = driver; }
	 * 
	 * 
	 * buton bakery = driver.findElement(locator).click();
	 * 
	 * clase de Test
	 * PageObject obj. new PageObject(driver)
	 * PageObject.Bakery.click();
	 * 
	 */
}
