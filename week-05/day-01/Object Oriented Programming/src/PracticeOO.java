public class PracticeOO {
    /* Általában az a főnév class, aminek van tulajdonsága és/vagy csinál valamit
     *
     * public class Dog
     * String Breed;
     * String color
     * String name
     * int age
     * Boolean hasOwner     -Ezek fileds-ek, property-ik. Globális változók, ezeket az egész classon belül használható.
     * A lokális változó felülírja mindig a globális változót.
     *
     * this.age   - "arra az objektumra utal, amiben benne vagynuk.
     *
     * Dog dog3 = new Dog("Ide lehet beírni vesszővel elválasztva és idézőjelek között"); - ehhez kell viszont egy constructor
     * Default constructor - üres a zárójelek között, megadja a alap értéket(null,0)
     *
     * Konstruktor : Public Dog (String name, String color, int age, String c){
     * this.name = name
     * this.breed = breed
     * this.age = age
     * color = c   -igy működik mert nem egyforma a neve a kettőnek , akkor kell a this használni ha ugyan az a változó neve.
     *
     * }
     * felül írja a Default konstruktort,
     * Default konstruktor:
     * Public Dog (){
     * }
     *
     *konstruktor : nincs visszatérési értéke, ugyan az kell hogy legyen a neve mint a classnak, ez a létrehozásnak a fajtái.
     *
     * Default értékek megadására. Legspecifikusabb konstruktor, ahol a letöbb bemenő dolog van.
     * this("mix", "Morzsi", "2") ; -ennek az osztálynak egy másik konstruktorát hívom meg. Így ez lesz a default értéke az összes
     * olyan osztálynak, ahol nem adnak értéket. ENNEK mindig az Első sorban kell lennie!!!
     *
     *
     * static int idCounter=0; - Nem egy kutya objektumre hanem mindenre vonatkozik az egész osztályra!!
     * this.id = idCounter++;  Így kapnak sorszámot pl a kutyák.
     *this.id = ++idCounter - Így nem 0 hanem 1 lesz az első kutya id-ja.
     *
     * Ami az összes kutyára vonatkozik az mind Static változó
     *
     * public final boolean  - Csak ez lehet az értéke, más nem. Ezt nem lehet felül írni.
     *
     *
     *
     * */


}
