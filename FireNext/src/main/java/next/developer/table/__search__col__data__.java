package next.developer.table;

import static next.developer.table.__init__.*;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class __search__col__data__ {
    public static List<Object> __search__col__data__(String Table_Name, String Column_Name, Context context) {
        String value = "";
        List<Object> returnValue = new ArrayList<>();
        String table = __file__read__.__file__read__(Table_Name, context);
        if (table.equals("false")) {
            returnValue.add("error");
            return returnValue;
        } else {
            int queryPosition = 0;
            int Cell_Size = 0;
            String queryPermit = "false";


            for (int x = 0; x <= table.length(); x++) {
                if (table.charAt(x) != col__start__tag && table.charAt(x) != cel__end__tag && table.charAt(x) != col__end__tag && queryPermit.equals("false")) {
                    value = value + table.charAt(x);
                } else if (table.charAt(x) == cel__end__tag && queryPermit.equals("false")) {
                    if (value.equals(Column_Name)) {
                        queryPosition = queryPosition + 1;
                        queryPermit = "null";
                        value = "";
                    } else {
                        queryPosition = queryPosition + 1;
                        value = "";
                    }

                } else if (table.charAt(x) == col__end__tag && queryPermit.equals("false")) {
                    if (value.equals(Column_Name)) {
                        queryPosition = queryPosition + 1;
                        queryPermit = "null";
                        value = "";
                    } else {
                        returnValue.add("error");
                        return returnValue;
                    }

                }
                if (table.charAt(x) == col__end__tag && queryPermit.equals("null")) {
                    queryPermit = "true";
                } else if (queryPermit.equals("true")) {
                    value = value + table.charAt(x);

                    if (table.charAt(x) == row__end__tag) {
                        if (Cell_Size == 0) {
                            int dataPosition = 0;
                            String value2 = "";

                            for (int x1 = 0; x1 <= table.length(); x1++) {
                                if (table.charAt(x1) != cel__end__tag && table.charAt(x1) != col__start__tag && table.charAt(x1) != col__end__tag && table.charAt(x1) != row__start__tag && table.charAt(x1) != row__end__tag) {
                                    value2 = value2 + table.charAt(x1);
                                } else if (table.charAt(x1) == cel__end__tag) {
                                    dataPosition = dataPosition + 1;
                                    if (dataPosition == queryPosition) {
                                        if (value2.length() > Cell_Size) {
                                            Cell_Size = value2.length();
                                        }
                                    }
                                    value2 = "";
                                } else if (table.charAt(x1) == col__end__tag || table.charAt(x1) == row__end__tag) {
                                    dataPosition = dataPosition + 1;
                                    if (dataPosition == queryPosition) {
                                        if (value2.length() > Cell_Size) {
                                            Cell_Size = value2.length();
                                        }
                                    }
                                    value2 = "";
                                    dataPosition = 0;
                                }
                                if (x1 == table.length() - 1) {
                                    break;
                                }
                            }
                        }
                        int dataPosition = 0;
                        String data = "";

                        for (int x1 = 0; x1 <= value.length(); x1++) {
                            if (value.charAt(x1) != row__start__tag && value.charAt(x1) != cel__end__tag && value.charAt(x1) != row__end__tag) {
                                data = data + value.charAt(x1);
                            } else if (value.charAt(x1) == cel__end__tag) {
                                dataPosition = dataPosition + 1;
                                if (dataPosition == queryPosition) {
                                    if (returnValue.isEmpty()) {
                                        returnValue.add(data);

                                    } else {
                                        returnValue.add(data);
                                    }
                                    break;
                                } else {
                                    data = "";
                                }
                            } else if (value.charAt(x1) == row__end__tag) {
                                dataPosition = dataPosition + 1;
                                if (dataPosition == queryPosition) {
                                    if (returnValue.isEmpty()) {
                                        returnValue.add(data);

                                    } else {
                                        returnValue.add(data);
                                    }
                                    break;
                                } else {
                                    data = "";
                                }
                            }
                            if (x1 == value.length() - 1) {
                                break;
                            }
                        }
                        value = "";

                    }
                }
                if (x == table.length() - 1) {

                    return returnValue;
                }


            }
        }
        returnValue.add("false");
        return returnValue;
    }
}