package next.developer.table;

public class __init__ {
    static char col__start__tag = '[';
    static char col__end__tag = ']';
    static char row__start__tag = '(';
    static char row__end__tag = ')';
    static char cel__end__tag = ',';

    static char start__tag = '[';
    static char end__tag = ']';
    static String line__tag = "---";
    static char child__end__tag = ',';
    static char devided__tag = '|';
    static char value__child__tag = ':';


    static String repeat(int spaceLength, String repeat)
    {
        String value = " ";
        for (int x =0; x<= spaceLength; x++)
        {
            value = value+repeat;
            if (x == spaceLength-1)
            {
                break;
            }
        }
        return value;
    }

}


