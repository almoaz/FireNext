package next.developer.doc;

import static next.developer.doc.__init__.*;

import android.content.Context;

import java.io.File;
import java.util.ArrayList;

public class __self__query__ {
    public static ArrayList __self__query__(String self, Context context) {
        String value = "";
        String databaseName = "";
        String parentDatabaseName = "";

        for (int x = 0; x <= self.length(); x++) {
            if ('>' != self.charAt(x)) {
                value = value + self.charAt(x);
            }
            if ('>' == self.charAt(x)) {
                if (databaseName.equals("")) {
                    File file = new File(context.getFilesDir(), value + ".ndb");
                    if (file.exists()) {
                        databaseName = value;
                        value = "";
                    } else {
                        return null;
                    }
                } else {
                    String childData = __file__read__.__file__read__(databaseName, context);
                    if (childData.equals("")) {
                        return null;
                    } else {
                        String readChild = "";
                        String updateNDB = "";

                        for (int x1 = 0; x1 <= childData.length(); x1++) {
                            if (childData.charAt(x1) != end__tag) {
                                updateNDB = updateNDB + childData.charAt(x1);
                            }
                            if (childData.charAt(x1) != start__tag && childData.charAt(x1) != child__end__tag && childData.charAt(x1) != end__tag) {
                                readChild = readChild + childData.charAt(x1);
                            }
                            if (childData.charAt(x1) == child__end__tag) {
                                if (readChild.equals(value)) {
                                    File file = new File(context.getFilesDir(), value + ".ndb");
                                    if (file.exists()) {
                                        if (parentDatabaseName.equals("")) {
                                            parentDatabaseName = databaseName;
                                        } else {
                                            parentDatabaseName = parentDatabaseName + ">" + databaseName;
                                        }
                                        databaseName = value;
                                        value = "";
                                        break;
                                    } else {
                                        return null;
                                    }

                                }
                                readChild = "";
                            }
                            if (childData.charAt(x1) == end__tag && x1 == childData.length() - 1) {
                                if (readChild.equals(value)) {
                                    File file = new File(context.getFilesDir(), value + ".ndb");
                                    if (file.exists()) {
                                        if (parentDatabaseName.equals("")) {
                                            parentDatabaseName = databaseName;
                                        } else {
                                            parentDatabaseName = parentDatabaseName + ">" + databaseName;
                                        }
                                        databaseName = value;
                                        value = "";
                                    } else {
                                        return null;
                                    }

                                } else {
                                    return null;
                                }


                            }
                            if (x1 == childData.length() - 1) {
                                break;
                            }

                        }
                    }
                    value = "";

                }


            }
            if (x == self.length() - 1) {
                File file = new File(context.getFilesDir(), databaseName + ".ndb");
                if (!file.exists()) {

                    return null;
                }

                String childData = __file__read__.__file__read__(databaseName, context);

                if (childData.equals("")) {
                    return null;
                } else {
                    String readChild = "";
                    String updateNDB = "";
                    String childMatch = "true";
                    ArrayList query_child_name = new ArrayList();

                    for (int x2 = 0; x2 <= childData.length(); x2++) {
                        if (childData.charAt(x2) != start__tag && childData.charAt(x2) != child__end__tag && childData.charAt(x2) != end__tag) {
                            readChild = readChild + childData.charAt(x2);
                        }
                        if (childData.charAt(x2) == child__end__tag) {

                            if (childMatch.equals("true")) {
                                String check = __self__child__.__self__child__(databaseName + ">" + readChild + ">" + value, context);

                                if (check.equals("true")) {
                                    query_child_name.add(readChild);

                                }
                            }
                            readChild = "";
                            childMatch = "true";

                        }
                        if (childData.charAt(x2) == value__child__tag) {
                            childMatch = "false";

                        } else if (childMatch.equals("true")) {
                            updateNDB = updateNDB + childData.charAt(x2);
                        }
                        if (x2 == childData.length() - 1) {

                            if (childMatch.equals("true")) {

                                String check = __self__child__.__self__child__(databaseName + ">" + readChild + ">" + value, context);
                                if (check.equals("true")) {
                                    query_child_name.add(readChild);
                                    return query_child_name;

                                }
                            } else {
                                if (String.valueOf(query_child_name).equals("")) {
                                    return null;
                                } else {
                                    return query_child_name;
                                }


                            }
                            break;
                        }


                    }
                }
                break;
            }

        }
        return null;
    }
}
