package next.developer.table;

import static next.developer.table.__init__.*;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class __read__col__name__ {
    public static List<Object> __read__col__name__(String Table_Name, Context context) {
        List<Object> returnValue = new ArrayList<>();
        String table = __file__read__.__file__read__(Table_Name, context);
        if (table == "false") {
            returnValue.add("'error' " + '[' + Table_Name + ']' + " table not found");
            return returnValue;
        } else {
            String value = "";
            String value2 = "";

            for (int x = 0; x <= table.length(); x++) {
                if (table.charAt(x) != cel__end__tag && table.charAt(x) != col__start__tag && table.charAt(x) != col__end__tag) {
                    value = value + table.charAt(x);
                } else if (table.charAt(x) == cel__end__tag) {
                    returnValue.add(value);
                    value = "";
                } else if (table.charAt(x) == col__end__tag) {
                    returnValue.add(value);
                    return returnValue;
                }

            }
        }
        return returnValue;
    }
}
