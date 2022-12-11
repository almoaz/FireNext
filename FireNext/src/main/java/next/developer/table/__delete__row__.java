package next.developer.table;

import static next.developer.table.__init__.*;

import android.content.Context;

public class __delete__row__ {
    public static String __delete__row__(String Table_Name, String Search_Id, Context context) {
        String table = __file__read__.__file__read__(Table_Name, context);
        if (table.equals("false")) {
            return "'error' " + '[' + Table_Name + ']' + " table not found";
        } else {
            String queryPermit = "false";
            String updateData = "false";
            String value = "";
            String updateDB = "";
            for (int x = 0; x <= table.length(); x++) {
                if (queryPermit.equals("false") || queryPermit.equals("null")) {
                    updateDB = updateDB + table.charAt(x);
                }
                if (table.charAt(x) == col__end__tag && queryPermit.equals("false")) {
                    queryPermit = "true";
                } else if (queryPermit.equals("true")) {
                    value = value + table.charAt(x);
                    if (table.charAt(x) == row__end__tag) {
                        String data = "";
                        for (int x1 = 0; x1 <= value.length(); x1++) {
                            if (value.charAt(x1) != row__start__tag && value.charAt(x1) != cel__end__tag && value.charAt(x1) != row__end__tag) {
                                data = data + value.charAt(x1);

                            } else if (value.charAt(x1) == cel__end__tag) {
                                if (data.equals(Search_Id)) {
                                    updateData = "true";
                                    break;
                                } else {
                                    data = "";
                                }
                            } else if (value.charAt(x1) == row__end__tag) {
                                if (data.equals(Search_Id)) {
                                    updateData = "true";
                                    break;
                                } else {
                                    data = "";
                                }
                            }
                            if (x1 == value.length() - 1) {
                                updateDB = updateDB + value;
                                break;
                            }
                        }
                        value = "";
                    }
                }
                if (x == table.length() - 1 && updateData.equals("false")) {
                    return "'error' [Search Id : " + Search_Id + "] not found";
                } else if (x == table.length() - 1) {
                    System.out.println(updateDB);
                    __table__writer__.__table__writer__(Table_Name, updateDB, context);
                    return "true";
                }
            }
        }
        return "true";
    }
}
