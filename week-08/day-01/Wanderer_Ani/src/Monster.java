import java.awt.*;

public class Monster extends Character {

    public Monster() {

        super("skeleton.png", 0, 0);
        super.posGEN();
        super.lvl = 1;
        super.hp = 2 * (r.nextInt(5) + 1) + r.nextInt(5) + 1;
        super.currentHP = hp;
        super.dp = r.nextInt(6) + (r.nextInt(5) + 1) / 2;
        super.sp = (r.nextInt(5) + 1);
        super.name = "Skeleton";
    }

    public void drawText(Graphics g, String text) {
        g.setColor(Color.black);
        g.setFont(new Font("TimesRoman", Font.BOLD, 12));
        g.drawString(text, 720 / 9, 35);
    }

    public String displayM() {
        String result = "";
        StringBuilder sb = new StringBuilder();
        sb.append(name + " (Level: " + lvl + ")");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HP: " + currentHP);
        result = sb.toString() + sb2.toString();
        return result;
    }
}
