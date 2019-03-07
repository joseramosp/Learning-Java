import java.util.*;
import java.lang.*;
import java.io.IOException;

public class StringScramble_JoseRamos
{
    String originalWord, scrambledWord;
    Scanner userInput = new Scanner(System.in);

    public String scramble(ArrayList <String> word , int arrayIndex) throws IOException
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

    public static void main(String agrs []) throws IOException
    {
        ArrayList <String> myWords = new ArrayList<String>();

        FileInputOutput wordInputObject = new FileInputOutput();
        StringScramble_JoseRamos testObject = new StringScramble_JoseRamos();

        myWords = wordInputObject.getAllWords(myWords);

        System.out.println("Guess the next word:");
        System.out.println(testObject.scramble(myWords, 0));
        System.out.println(testObject.scramble(myWords, 1));
        System.out.println(testObject.scramble(myWords, 2));

    }

}
