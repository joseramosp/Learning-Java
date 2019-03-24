import java.util.*;
import java.lang.*;
import java.io.IOException;

public class StringScramble_JoseRamos
{
    String originalWord, scrambledWord, userWord;
    Scanner userInput = new Scanner(System.in);

    public String scarmbleWord(ArrayList <String> word , int arrayIndex) throws IOException
    {

        originalWord = word.get(arrayIndex);
        char tempHold [] = new char[originalWord.length()];

        ArrayList <Integer> letterIndex;
        letterIndex = new ArrayList<Integer>(originalWord.length());

        for(int i = 0; i < originalWord.length(); i++)
        {
            letterIndex.add(i);
        }

        for(int i = 0; i < originalWord.length(); i++)
        {
            tempHold[i] = originalWord.charAt(letterIndex.remove((int)((Math.random()*letterIndex.size()))));
        }

        scrambledWord = new String(tempHold);

        return scrambledWord;
    }

    void playGame()
    {
        // userWord = userInput.next();
        //
        // while(i<3)
        // {
        //
        //     i++;
        // }
    }

    public static void main(String agrs []) throws IOException
    {
        ArrayList <String> myWords = new ArrayList<String>();

        FileInputOutput wordInputObject = new FileInputOutput();
        StringScramble_JoseRamos testObject = new StringScramble_JoseRamos();

        myWords = wordInputObject.readWordsFromFile(myWords);

        System.out.print("Guess the next word: ");
        System.out.println(testObject.scarmbleWord(myWords, 0) + "\n");
        System.out.println(myWords + "\n");


    }

}
