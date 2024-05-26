package no11;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;
import javax.imageio.ImageIO;

public class ImageClass {
    public static void main(String[] args) {
        ImageClass Iclass = new ImageClass();
        String fileGambar = "src/no11/java-logo.png";
        int[][][] arrayRGB = Iclass.ReadGambar(fileGambar);
        int[][] arrayGray = Iclass.RGBtoGray(arrayRGB);
        
        for (int i = 0; i < arrayGray.length; i++) {
            System.out.println(Arrays.toString(arrayGray[i]));
        }
        
    }

    private int[][][] ReadGambar(String fileGambar) {
        int[][][] array3d = null;
        try {
            File file = new File(fileGambar);
            BufferedImage image =ImageIO.read(file);
            int width = image.getWidth();
            int heigth = image.getHeight();
            array3d = new int [width][heigth][3];
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < heigth; j++) {
                    int color = image.getRGB(i, j);
                    int red = (color & 0x00ff0000)>>16;
                    int green = (color & 0x0000ff00)>>8;
                    int blue = (color & 0x000000ff);
                    array3d[i][j][0] = red;
                    array3d[i][j][1] = green;
                    array3d[i][j][2] = blue;
                }
            }
            
        } catch (Exception e) {
        }
        return array3d;
    }

    private int[][] RGBtoGray(int[][][] arrayRGB) {
        int[][] array2d = null;
        try {
            array2d = new int [arrayRGB.length][arrayRGB[0].length];
            for (int i = 0; i < array2d.length; i++) {
                for (int j = 0; j < array2d[i].length; j++) {
                    int red = arrayRGB[i][j][0];
                    int green = arrayRGB[i][j][1];
                    int blue = arrayRGB[i][j][2];
                    double gray = (double)(red+green+blue)/(double)3;
                    array2d[i][j] = (int)Math.round(gray);
                }
            }
        } catch (Exception e) {
        }
        return array2d;
    }
        
       
}
