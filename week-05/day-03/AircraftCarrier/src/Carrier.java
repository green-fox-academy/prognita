import java.util.ArrayList;

public class Carrier {
    private ArrayList<Aircraft> aircrafts = new ArrayList<>();
    private int storeOfAmmo;
    private int initialAmmo;
    private int health;
    protected int allCarrierDmg;


    public Carrier() {

    }

    public Carrier(int storeOfAmmo, int initialAmmo, int health) {
        this.storeOfAmmo = storeOfAmmo;
        this.initialAmmo = initialAmmo;
        this.health = health;

    }


    public ArrayList<Aircraft> getAircraft() {
        return aircrafts;
    }

    public void setAircraft(ArrayList<Aircraft> aircraft) {
        this.aircrafts = aircraft;
    }

    public int getStoreOfAmmo() {
        return storeOfAmmo;
    }

    public void setStoreOfAmmo(int storeOfAmmo) {
        this.storeOfAmmo = storeOfAmmo;
    }

    public int getInitialAmmo() {
        return initialAmmo;
    }

    public void setInitialAmmo(int initialAmmo) {
        this.initialAmmo = initialAmmo;
    }

    public int getHealth() {

        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void addAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    public void fill() throws Exception {
        for (Aircraft repcsi : aircrafts) {
            if (initialAmmo == 0) throw new Exception("There is no ammo!");
            else if (initialAmmo != 0 && initialAmmo <= 12) {
                if (repcsi instanceof F35 && ((F35) repcsi).isPriority()) {
                    initialAmmo = repcsi.refill(initialAmmo);
                } else if (((F16) repcsi).isPriority()) {
                    initialAmmo = repcsi.refill(initialAmmo);
                }
            } else if (initialAmmo > 12) {
                initialAmmo = repcsi.refill(initialAmmo);
            }
        }
        System.out.println("Your initial ammo:" + initialAmmo);

    }


    public void fight(Carrier carrier) {
        for (Aircraft repcsi : aircrafts) {
            carrier.setHealth((carrier.getHealth() - repcsi.getDmg()) > 0 ? (carrier.getHealth() - repcsi.getDmg()) : 0);
            repcsi.setCurrentAmmo(0);
            System.out.println(repcsi.getName() + " is dealt " + repcsi.getDmg() + " damage to the enemy Carrier");
            allCarrierDmg += repcsi.getDmg();
            if (carrier.getHealth() <= 0) {
                System.out.println("It's dead Jim :(");
            }

        }
    }

    public void getStatus() {
        if (health <= 0) {
            System.out.println("It's dead Jim :(");
        } else {
            System.out.println("HP: " + health + " , Aircraft count: " + aircrafts.size() + " , Ammo Storage: " + storeOfAmmo + " , Total damage:" + allCarrierDmg);
            System.out.println("Aircrafts: ");
            for (Aircraft repcsi : aircrafts) {
                repcsi.getStatus();
            }
        }
    }
}






/* tolteny = repcsi.getMaxAmmo() - repcsi.getCurrentAmmo();
            sumOfAmmo = Integer.sum(repcsi.getMaxAmmo(), repcsi.getMaxAmmo());
            while (initialAmmo > 0) {
                if (initialAmmo < sumOfAmmo) {
                    if () {
                        repcsi.refill(tolteny);
                        initialAmmo -= tolteny;
                        repcsi.refill(initialAmmo);
                    }else break;
                } else {
                    repcsi.refill(tolteny);
                    initialAmmo -= tolteny;
                }*/