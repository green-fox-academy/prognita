public abstract class Nature {
    protected double currentWater;
    protected String name;
    protected double treeWater = 10;
    protected double flowerWater = 5;

    public Nature() {

    }

    public Nature(double currentWater, String name) {
        this.currentWater = currentWater;
        this.name = name;
    }

    public double getCurrentWater() {
        return currentWater;
    }

    public void setCurrentWater(double currentWater) {
        this.currentWater = currentWater;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getStatus() {
        if (currentWater < flowerWater ||currentWater < treeWater ) {
            System.out.println("The " + this.getName() + " needs water");
        }else {
            System.out.println("The " + this.getName() + " doesnt need water");
        }
    }
    public boolean needWater() {
        boolean waterme;
        if (currentWater < flowerWater ) {
            waterme = true;
        } else waterme = false;
        return waterme;
    }


}
