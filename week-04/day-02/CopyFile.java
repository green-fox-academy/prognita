import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
    public static void main(String[] args) {

        boolean copy = copyfile("my-text.txt","your-text.txt");
        System.out.println(copy);

    }

    public static boolean copyfile (String fileFrom, String fileTo){
        Path filePath = Paths.get(fileFrom);
        Path fileCopy = Paths.get(fileTo);

        boolean success = true;
        try {
            Files.copy(filePath, fileCopy);
            success = true;
        }catch (Exception e) {
            success= false;
        }
        return success;
    }
}
