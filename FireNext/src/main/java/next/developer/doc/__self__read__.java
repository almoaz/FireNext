package next.developer.doc;

import static next.developer.doc.__init__.*;

import android.content.Context;

import java.io.File;

public class __self__read__ {
    public static String __self__read__(String self, Context context) {
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
                        return "'" + value + "' database not found";
                    }
                } else {
                    String childData = __file__read__.__file__read__(databaseName, context);
                    if (childData.equals("")) {
                        return "'" + value + "' child not found";
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
                                        break;
                                    } else {
                                        return "'" + value + "' database not found";
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
                                        return "'" + value + "' database not found";
                                    }

                                } else {
                                    return "'" + value + "' child not found";
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
                if (databaseName.equals("")) {
                    File file = new File(context.getFilesDir(), value + ".ndb");
                    if (file.exists()) {

                        return __self__.__self__(value, context);
                    } else {
                        return "'" + value + "' child not found";
                    }
                }
                if (value.equals("")) {
                    return "'" + databaseName + "' parent" + " child not found";
                }
                File file = new File(context.getFilesDir(), databaseName + ".ndb");
                if (!file.exists()) {
                    return "'" + databaseName + "' child not found";
                }
                String childData = __file__read__.__file__read__(databaseName, context);


                if (childData.equals("")) {
                    return "'" + value + "' child not found";
                } else {
                    String readChild = "";
                    String updateNDB = "";
                    String childMatch = "false";

                    for (int x2 = 0; x2 <= childData.length(); x2++) {
                        if (childData.charAt(x2) != start__tag && childData.charAt(x2) != child__end__tag && childData.charAt(x2) != end__tag) {
                            readChild = readChild + childData.charAt(x2);
                        }
                        if (childData.charAt(x2) == child__end__tag) {
                            if (childMatch.equals("true")) {
                                return readChild;
                            }
                            readChild = "";

                        }
                        if (childData.charAt(x2) == value__child__tag) {
                            if (readChild.equals(value)) {
                                childMatch = "true";
                                readChild = "";
                            }

                        } else if (childMatch.equals("true")) {
                            updateNDB = updateNDB + childData.charAt(x2);
                        }
                        if (x2 == childData.length() - 1) {
                            if (childMatch.equals("true")) {
                                return readChild;
                            } else {
                                File file1 = new File(context.getFilesDir(), value + ".ndb");
                                if (file1.exists()) {
                                    return __self__.__self__(value, context);
                                } else {
                                    return "'" + value + "' child not found";
                                }

                            }
                        }


                    }
                }
            }

        }
        return "false";
    }
}
