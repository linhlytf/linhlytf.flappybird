package game;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
public class backGround {
    private BufferedImage groundImage;
    private int x1, y1, x2, y2, x3, y3;
    public backGround() {
        try {groundImage = ImageIO.read(new File("src/game/background.jpg"));
        } catch (Exception e) {}
        x1 = 0;
        y1 = 0;
        x2 = x1 + 730;
        y2 = 0;
        x3 = x2 + 730;
        y3 = 0;}
    public void Update() {
        x1 -= 1;
        x2 -= 1;
        x3 -= 1;
        if (x2 < 0) {
            x1 = x3 + 730;}
        if (x3 < 0) {
            x2 = x1 + 730;}
        if (x1 < 0) {
            x3 = x2 + 730;}
    }
    public void Paint(Graphics2D g2) {
        g2.drawImage(groundImage, x1, y1, null);
        g2.drawImage(groundImage, x2, y2, null);
        g2.drawImage(groundImage, x3, y3, null);
    }
}
