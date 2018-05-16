import java.util.ArrayList;

public class Garden {
    private ArrayList<Nature> plants = new ArrayList<>();


    public Garden() {

    }

    public ArrayList<Nature> getPlants() {
        return plants;
    }

    public void setPlants(ArrayList<Nature> plants) {
        this.plants = plants;
    }


    public void addPlants(Nature flower) {
        plants.add(flower);
    }


    public void getStatus() {
        for (Nature elements : plants) {
            elements.getStatus();
        }
    }


    public void waterIt(int water) {
        double number = 0;
        int counter = 0;

        System.out.println("Watering with:" + water);
        for (Nature elements : plants) {
            if (elements instanceof Flower && elements.needWater()) {
                counter++;
            } else if (elements instanceof Tree && elements.needWater()) {
                counter++;
            }
        }

        if (counter != 0) {
            number = water / counter;
        }


        for (Nature elements : plants) {
            if (elements.needWater()) {
                if (elements instanceof Flower) {
                    elements.setCurrentWater(number * (0.75));
                } else if (elements instanceof Tree) {
                    elements.setCurrentWater(number * (0.4));
                }
            }
            elements.getStatus();
        }
    }
}

