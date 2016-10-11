/// package's name
package de.syntaktischer_zucker.diffusion;

/**
 * @brief
 * @author stephanmg <stephan@syntaktischer-zucker.de>
 */
public class FilterFactory {
	/**
	 * @brief
	 * @return 
	 */
	public Filter getFilter() {
		return new IsotropicDiffusionFilter();
	}
	
	/**
	 * @brief
	 * @return 
	 */
	public Filter getAnisotropicDiffusionFilter() {
		return new AnisotropicDiffusionFilter();
	}
	
	/**
	 * @brief 
	 * @param kappa
	 * @return 
	 */
	public Filter getAnisotropicDiffusionFilterVariant(double kappa) {
		return new AnisotropicDiffusionFilterVariant(kappa);
	}
}