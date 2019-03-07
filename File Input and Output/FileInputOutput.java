import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class FileInputOutput {      //(int wordIndex)

    public ArrayList <String> getAllWords(ArrayList <String> myWords) throws IOException
    {
        FileInputStream fileByteStream = null; // File input stream
        Scanner inFS = null;                   // Scanner object

        fileByteStream = new FileInputStream("myWords.txt");
        inFS = new Scanner(fileByteStream);

        while(inFS.hasNext() == true)
        {
            myWords.add(inFS.next());
        }

        return myWords;
    }
}
