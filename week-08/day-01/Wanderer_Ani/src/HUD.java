public class HUD {

    protected String name;
    protected int lvlup;
    protected int maxHp;
    protected int maxDp;
    protected int maxSp;
    protected int currentHP;


    public HUD (Hero hero) {
        this.name = hero.getName();
        this.lvlup = hero.getLvl();
        this.maxHp = hero.getHp();
        this.currentHP = hero.getCurrentHp();
        this.maxDp = hero.getDp();
        this.maxSp = hero.getSp();

    }

    public String display () {
        String result = "";
        StringBuilder sb = new StringBuilder();
        sb.append(name + " (Level: " + lvlup + ")");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HP: " + currentHP + "/" + maxHp );
        result = sb.toString() + sb2.toString();
        return result;
    }
}
