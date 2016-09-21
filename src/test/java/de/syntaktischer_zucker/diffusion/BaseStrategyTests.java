/// package's name
package de.syntaktischer_zucker.diffusion;

/// imports
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author stephanmg <stephan@syntaktischer-zucker.de>
 */
public class BaseStrategyTests {
	/**
	 * @brief
	 */
	@BeforeClass
	public static void setUpClass() {
	}
	
	/**
	 * @brief
	 */
	@AfterClass
	public static void tearDownClass() {
		
	}
	
	/**
	 * @brief
	 */
	@Before
	public void setUp() {
	}
	
	/**
	 * @brief
	 */
	@After
	public void tearDown() {
	}
	
	@Test
	public void testDummy() {
		Assert.assertEquals(1, 1);
	}
}
