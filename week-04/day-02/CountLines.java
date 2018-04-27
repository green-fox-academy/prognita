import java.io.*;


public class CountLines {

    // Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
    public static void main(String[] args) throws FileNotFoundException {
       numberOfLine("src/Cica.txt");

        }

        public static int numberOfLine (String filename){
            try {
                File file = new File(filename);
                FileReader fr = new FileReader(file);
                LineNumberReader Inr = new LineNumberReader(fr);
                int number = 0;
                while (Inr.readLine() != null) {
                    number++;
                }
                System.out.println("The file consist " + number + " lines");
            } catch (IOException e) {
                System.out.println("0");
            }return (0);
        }




}




