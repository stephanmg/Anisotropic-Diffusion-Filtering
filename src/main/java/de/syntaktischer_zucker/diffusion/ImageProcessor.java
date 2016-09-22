/// package's name
package de.syntaktischer_zucker.diffusion;

/// imports
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

/**
 * @brief base image processor
 * Note: Employ a strategy pattern for the pre_process and 
 * post_process methods iff this flexibility is necessary
 * @author stephanmg <stephan@syntaktischer-zucker.de>
 */
@Log4j2
@Setter
public class ImageProcessor {
	/// members
	private final FilterContext context = new FilterContext();
	private final Filter filter = new BaseFilter();
	private Image image;
	

	/// methods
	/**
	 * @brief
	 * @param file
	 */
	public void process(final File file) {
		/// load image
		load_image(file);
		
		/// pre process image
		pre_process();
		
		/// filter image
		context.setFilter(this.filter);
		context.doFilter(this.image);
		
		/// post process image
		post_process();
		
	}
	
	/**
	 * @brief
	 */
	protected void pre_process() {
		
	}
	
	/**
	 * @brief
	 */
	protected void post_process() {
		
	}
	
	/**
	 * @brief
	 * @param file 
	 */
	protected void load_image(final File file) {
		try {
			this.image = ImageIO.read(file);
		} catch (IOException ex) {
			log.error("Error reading image from file in path: ");
			log.error(file.getAbsoluteFile());
			log.error(ex);
		}
	}
}