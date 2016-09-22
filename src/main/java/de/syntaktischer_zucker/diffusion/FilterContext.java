/// package's name
package de.syntaktischer_zucker.diffusion;

/// imports
import lombok.Setter;

/**
 *
 * @author stephanmg <stephan@syntaktischer-zucker.de>
 */
@Setter
public class FilterContext {
	private Filter filter = null;
	
	/**
	 * @brief
	 */
	public void doFilter() {
		if (this.filter != null) {
			this.filter.filter();
		}
	}
}