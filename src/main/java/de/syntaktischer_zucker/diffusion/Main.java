/// package's name
package de.syntaktischer_zucker.diffusion;

/// imports
import java.net.MalformedURLException;
import java.net.URL;
import lombok.extern.log4j.Log4j2;

/**
 * @brief
 * @author stephanmg <stephan@syntaktischer-zucker.de>
 */
@Log4j2
public class Main {
	/**
	 * 
	 * @param args 
	 */
	public static void main(String... args) {
		try {
			System.err.println("Start");
			new ImageProcessor().process(new URL("https://upload.wikimedia.org/wikipedia/en/2/24/Lenna.png"));
			System.err.println("End");
		} catch (MalformedURLException ex) {
			log.error(ex);
		}
	}
}
