import java.util.*;
import java.lang.*;

public class StringScramble_JoseRamos
{

    String originalWord, scrambledWord;
    Scanner userInput = new Scanner(System.in);

    public String scramble()
    {
        System.out.println("Enter a word to scramble");
        originalWord = userInput.next();
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

        StringScramble_JoseRamos testObject = new StringScramble_JoseRamos();

        System.out.println(testObject.scramble());

    }

}
