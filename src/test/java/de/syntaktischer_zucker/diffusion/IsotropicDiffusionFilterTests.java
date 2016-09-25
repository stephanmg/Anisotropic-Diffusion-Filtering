/// package's name
package de.syntaktischer_zucker.diffusion;

/// imports
import java.net.MalformedURLException;
import java.net.URL;
import lombok.extern.log4j.Log4j2;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @brief
 * @author stephanmg <stephan@syntaktischer-zucker.de>
 */
@Log4j2
public class IsotropicDiffusionFilterTests {
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
	
	
	/**
	 * @brief test filter function
	 */
	@Test
	public void testFilter() {
		Filter baseStrategy = new FilterFactory().getFilter();
		assertNotNull(baseStrategy);
		
		URL url = null;
		
		try {
			url = new URL("https://upload.wikimedia.org/wikipedia/en/2/24/Lenna.png");
		} catch (MalformedURLException ex) {
			log.error(ex);
		}
		
		ImageProcessor processor = new ImageProcessor();
		processor.process(url);
	}
}
