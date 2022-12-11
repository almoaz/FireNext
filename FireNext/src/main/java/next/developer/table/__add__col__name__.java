package next.developer.table;

import static next.developer.table.__init__.*;

import android.content.Context;

public class __add__col__name__ {
    public static String __add__col__name__(String Table_Name, String Column_Name, Context context) {
        String table = __file__read__.__file__read__(Table_Name, context);
        if (table.equals("false")) {
            return "'" + Table_Name + "' table not found";
        } else {
            if (table.length() == 0) {
                String value = "";
                for (int x = 0; x <= Column_Name.length(); x++) {
                    if (Column_Name.charAt(x) == '|') {
                        value = value + cel__end__tag;
                    } else {
                        value = value + Column_Name.charAt(x);

                    }
                    if (x == Column_Name.length() - 1) {
                        break;
                    }
                }
                System.out.println(value);
                value = col__start__tag + value + col__end__tag;
                __table__writer__.__table__writer__(Table_Name, value, context);
                return "true";


            } else {
                String queryPermit = "false";
                String duplicateCondition = "false";
                String duplicateColumnName = "";
                String value = "";
                String updateDB = "";

                for (int x = 0; x <= table.length(); x++) {
                    if (table.charAt(x) != col__end__tag && queryPermit.equals("false")) {
                        updateDB = updateDB + table.charAt(x);
                    }
                    if (table.charAt(x) != col__start__tag && table.charAt(x) != cel__end__tag && table.charAt(x) != col__end__tag && queryPermit == "false") {
                        value = value + table.charAt(x);
                    } else if (table.charAt(x) == cel__end__tag && queryPermit.equals("false")) {
                        String value1 = "";
                        for (int x1 = 0; x1 <= Column_Name.length(); x1++) {
                            if (Column_Name.charAt(x1) != '|') {
                                value1 = value1 + Column_Name.charAt(x1);
                            } else if (Column_Name.charAt(x1) == '|') {
                                if (value.equals(value1)) {
                                    duplicateCondition = "true";
                                    if (duplicateColumnName.equals("")) {
                                        duplicateColumnName = value1;
                                    } else {
                                        duplicateColumnName = duplicateColumnName + cel__end__tag + value1;
                                    }
                                    break;
                                } else {
                                    value1 = "";
                                }
                            }
                            if (x1 == Column_Name.length() - 1) {
                                if (value.equals(value1)) {
                                    duplicateCondition = "true";
                                    if (duplicateColumnName.equals("")) {
                                        duplicateColumnName = value1;
                                    } else {
                                        duplicateColumnName = duplicateColumnName + cel__end__tag + value1;
                                    }
                                    break;
                                }
                                break;

                            }
                        }
                        value = "";
                    } else if (table.charAt(x) == col__end__tag && queryPermit.equals("false")) {
                        String value1 = "";
                        for (int x1 = 0; x1 <= Column_Name.length(); x1++) {
                            if (Column_Name.charAt(x1) != '|') {
                                value1 = value1 + Column_Name.charAt(x1);
                            } else if (Column_Name.charAt(x1) == '|') {
                                if (value.equals(value1)) {
                                    duplicateCondition = "true";
                                    if (duplicateColumnName.equals("")) {
                                        duplicateColumnName = value1;
                                    } else {
                                        duplicateColumnName = duplicateColumnName + cel__end__tag + value1;
                                    }
                                    break;
                                } else {
                                    value1 = "";
                                }
                            }
                            if (x1 == Column_Name.length() - 1) {
                                if (value.equals(value1)) {
                                    duplicateCondition = "true";
                                    if (duplicateColumnName.equals("")) {
                                        duplicateColumnName = value1;
                                    } else {
                                        duplicateColumnName = duplicateColumnName + cel__end__tag + value1;
                                    }
                                    break;
                                }
                                break;
                            }
                        }
                    }
                    if (table.charAt(x) == col__end__tag && queryPermit.equals("false")) {
                        updateDB = updateDB + cel__end__tag + Column_Name + col__end__tag;
                        queryPermit = "true";
                    } else if (queryPermit.equals("true")) {
                        updateDB = updateDB + table.charAt(x);
                    }
                    if (x == table.length() - 1) {

                        if (duplicateCondition.equals("true")) {
                            return "'error' " + "[" + duplicateColumnName + "]" + " duplicate column name";
                        } else {
                            __table__writer__.__table__writer__(Table_Name, updateDB, context);
                            return "true";
                        }
                    }
                }
            }
        }
        return "true";
    }
}
