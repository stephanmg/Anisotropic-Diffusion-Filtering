/// package's name
package de.syntaktischer_zucker.diffusion;

/// imports
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import lombok.extern.log4j.Log4j2;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @brief tests for AnisotropicDiffusionFilter
 * @author stephanmg <stephan@syntaktischer-zucker.de>
 */
@Log4j2
public class AnisotropicDiffusionFilterTests {
	/// members
	private final double kappa = 5;
	
	/// methods
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
	 * @brief test filter
	 */
	@Test
	public void testFilter() {
		Filter baseStrategy = new FilterFactory().getAnisotropicDiffusionFilter();
		assertNotNull(baseStrategy);
		
		URL url = null;
		
		try {
			url = new URL("https://upload.wikimedia.org/wikipedia/en/2/24/Lenna.png");
		} catch (MalformedURLException ex) {
			log.error(ex);
		}
		
		try {
			new ImageProcessor().process(url, new File("test.png").toURI().toURL());
		} catch (MalformedURLException ex) {
			log.error(ex);
		}
	}

	/**
	 * @brief test filter variant
	 */
	@Test
	public void testFilterVariant() {
		Filter baseStrategy = new FilterFactory().getAnisotropicDiffusionFilterVariant(kappa);
		assertNotNull(baseStrategy);
		
		URL url = null;
		
		try {
			url = new URL("https://upload.wikimedia.org/wikipedia/en/2/24/Lenna.png");
		} catch (MalformedURLException ex) {
			log.error(ex);
		}
		
		try {
			new ImageProcessor().process(url, new File("test.png").toURI().toURL());
		} catch (MalformedURLException ex) {
			log.error(ex);
		}
	}
}
