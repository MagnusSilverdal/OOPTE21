import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

public class Ball  {
    private int x = 0;
    private int y = 0;
    private BufferedImage image = null;

    public Ball() {
        try {
            image = ImageIO.read(getClass().getResource("ball.png"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics g) {
        g.drawImage(image, x, y, image.getWidth(), image.getHeight(), null);
    }

    public void update() {
    }
}
