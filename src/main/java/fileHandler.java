import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileHandler Logic for TopSecret
 * By Shahzaib Tariq (qgx9xe)
 * Latest Build: 02/10
 */

public class fileHandler {
    //Instances
    private String dataPath;
    private BufferedReader reader;
    private String output;

    /**
     * Constructor
     * Set's path to input
     */
    public fileHandler(String path) {
        this.changePath(path);

    }

    /**
     * Return current dataPath
     */
    public String path(){
        return dataPath;
    }

    /**
     * Print file contents
     */
    public String fileOut(){
        return output;
    }

    /**
     * Change the path using input and load file form path
     */
    public void changePath(String path){
        dataPath = path;
        try{
            this.loadFile();
        } catch (IOException e){ //catch loadFile() exception
            System.out.println("File not found: Check Path?");
        }
    }

    /**
     * Private loader method.
     */
    private void loadFile() throws IOException {
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
