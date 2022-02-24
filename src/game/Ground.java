package game;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
public class Ground {
    private BufferedImage groundImage;
    private int x1, y1, x2, y2, x3, y3;
    public Ground() {
        try {groundImage = ImageIO.read(new File("src/game/Dat.png"));
        } catch (Exception e) {}
        x1 = 0;
        y1 = 540;
        x2 = x1 + 605;
        y2 = 540;
        x3 = x2 + 605;
        y3 = 540;
    }
    public void Update() {
        x1 -= 3;
        x2 -= 3;
        x3 -= 3;
        if (x2 < 0) {
            x1 = x3 + 605;}
        if (x3 < 0) {
            x2 = x1 + 605;}
        if (x1 < 0) {
            x3 = x2 + 605;}}
    public void Paint(Graphics2D g2) {
        g2.drawImage(groundImage, x1, y1, null);
        g2.drawImage(groundImage, x2, y2, null);
        g2.drawImage(groundImage, x3, y3, null);}
    public int getYground() {
        return y1;}
}
