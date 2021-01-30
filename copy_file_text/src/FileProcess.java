import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileProcess {
    public static void main(String[] args) {
        String data = ReadFile("filename.txt");
        WriteToFile("filename2.txt",data);

    }
    public static String ReadFile(String path) {
        StringBuilder data = new StringBuilder();
        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                 data.append(myReader.nextLine());

            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file");
        }
        System.out.println();
        return data.toString();
    }
    public static void WriteToFile(String pathFile,String data) {
        try {
            FileWriter myWriter = new FileWriter(pathFile);
            myWriter.write(data);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
