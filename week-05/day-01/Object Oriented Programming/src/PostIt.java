public class PostIt {

    /*Create a PostIt class that has
            a backgroundColor
            a text on it
            a textColor
            Create a few example post-it objects:
    an orange with blue text: "Idea 1"
    a pink with black text: "Awesome"
    a yellow with green text: "Superb!"*/

  String backgroudColor;
  String textOnIt;
  String textColor;

    public PostIt() {

    }

    public void writeit(){
        System.out.println(backgroudColor+ " with "+textColor+" text: "+ "\""+textOnIt + "\"");

    }

    public static void main(String[] args) {
        PostIt Paper = new PostIt();
        Paper.textOnIt = "Idea 1";
        Paper.backgroudColor = "orange";
        Paper.textColor = "blue";

        Paper.writeit();

        PostIt Paper2 = new PostIt();
        Paper2.textOnIt = "Awesome";
        Paper2.backgroudColor = "pink";
        Paper2.textColor = "black";

        Paper2.writeit();

        PostIt Paper3 = new PostIt();
        Paper3.textOnIt = "Superb!";
        Paper3.backgroudColor = "yellow";
        Paper3.textColor = "green";

        Paper3.writeit();


    }
}

