/// package's name
package de.syntaktischer_zucker.diffusion;

/// imports
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import lombok.extern.log4j.Log4j2;

/**
 * @brief main method
 * @author stephanmg <stephan@syntaktischer-zucker.de>
 */
@Log4j2
public class Main {
	/**
	 * @brief
	 * @param args
	 */
	public static void main(String... args) {
		try {
			/// isotropic filter for test image "Lenna"
			log.info("Starting filtering with isotropic filter ");
			new ImageProcessor().process(new URL("https://upload."
				+ "wikimedia.org/wikipedia/en/2/24/Lenna.png"), 
				new File("test_iso.png").toURI().toURL());
			log.info("... done.");

			/// anisotropic filter for test image "Lenna"
			log.info("Starting filtering with anisotropic filter ");
			ImageProcessor p = new ImageProcessor();
			p.setFilter(new AnisotropicDiffusionFilter());
			p.process(new URL("https://upload.wikimedia.org/wiki"
				+ "pedia/en/2/24/Lenna.png"), new File("test_a"
				+ "niso.png").toURI().toURL());
			log.info("... done.");

			/// anisotropic filter for test image "Lion"
			p.process(new URL("http://www.cs.utoronto.ca/~strider"
				+ "/Denoise/Benchmark/0072_35.jpg"), new File("test_lion.png").toURI().toURL());
		} catch (MalformedURLException ex) {
			log.error(ex);
		}
	}
}
