package sipa.bem;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author 2201010700_Ayudevi
 * tgl: 2024-06-20
 */
public class loadIMG {
    public static BufferedImage loadImage (String urlGambar){
        BufferedImage bimg =null;
        try {
            bimg = ImageIO.read(new File(urlGambar));
        }catch (IOException e){
            System.out.println("Gagal load gambar;"+e.getMessage());
        }
        return bimg;
    }
}

