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
			/*
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

			/// anisotropic filter for test image isotropic filtered "Lenna"
			log.info("Starting filtering with anisotropic filter ");
			p.setFilter(new AnisotropicDiffusionFilter());
			p.process(new File("test_iso.png").toURI().toURL(),
				new File("test_aniso2.png").toURI().toURL());
			log.info("... done.");

			/// anisotropic filter for test image "Lion"
			p.process(new URL("http://www.cs.utoronto.ca/~strider"
				+ "/Denoise/Benchmark/0072_35.jpg"), new File("test_lion.png").toURI().toURL());
			
			p.process(new URL("http://www.cs.utoronto.ca/~strider/Denoise/Benchmark/0194_35.jpg"), new File("pyramid.png").toURI().toURL());

			new ImageProcessor().process(new URL("http://www.cs.utoronto.ca/~strider"
				+ "/Denoise/Benchmark/0072_35.jpg"), new File("test_denoise.png").toURI().toURL());
			
			*/
			
			/*ImageProcessor p2 = new ImageProcessor();
			p2.setFilter(new AnisotropicDiffusionFilter(0.1, 10, 100));
			
			p2.process(new URL("http://www.cs.utoronto.ca/~strider"
			+ "/Denoise/Benchmark/0072_35.jpg"), new File("test_lion2.png").toURI().toURL());
			*/
			
			/*ImageProcessor p3 = new ImageProcessor();
			p3.setFilter(new AnisotropicDiffusionFilter(0.1, 1, 100));
			p3.process(new File("Eagle_coins.jpg").toURI().toURL(), new File("Eagle_coins_filtered.jpg").toURI().toURL());
			*/
			
			ImageProcessor p3 = new ImageProcessor();
			p3.setFilter(new AnisotropicDiffusionFilter(0.1, 20, 100));
			p3.process(new File("coins.png").toURI().toURL(), new File("coins_filtered2.jpg").toURI().toURL());

			///new ImageProcessor().process(new File("coins.png").toURI().toURL(), new File("coins_filtered_iso.jpg").toURI().toURL());
			

			/*ImageProcessor p4 = new ImageProcessor();
			p4.setFilter(new AnisotropicDiffusionFilter(0.10, 0.1, 500));
			p4.process(new File("0072_35.jpg").toURI().toURL(), new File("my_lion_aniso.jpg").toURI().toURL());	
			*/


			
		} catch (MalformedURLException ex) {
			log.error(ex);
		}
	}
}
