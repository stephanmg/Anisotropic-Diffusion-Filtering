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
public class AnisotropicDiffusionFilter implements Filter {
	private double lambda = 0.1;
	private double kappa = 5;
	private int iter = 50;

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
					
					/// red diffs
					int red_new_N  = (((rgb_center >> 16) & 0xFF) -
						      ((rgb_north >> 16) & 0xFF)); 
					
					int red_new_W  = (((rgb_center >> 16) & 0xFF) -
						      ((rgb_west >> 16) & 0xFF)); 
					
					int red_new_S  = (((rgb_center >> 16) & 0xFF) -
						      ((rgb_south >> 16) & 0xFF)); 
					
					int red_new_E  = (((rgb_center >> 16) & 0xFF) -
						      ((rgb_east >> 16) & 0xFF)); 
					
					
					/// green diffs
					int green_new_N  = (((rgb_center >> 8) & 0xFF) -
						      ((rgb_north >> 8) & 0xFF)); 
					
					int green_new_W  = (((rgb_center >> 16) & 0xFF) -
						      ((rgb_west >> 8) & 0xFF)); 
					
					int green_new_S  = (((rgb_center >> 16) & 0xFF) -
						      ((rgb_south >> 8) & 0xFF)); 
					
					int green_new_E  = (((rgb_center >> 16) & 0xFF) -
						      ((rgb_east >> 8) & 0xFF)); 
					
					/// blue diffs
					int blue_new_N  = (((rgb_center >> 8) & 0xFF) -
						      (rgb_north & 0xFF)); 
					
					int blue_new_W  = (((rgb_center >> 16) & 0xFF) -
						      (rgb_west & 0xFF)); 
					
					int blue_new_S  = (((rgb_center >> 16) & 0xFF) -
						      (rgb_south & 0xFF)); 
					
					int blue_new_E  = (((rgb_center >> 16) & 0xFF) -
						      (rgb_east & 0xFF)); 
					
					double red_cN = Math.exp(-Math.pow((red_new_N/kappa), 2));
					double red_cS = Math.exp(-Math.pow((red_new_S/kappa), 2));
					double red_cW = Math.exp(-Math.pow((red_new_W/kappa), 2));
					double red_cE = Math.exp(-Math.pow((red_new_E/kappa), 2));
					
					double green_cN = Math.exp(-Math.pow((green_new_N/kappa), 2));
					double green_cS = Math.exp(-Math.pow((green_new_S/kappa), 2));
					double green_cW = Math.exp(-Math.pow((green_new_W/kappa), 2));
					double green_cE = Math.exp(-Math.pow((green_new_E/kappa), 2));
					
					double blue_cN = Math.exp(-Math.pow((blue_new_N/kappa), 2));
					double blue_cS = Math.exp(-Math.pow((blue_new_S/kappa), 2));
					double blue_cW = Math.exp(-Math.pow((blue_new_W/kappa), 2));
					double blue_cE = Math.exp(-Math.pow((blue_new_E/kappa), 2));

					int red_center = ((rgb_center >> 16) & 0xFF);
					int red_new =  (int) (red_center + lambda*(red_cN*red_new_N+red_cS*red_new_S
						+red_cE*red_new_E+red_cW*red_new_W));
					
					int green_center = ((rgb_center >> 8) & 0xFF);
					int green_new =  (int) (green_center + lambda*(green_cN*green_new_N+green_cS*green_new_S
						+green_cE*green_new_E+green_cW*green_new_W));
					
					int blue_center = ((rgb_center & 0xFF));
					int blue_new =  (int) (blue_center + lambda*(blue_cN*blue_new_N+blue_cS*blue_new_S
						+blue_cE*blue_new_E+blue_cW*blue_new_W));
					
					Color color = new Color(red_new, green_new, blue_new);
					image.setRGB(i, j, color.getRGB());
				}
			}
		}
	}
}