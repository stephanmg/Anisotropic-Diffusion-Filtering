/// package's name
package de.syntaktischer_zucker.diffusion;

/// imports
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;

/**
 * @brief
 * @author stephanmg <stephan@syntaktischer-zucker.de>
 */
public class IsotropicDiffusionFilter implements Filter {
	/// members
	private final int iter;
	private final double lambda;

	
	/// ctors
	public IsotropicDiffusionFilter() {
		this.iter = 100;
		this.lambda = 0.25;
	}

	
	/// methods
	/**
	 * @brief 
	 * @param img
	 */
	@Override
	public void filter(Image img) {
		BufferedImage image = (BufferedImage) img;
		for (int k = 0; k < this.iter; k++) {
			for (int i = 1; i < image.getWidth()-1; i++) {
				for (int j = 1; j < image.getHeight()-1; j++) {
					int rgb_north  = image.getRGB(i, j-1);
					int rgb_south  = image.getRGB(i, j+1);
					int rgb_west   = image.getRGB(i-1, j);
					int rgb_east   = image.getRGB(i+1, j);
					int rgb_center = image.getRGB(i, j);
					
					/// FTCS
					/// central difference approximation for each image channel
					/// correct current pixel's values by one forward Euler step 
					int red_new  = (int) (( (rgb_center >> 16) & 0xFF) +
						      this.lambda*(-4* ((rgb_center >> 16) & 0xFF) +
						      ((rgb_west >> 16) & 0xFF) +
						      ((rgb_east >> 16) & 0xFF) +
						      ((rgb_south >> 16) & 0xFF) +
						      ((rgb_north >> 16) & 0xFF)));

					int green_new = (int) (( (rgb_center >> 16) & 0xFF) +
						      this.lambda*(-4* ((rgb_center >> 16) & 0xFF) +
						      ((rgb_west >> 16) & 0xFF) +
						      ((rgb_east >> 16) & 0xFF) +
						      ((rgb_south >> 16) & 0xFF) +
						      ((rgb_north >> 16) & 0xFF)));
					
					int blue_new  = (int) (((rgb_center & 0xFF) +
						      this.lambda*(-4* (rgb_center & 0xFF) +
						      (rgb_west & 0xFF) +
						      (rgb_east & 0xFF) +
						      (rgb_south & 0xFF) +
						      (rgb_north & 0xFF))));
					
					Color color = new Color(red_new, green_new, blue_new);
					image.setRGB(i, j, color.getRGB());
				}
			}
		}
	}
}
