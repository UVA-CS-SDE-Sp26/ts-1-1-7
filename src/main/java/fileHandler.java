import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileHandler Logic for TopSecret
 * By Shahzaib Tariq (qgx9xe)
 * Latest Build: 02/05
 */

public class fileHandler {
    private String dataPath;
    private BufferedReader reader;
    private String output;

    public fileHandler(String path) {
        dataPath = path;
        try{
            this.loadFile();
        } catch (IOException e){
            System.out.println("File not found: Check Path?");
        }

    }


    public String path(){
        return dataPath;
    }

    public String fileOut(){
        return output;
    }

    public void loadFile() throws IOException {
        reader = new BufferedReader(new FileReader(dataPath));
        StringBuilder contentLoader = new StringBuilder();
        String line;
        while((line = reader.readLine()) != null){
            contentLoader.append(line + "\n");
        }
        if (contentLoader.length() > 0) {
            contentLoader.deleteCharAt(contentLoader.length() - 1);
        }

        output = contentLoader.toString();

    }


}
