package next.developer.doc;

public class __init__ {
    static char start__tag = '[';
    static char end__tag = ']';
    static String line__tag = "---";
    static char child__end__tag = ',';
    static char devided__tag = '|';
    static char value__child__tag = ':';

    static String repeat(int spaceLength)
    {
        String value = " ";
        for (int x =0; x<= spaceLength; x++)
        {
            value = value+" ";
            if (x == spaceLength-1)
            {
                break;
            }
        }
        return value;
    }
}


