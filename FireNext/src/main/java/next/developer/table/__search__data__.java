package next.developer.table;

import static next.developer.table.__init__.*;

import android.content.Context;

public class __search__data__ {
    public static String __search__data__(String Table_Name, String Search_Id, String Column_Name, Context context) {
        String table = __file__read__.__file__read__(Table_Name, context);
        if (table.equals("false")) {
            return "'error' " + '[' + Table_Name + ']' + " table not found";
        } else {
            int queryPosition = 0;
            String queryPermit = "false";
            String value = "";
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
                        return "'error' [" + Column_Name + "] column name not found";
                    }
                }
                if (table.charAt(x) == col__end__tag && queryPermit.equals("null")) {
                    queryPermit = "true";
                } else if (queryPermit.equals("true")) {
                    value = value + table.charAt(x);

                    if (table.charAt(x) == row__end__tag) {
                        String data = "";
                        int dataPosition = 0;

                        for (int x1 = 0; x1 <= value.length(); x1++) {
                            if (value.charAt(x1) != row__start__tag && value.charAt(x1) != cel__end__tag && value.charAt(x1) != row__end__tag) {
                                data = data + value.charAt(x1);

                            } else if (value.charAt(x1) == cel__end__tag) {
                                if (data.equals(Search_Id)) {
                                    data = "";
                                    for (int x2 = 0; x2 <= value.length(); x2++) {
                                        if (value.charAt(x2) != row__start__tag && value.charAt(x2) != cel__end__tag && value.charAt(x2) != row__end__tag) {
                                            data = data + value.charAt(x2);
                                        } else if (value.charAt(x2) == cel__end__tag) {
                                            dataPosition = dataPosition + 1;
                                            if (dataPosition == queryPosition) {
                                                return data;
                                            } else {
                                                data = "";
                                            }
                                        } else if (value.charAt(x2) == row__end__tag) {
                                            dataPosition = dataPosition + 1;
                                            if (dataPosition == queryPosition) {
                                                return data;
                                            } else {
                                                data = "";
                                            }
                                        }
                                        if (x2 == value.length() - 1) {
                                            break;
                                        }

                                    }
                                } else {
                                    data = "";
                                }

                            } else if (value.charAt(x1) == row__end__tag) {

                                if (data.equals(Search_Id)) {
                                    data = "";
                                    for (int x2 = 0; x2 <= value.length(); x2++) {
                                        if (value.charAt(x2) != row__start__tag && value.charAt(x2) != cel__end__tag && value.charAt(x2) != row__end__tag) {
                                            data = data + value.charAt(x2);
                                        } else if (value.charAt(x2) == cel__end__tag) {
                                            dataPosition = dataPosition + 1;
                                            if (dataPosition == queryPosition) {
                                                return data;
                                            } else {
                                                data = "";
                                            }

                                        } else if (value.charAt(x2) == row__end__tag) {
                                            dataPosition = dataPosition + 1;
                                            if (dataPosition == queryPosition) {
                                                return data;
                                            } else {
                                                data = "";
                                            }

                                        }
                                        if (x2 == value.length() - 1) {
                                            break;
                                        }

                                    }
                                }
                            }
                            if (x1 == value.length() - 1) {
                                break;
                            }


                        }
                        if (x == table.length() - 1) {
                            System.out.println(x);
                            return "'error' [Search id : " + Search_Id + "] not found";
                        }
                        value = "";
                    }

                }

            }
        }
        return "true";

    }
}
