package next.developer.table;

import static next.developer.table.__init__.*;

import android.content.Context;

public class __update__col__name__ {
    public static String __update__col__name__(String Table_Name, String Column_Name, String Update_Column_Name, Context context) {
        int queryPosition = 0;
        String queryPermit = "false";
        String value = "";
        String updateDB = "";
        String table = __file__read__.__file__read__(Table_Name, context);
        if (table.equals("false")) {
            return "'error' " + '[' + Table_Name + ']' + " table not found";
        } else {
            for (int x = 0; x <= table.length(); x++) {
                if (table.charAt(x) != col__start__tag && table.charAt(x) != cel__end__tag && table.charAt(x) != col__end__tag && queryPermit.equals("false")) {
                    value = value + table.charAt(x);
                } else if (table.charAt(x) == cel__end__tag && queryPermit.equals("false")) {

                    if (value.equals(Update_Column_Name)) {
                        return "'error' " + "[" + value + "]" + " duplicate column name";
                    } else {
                        value = "";
                    }
                } else if (table.charAt(x) == col__end__tag && queryPermit.equals("false")) {
                    if (value.equals(Update_Column_Name)) {
                        return "'error' " + "[" + value + "]" + " duplicate column name";
                    } else {
                        value = "";
                        break;
                    }

                }
                if (x == table.length() - 1) {
                    break;
                }
            }
            for (int x = 0; x <= table.length(); x++) {
                if (queryPermit.equals("false") && table.charAt(x) == col__start__tag || queryPermit.equals("null") && table.charAt(x) == col__start__tag) {
                    updateDB = updateDB + table.charAt(x);
                }
                if (queryPermit.equals("null") && table.charAt(x) != col__end__tag) {
                    updateDB = updateDB + table.charAt(x);
                }
                if (table.charAt(x) != col__start__tag && table.charAt(x) != cel__end__tag && table.charAt(x) != col__end__tag && queryPermit.equals("false")) {
                    value = value + table.charAt(x);
                } else if (table.charAt(x) == cel__end__tag && queryPermit.equals("false")) {
                    if (value.equals(Column_Name)) {
                        queryPosition = queryPosition + 1;
                        updateDB = updateDB + Update_Column_Name + cel__end__tag;
                        queryPermit = "null";
                        value = "";
                    } else {
                        queryPosition = queryPosition + 1;
                        updateDB = updateDB + value + cel__end__tag;
                        value = "";
                    }

                } else if (table.charAt(x) == col__end__tag && queryPermit.equals("false")) {
                    if (value.equals(Column_Name)) {
                        queryPosition = queryPosition + 1;
                        updateDB = updateDB + Update_Column_Name;
                        queryPermit = "null";
                        value = "";
                    } else {
                        return "'error' " + "[" + Column_Name + "]" + " Column name not found";
                    }


                }
                if (table.charAt(x) == col__end__tag && queryPermit.equals("null")) {
                    updateDB = updateDB + value + col__end__tag;
                    queryPermit = "true";
                } else if (queryPermit.equals("true")) {
                    updateDB = updateDB + table.charAt(x);

                }
                if (x == table.length() - 1) {
                    __table__writer__.__table__writer__(Table_Name, updateDB, context);
                    return "true";
                }


            }
        }
        return "true";
    }
}
