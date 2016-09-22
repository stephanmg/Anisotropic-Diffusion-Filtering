/// package's name
package de.syntaktischer_zucker.diffusion;

/// imports
import java.awt.Image;
import lombok.Setter;

/**
 * @brief
 * @author stephanmg <stephan@syntaktischer-zucker.de>
 */
@Setter
public class FilterContext {
	/// members
	private Filter filter = null;
	

	/// methods
	/**
	 * @brief
	 * @param img
	 */
	public void doFilter(Image img) {
		if (this.filter != null) {
			this.filter.filter(img);
		}
	}
}