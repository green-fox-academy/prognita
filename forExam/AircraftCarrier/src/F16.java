public class F16 extends Aircraft {
    public F16() {

    }

    public F16(String name, int maxAmmo, int baseDmg) {
        super(name,maxAmmo,baseDmg);


    }



    public boolean isPriority() {
        return false;
    }
}

