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
		Context context = new Context();
		context.setStrategy(new BaseStrategy());
		context.execute();
	}
}
