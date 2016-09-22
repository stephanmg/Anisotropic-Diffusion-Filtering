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

@Log4j2
/**
 * @brief
 * @author stephanmg <stephan@syntaktischer-zucker.de>
 */
public class ImageProcessorTests {
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
	}

	/**
	 * @brief tests loadImage
	 */
	@Test
	public void loadImage() {
		URL url = null;
		
		try {
			url = new URL("https://upload.wikimedia.org/wikipedia/en/2/24/Lenna.png");
		} catch (MalformedURLException ex) {
			log.error(ex);
		}
		
		new ImageProcessor().loadImage(url);
	}
}
