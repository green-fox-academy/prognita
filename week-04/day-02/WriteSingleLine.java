import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.List;

public class WriteSingleLine {
    // Open a file called "my-file.txt"
    // Write your name in it as a single line
    // If the program is unable to write the file,
// then it should print an error message like: "Unable to write file: my-file.txt"

    public static void main(String[] args) {

        List<String> content = new ArrayList();
        content.add("First line of my file");
        try { // Required by Files.write(filePath, content)
            // Creates a new file if not exists and overwrites it's content
            // The elements of the content lists will become the lines of the file
            Path filePath = Paths.get("assets/new-file.txt");
            Files.write(filePath, content);
        } catch (Exception e) {
            System.out.println("Uh-oh, could not write the file!");
        }
    }
}
