import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
 
public class Panneau2 extends JPanel { 
	
	private int[][] grille = new int[10][10];
	
	public void paintComponent(Graphics g){
		try 
		{
			Image[] img = new Image[3];
			img[0] = ImageIO.read(new File("case0.png"));
			img[1] = ImageIO.read(new File("bateau.png"));
			img[2] = ImageIO.read(new File("case2.png"));
	      
			for(int i = 0; i < grille.length; i++)
			{
				for(int j = 0; j < grille[0].length; j++)
				{
					if(grille[i][j] == 0)
						g.drawImage(img[0], 25*i, 25*j, this);
					else if(grille[i][j] < 6)
						g.drawImage(img[1], 25*i, 25*j, this);
					else
						g.drawImage(img[2], 25*i, 25*j, this);
				}
			}
			
			//Pour une image de fond
			//g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}   
	}    
	
	public void setGrid(int[][] grille)
	{
		for(int i = 0; i < grille.length; i++)
		{
			for(int j = 0; j < grille[0].length; j++)
			{
				this.grille[i][j] = grille[i][j];
			}
		}
	}
}