/// package's name
package de.syntaktischer_zucker.diffusion;

/**
 * @brief anisotropic diffusion filter with a variant for fluxes
 * Cf. project description for course 8023 (this implementation
 * corresponds to the case when Eq. (4) is used for the fluxes)
 * @author stephanmg <stephan@syntaktischer-zucker.de>
 */
public class AnisotropicDiffusionFilterVariant extends AnisotropicDiffusionFilter {
	/// members
	private double kappa = 5;
	
	/// methods
	/**
	 * @brief
	 * @param intensity
	 * @return
	 */
	@Override
	protected double flux_derivative(double intensity) {
		return 1 / (1 + Math.pow(intensity / this.kappa, 2));
	}
	
	/// ctors
	/**
	 * @brief 
	 * @param kappa 
	 */
	public AnisotropicDiffusionFilterVariant(double kappa) {
		this.kappa = kappa;
	}
}
	
