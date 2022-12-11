package next.developer.table;

import static next.developer.table.__init__.*;

import android.content.Context;

public class __add__data__ {
    public static String __add__data__(String Table_Name, String Data, Context context) {
        String table = __file__read__.__file__read__(Table_Name, context);
        if (table.equals("false")) {
            return "'error' " + '[' + Table_Name + ']' + " table not found";
        }
        if (table.length() < 4) {
            return "'error' column name not found\nbefore add data we need to add column name";
        } else {
            String value = "";
            for (int x = 0; x <= Data.length(); x++) {
                if (Data.charAt(x) == '|') {
                    value = value + cel__end__tag;
                } else {
                    value = value + Data.charAt(x);
                }
                if (x == Data.length() - 1) {
                    break;
                }

            }
            __table__append__.__table__append__(Table_Name, row__start__tag + value + row__end__tag, context);
            return "true";
        }

    }
}
