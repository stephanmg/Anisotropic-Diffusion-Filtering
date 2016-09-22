/// package's name
package de.syntaktischer_zucker.diffusion;

/**
 *
 * @author stephanmg <stephan@syntaktischer-zucker.de>
 */
public class Client {
	/**
	 * @brief
	 * @param args 
	 */
	public static void main(final String... args) {
		FilterContext context = new FilterContext();
		context.setFilter(new BaseFilter());
		context.doFilter();
	}
}
