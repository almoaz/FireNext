package next.developer.table;

import static next.developer.table.__init__.*;

import android.content.Context;

public class __search__row__data__ {
    public static String __search__row__data__(String Table_Name, String Search_Id, Context context) {
        String table = __file__read__.__file__read__(Table_Name, context);
        if (table.equals("false")) {
            return "'error' " + '[' + Table_Name + ']' + " table not found";
        } else {
            String queryPermit = "false";
            String value = "";
            String col_name = "";
            for (int x = 0; x <= table.length(); x++) {
                if (queryPermit.equals("false")) {
                    col_name = col_name + table.charAt(x);
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
                                    int Cell_Size = 0;
                                    String value2 = "";

                                    for (int x2 = 0; x2 <= value.length(); x2++) {
                                        if (value.charAt(x2) != cel__end__tag && value.charAt(x2) != row__start__tag && value.charAt(x2) != row__end__tag) {
                                            value2 = value2 + value.charAt(x2);
                                        } else if (value.charAt(x2) == cel__end__tag) {
                                            if (value2.length() > Cell_Size) {
                                                Cell_Size = value2.length();
                                                value2 = "";
                                            }

                                        } else if (value.charAt(x2) == row__end__tag) {
                                            if (value2.length() > Cell_Size) {
                                                Cell_Size = value2.length();
                                                value2 = "";
                                            }

                                        }
                                        if (x2 == value.length() - 1) {
                                            break;
                                        }


                                    }
                                    col_name = col_name + value;
                                    value = "";
                                    value2 = "";

                                    for (int x2 = 0; x2 <= col_name.length(); x2++) {
                                        if (col_name.charAt(x2) != cel__end__tag && col_name.charAt(x2) != col__start__tag && col_name.charAt(x2) != col__end__tag && col_name.charAt(x2) != row__start__tag && col_name.charAt(x2) != row__end__tag) {
                                            value = value + col_name.charAt(x2);
                                        } else if (col_name.charAt(x2) == row__start__tag && !value2.equals("")) {
                                            System.out.println(value2);
                                            int value1 = value2.length() - value.length();
                                            System.out.println(value + repeat(value1 + 3, "-"));
                                            value2 = "";
                                        } else if (col_name.charAt(x2) == cel__end__tag) {
                                            int value1 = Cell_Size - value.length();
                                            value = value + repeat(value1 + 3, " ");
                                            //value = value.ljust(Cell_Size + 3, " ");
                                            value2 = value2 + value;
                                            value = "";
                                        } else if (col_name.charAt(x2) == col__end__tag || col_name.charAt(x2) == row__end__tag) {
                                            int value1 = Cell_Size - value.length();
                                            value = value + repeat(value1 + 3, " ");
                                            value2 = value2 + value;
                                            value = "";
                                        }
                                        if (x2 == col_name.length() - 1) {
                                            return value2;
                                        }

                                    }
                                    break;
                                } else {
                                    data = "";
                                }


                            } else if (value.charAt(x1) == row__end__tag) {
                                if (data.equals(Search_Id)) {
                                    int Cell_Size = 0;
                                    String value2 = "";
                                    for (int x2 = 0; x2 <= value.length(); x2++) {
                                        if (value.charAt(x2) != cel__end__tag && value.charAt(x2) != row__start__tag && value.charAt(x2) != row__end__tag) {
                                            value2 = value2 + value.charAt(x2);
                                        } else if (value.charAt(x2) == cel__end__tag) {
                                            if (value2.length() > Cell_Size) {
                                                Cell_Size = value2.length();
                                                value2 = "";
                                            }
                                        } else if (value.charAt(x2) == row__end__tag) {
                                            if (value2.length() > Cell_Size) {
                                                Cell_Size = value2.length();
                                                value2 = "";
                                            }
                                        }
                                        if (x2 == value.length() - 1) {
                                            break;
                                        }
                                    }
                                    col_name = col_name + value;
                                    value = "";
                                    value2 = "";

                                    for (int x2 = 0; x2 <= col_name.length(); x2++) {
                                        if (col_name.charAt(x2) != cel__end__tag && col_name.charAt(x2) != col__start__tag && col_name.charAt(x2) != col__end__tag && col_name.charAt(x2) != row__start__tag && col_name.charAt(x2) != row__end__tag) {
                                            value = value + col_name.charAt(x2);
                                        } else if (col_name.charAt(x2) == row__start__tag && !value2.equals("")) {
                                            System.out.println(value2);
                                            int value1 = value2.length() - value.length();
                                            System.out.println(value + repeat(value1 + 3, "-"));
                                            value2 = "";
                                        } else if (col_name.charAt(x2) == cel__end__tag) {
                                            int value1 = Cell_Size - value.length();
                                            value = value + repeat(value1 + 3, " ");
                                            value2 = value2 + value;
                                            value = "";
                                        } else if (col_name.charAt(x2) == col__end__tag || col_name.charAt(x2) == row__end__tag) {
                                            int value1 = Cell_Size - value.length();
                                            value = value + repeat(value1 + 3, " ");
                                            value2 = value2 + value;
                                            value = "";
                                        }
                                        if (x2 == col_name.length() - 1) {
                                            return value2;
                                        }
                                    }
                                    break;
                                }
                            }
                            if (x1 == value.length() - 1) {
                                break;
                            }
                        }
                        if (x == table.length() - 1) {
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
