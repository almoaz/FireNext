package next.developer.table;

import static next.developer.table.__init__.*;

import android.content.Context;

public class __read__table__ {
    public static String __read__table__(String Table_Name, Context context) {
        String value = "";
        String value2 = "";
        String table_data = "";
        String table = __file__read__.__file__read__(Table_Name, context);
        if (table.equals("false")) {
            return "'error' " + '[' + Table_Name + ']' + " table not found";
        }
        if (table.length() > 0) {

            int Cell_Size = 0;
            for (int x = 0; x <= table.length(); x++) {
                if (table.charAt(x) != cel__end__tag && table.charAt(x) != col__start__tag && table.charAt(x) != col__end__tag && table.charAt(x) != row__start__tag && table.charAt(x) != row__end__tag) {
                    value = value + table.charAt(x);
                } else if (table.charAt(x) == cel__end__tag) {
                    if (value.length() > Cell_Size) {
                        Cell_Size = value.length();
                        value = "";
                    }

                } else if (table.charAt(x) == col__end__tag || table.charAt(x) == row__end__tag) {
                    if (value.length() > Cell_Size) {
                        Cell_Size = value.length();
                    }
                    value = "";
                }
                if (x == table.length() - 1) {
                    break;
                }
            }
            for (int x1 = 0; x1 <= table.length(); x1++) {
                if (table.charAt(x1) != cel__end__tag && table.charAt(x1) != col__start__tag && table.charAt(x1) != col__end__tag && table.charAt(x1) != row__start__tag && table.charAt(x1) != row__end__tag) {
                    value = value + table.charAt(x1);
                } else if (table.charAt(x1) == col__start__tag && !value2.equals("") || table.charAt(x1) == row__start__tag && !value2.equals("")) {
                    table_data = table_data + value2 + "\n";
                    table_data = table_data + repeat(value2.length(), "-") + "\n";
                    value2 = "";
                } else if (table.charAt(x1) == cel__end__tag) {

                    int value1 = Cell_Size - value.length();
                    value2 = value2 + value + repeat(value1 + 3, " ");
                    value = "";
                } else if (table.charAt(x1) == col__end__tag || table.charAt(x1) == row__end__tag) {

                    int value1 = Cell_Size - value.length();
                    value2 = value2 + value + repeat(value1 + 3, " ");
                    value = "";
                }
                if (x1 == table.length() - 1) {
                    table_data = table_data + value2 + "\n";
                    return table_data;
                }


            }
        }
        return table_data;
    }
}
