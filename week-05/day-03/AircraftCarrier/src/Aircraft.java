public abstract class Aircraft {
    private String name;
    private int maxAmmo = 0;
    private int baseDmg = 0;
    private int currentAmmo = 0;
    protected int dmg = 0;


    public Aircraft() {

    }


    public Aircraft(String name, int maxAmmo, int baseDmg) {
        this.name = name;
        this.maxAmmo = maxAmmo;
        this.baseDmg = baseDmg;
        this.currentAmmo = maxAmmo;
    }

    public int getCurrentAmmo() {
        return this.currentAmmo;
    }

    public void setCurrentAmmo(int currentAmmo) {
        this.currentAmmo = currentAmmo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxAmmo() {
        return this.maxAmmo;
    }

    public void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
    }

    public int getBaseDmg() {
        return baseDmg;
    }

    public void setBaseDmg(int baseDmg) {
        this.baseDmg = baseDmg;
    }

    public void fight() {

        this.dmg = this.maxAmmo * this.baseDmg;
        System.out.println("It's used all of the ammo");
        System.out.println("Damage dealt: " + dmg);
        setCurrentAmmo(0);

    }

    public int refill(int refillAmmo) {
        if (refillAmmo < this.getMaxAmmo()) {
            this.setCurrentAmmo(refillAmmo);
            refillAmmo-=currentAmmo;
            System.out.println("the remaining ammo: " + refillAmmo);
            return 0;
        } else {
            this.setCurrentAmmo(getMaxAmmo());
            refillAmmo -= this.getMaxAmmo();
            System.out.println("the remaining ammo: " + refillAmmo);
            return refillAmmo;

        }

    }

    public void getType() {
        System.out.println(name);
    }

    public void getStatus() {
        System.out.println("Type: " + name + ", Ammo: " + currentAmmo + ", Base Damage: " + baseDmg + ", All Damage: " + currentAmmo * baseDmg);
    }

    public boolean isPriority() {
        return true;
    }

    public int getDmg() {
        return this.dmg = this.maxAmmo * this.baseDmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }
}

