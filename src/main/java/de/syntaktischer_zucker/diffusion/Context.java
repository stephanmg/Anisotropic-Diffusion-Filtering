/// package's name
package de.syntaktischer_zucker.diffusion;

/// imports
import lombok.Setter;

/**
 *
 * @author stephanmg <stephan@syntaktischer-zucker.de>
 */
@Setter
public class Context {
	private Strategy strategy = null;
	
	/**
	 * @brief
	 */
	public void execute() {
		if (this.strategy != null) {
			this.strategy.filter();
		}
	}
}