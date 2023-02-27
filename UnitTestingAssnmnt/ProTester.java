package UnitTestingAssnmnt;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

public class ProTester {
	@Test
	public void testCalculateFinalPriceWithNoDiscount() {
		Product product = new Product();
	    product.setPrice(100);
	    float finalPrice = product.calculateFinalPrice(0);
	    assertEquals(100, finalPrice, 0);
	}
	    
	@Test
	public void testCalculateFinalPriceWith10PercentDiscount() {
		Product product = new Product();
	    product.setPrice(100);
	    float finalPrice = product.calculateFinalPrice(10);
	    assertEquals(90, finalPrice, 0);
	}
	    
	@Test
	public void testCalculateFinalPriceWith50PercentDiscount() {
	    Product product = new Product();
	    product.setPrice(100);
	    float finalPrice = product.calculateFinalPrice(50);
	    assertEquals(50, finalPrice, 0);
	}
	    
	@Test
	public void testCalculateFinalPriceWith100PercentDiscount() {
	    Product product = new Product();
	    product.setPrice(100);
	    float finalPrice = product.calculateFinalPrice(100);
	    assertEquals(0, finalPrice, 0);
	}
}
