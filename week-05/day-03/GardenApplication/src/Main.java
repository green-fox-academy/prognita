public class Main {

    public static void main(String[] args) {
        Flower flower1 = new Flower(0,"yellow Flower");
        Flower flower2 = new Flower(0,"blue Flower");
        Tree tree1 = new Tree(0,"purple Tree");
        Tree tree2 = new Tree(0,"orange Tree");
        Garden myGarden = new Garden();

        myGarden.addPlants(flower1);
        myGarden.addPlants(flower2);
        myGarden.addPlants(tree1);
        myGarden.addPlants(tree2);

       myGarden.getStatus();
       myGarden.waterIt(40);
       myGarden.waterIt(70);





    }


}
