package net.life;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import net.life.world.World;
import net.life.world.cell.CellInitializer;
import net.life.world.cell.CellProcessor;

public class Life {
	
	public static void main(String[] args) throws IOException {
		World world = new World(100, 100);
		
		world.initialize(CellInitializer.GLIDER_PATTERN);
		
		world.update(CellProcessor.DEFAULT, 100);
		
		BufferedImage image = world.toImage();
		
		File file = new File("world.png");
		
		ImageIO.write(image, "PNG", file);
	}
	
}
