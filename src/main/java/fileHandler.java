import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * FileHandler Logic for TopSecret
 * By Shahzaib Tariq (qgx9xe)
 * Latest Build: 02/05
 */

public class fileHandler {
    private String dataPath;
    private BufferedReader reader;
    private String output;
    private Scanner scan = new Scanner(System.in);

    public fileHandler(String path) {
        dataPath = path;
        try{
            reader = new BufferedReader(new FileReader(dataPath));
            this.loadFile();
        } catch (FileNotFoundException e){
            System.out.println("File not found: Check Path?");
        }

    }


    public String path(){
        return dataPath;
    }

    public String fileOut(){
        return output;
    }

    public void loadFile(){

    }


}
