package game;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import pkg2dgamesframework.AFrameOnImage;
import pkg2dgamesframework.Animation;
import pkg2dgamesframework.GameScreen;

public class Game extends GameScreen {
    private BufferedImage birds;
    private Animation bird_anim;
    public static float g = 0.15f;
    private Bird bird;
    private Ground ground;
    private backGround backGround;
    private ChimneyGroup chimneyGroup;
    int Point = 0;
    int lanchoi = 1;
    private int BEGIN_SCREEN = 0;
    private int GAMEPLAY_SCREEN = 1;
    private int GAMEOVER_SCREEN = 2;
    private int CurrentScreen = BEGIN_SCREEN;
    public Game() {
        super(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        
        try {birds = ImageIO.read(new File("src/game/bird.png"));
        } catch (IOException ex) {}
        bird_anim = new Animation(100);
        AFrameOnImage f;
        f = new AFrameOnImage(0, 0, 60, 60);
        bird_anim.AddFrame(f);
        f = new AFrameOnImage(60, 0, 60, 60);
        bird_anim.AddFrame(f);
        f = new AFrameOnImage(120, 0, 60, 60);
        bird_anim.AddFrame(f);
        f = new AFrameOnImage(60, 0, 60, 60);
        bird_anim.AddFrame(f);
        bird = new Bird(350, 250, 35, 35);
        ground = new Ground();
        backGround = new backGround();
        chimneyGroup = new ChimneyGroup();
        BeginGame();
    }
    public static void main(String[] args) {
        new Game().setVisible(true);
    }
    public void GhiFile() throws IOException {
        String data = Integer.toString(lanchoi) + "\t" + Integer.toString(Point) + "\t";
        if (Point < 5) {
            data += "=> Ban Can Co Gang Hon \n";
        } else if (Point < 25) {
            data += "=> Cung Tam Duoc \n";
        } else if (Point < 100) {
            data += "=> Kha Lam!!! \n";
        } else {
            data += "=> Ban That Xuat Sac!!! \n";
        }
        try (FileWriter fw = new FileWriter("LichSu.txt", true)) {
            fw.write(data);
            fw.close();
        }
    }

    public void resetGame() {
        bird.setPos(350, 250);
        bird.setVT(0);
        bird.setLive(true);
        Point = 0;
        chimneyGroup.resetChimneys();
    }

    @Override
    public void GAME_UPDATE(long deltaTime) {
        if (CurrentScreen == BEGIN_SCREEN) {
            resetGame();
        } else if (CurrentScreen == GAMEPLAY_SCREEN) {
            if (bird.getLive()) {
                bird_anim.Update_Me(deltaTime);}
            bird.update(deltaTime);
            ground.Update();
            backGround.Update();
            chimneyGroup.update();
            for (int i = 0; i < chimneyGroup.SIZE; i++) {
                if (bird.getRect().intersects(chimneyGroup.getChimney(i).getRect())) {
                    if (bird.getLive()) {
                        bird.bupSound.play();}
                    bird.setLive(false);
                    System.out.println("Trò Chơi Kết Thúc!!!");}
            }
            for (int i = 0; i < chimneyGroup.SIZE; i++) {
                if (bird.getPosX() > chimneyGroup.getChimney(i).getPosX()
                        && !chimneyGroup.getChimney(i).getIsBehindBird()
                        && i % 2 == 0) {
                    Point++;
                    bird.getPointSound.play();
                    chimneyGroup.getChimney(i).setIsBehindBird(true);}
            }
            if (bird.getPosY() + bird.getH() > ground.getYground() + 10) {
                CurrentScreen = GAMEOVER_SCREEN;
                try {
                    GhiFile();
                } catch (IOException ex) {
                    Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
                }
                lanchoi++;
            }
        }
    }

    @Override
    public void GAME_PAINT(Graphics2D g2) {
        backGround.Paint(g2);
        chimneyGroup.paint(g2);
        ground.Paint(g2);
        if (bird.getisFlying()) {
            bird_anim.PaintAnims((int) bird.getPosX(), (int) bird.getPosY(), birds, g2, 0, -1);
        } else {
            bird_anim.PaintAnims((int) bird.getPosX(), (int) bird.getPosY(), birds, g2, 0, 0);
        }
        if (CurrentScreen == BEGIN_SCREEN) {
            g2.setColor(Color.BLACK);
            g2.setFont(new Font("NewellsHand", Font.PLAIN, 30));
            g2.drawString("Bấm Phím Bất Kì Để Bắt Đầu Chơi!", 160, 50);
        }
        if (CurrentScreen == GAMEOVER_SCREEN) {
            g2.setColor(Color.red);
            g2.setFont(new Font("NewellsHand", Font.PLAIN, 30));
            g2.drawString("Game Over", 310, 300);
            g2.drawString("Điểm: " + Point, 20, 50);
        }
        if (CurrentScreen == GAMEPLAY_SCREEN) {
            g2.setColor(Color.BLACK);
            g2.setFont(new Font("NewellsHand", Font.PLAIN, 30));
            g2.drawString("Lần: " + lanchoi, 40, 50);
            g2.drawString("Điểm: " + Point, 20, 90);
        }
    }
    @Override
    public void KEY_ACTION(KeyEvent e, int Event) {
        if (Event == KEY_PRESSED) {
            if (CurrentScreen == BEGIN_SCREEN) {
                CurrentScreen = GAMEPLAY_SCREEN;
            } else if (CurrentScreen == GAMEPLAY_SCREEN) {
                if (bird.getLive()) {
                    bird.fly();
                }
            } else if (CurrentScreen == GAMEOVER_SCREEN) {
                CurrentScreen = BEGIN_SCREEN;}
        }
    }
}
