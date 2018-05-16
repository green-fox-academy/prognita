public class Flower extends Nature {
    public Flower() {

    }

    public Flower(double currentWater, String name) {
        super(currentWater, name);
    }

    public boolean needWater() {
        boolean waterme;
        if (currentWater < flowerWater) {
            waterme = true;
        } else waterme = false;
        return waterme;
    }

    public void getStatus() {
        if (needWater()) {
            System.out.println("The " + this.getName() + " needs water");
        } else {
            System.out.println("The " + this.getName() + " doesnt need water");
        }
    }
}
