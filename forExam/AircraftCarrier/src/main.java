public class main {
    public static void main(String[] args) throws Exception {
        F35 f35 = new F35("F35", 12,50);
        F16 f16 = new F16("F16", 8, 30);
        Carrier mycarrier = new Carrier(55,20,500);
        Carrier notMyCarrier = new Carrier(30,20,900);
        f16.fight();
        f35.fight();


        mycarrier.addAircraft(f16);
        mycarrier.addAircraft(f35);
        mycarrier.fill();
        System.out.println(f16.getCurrentAmmo());
        System.out.println(f35.getCurrentAmmo());

        mycarrier.fight(notMyCarrier);
        mycarrier.setInitialAmmo(50);
        mycarrier.fill();
        System.out.println(notMyCarrier.getHealth());
        mycarrier.getStatus();
        notMyCarrier.getStatus();
    }
}
