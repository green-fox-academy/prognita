

public class BlogPost {

    String authorName;
    String title;
    String text;
    String publicationDate;


    public BlogPost() {

    }

    public void Post() {

        System.out.println(title + " tilte by " + authorName + " posted at " + "\"" + publicationDate + "\"");
        System.out.println(text);
        System.out.println("");
    }

    public static void main(String[] args) {
        BlogPost Blog1 = new BlogPost();
        BlogPost Blog2 = new BlogPost();
        BlogPost Blog3 = new BlogPost();

        Blog1.title = "Lorem Ipsum";
        Blog2.title = "Wait but why";
        Blog3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";

        Blog1.authorName = "John Doe";
        Blog2.authorName = "Tim Urban";
        Blog3.authorName = "William Turton";

        Blog1.publicationDate = "2000.05.04.";
        Blog2.publicationDate = "2010.10.10.";
        Blog3.publicationDate = "2017.03.28.";

        Blog1.text = "Lorem ipsum dolor sit amet.";
        Blog2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        Blog3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices," +
                " he told me that he wasn’t really into the whole organizer profile thing.";


        Blog1.Post();
        Blog2.Post();
        Blog3.Post();

    }
}
