package next.developer.doc;

import static next.developer.doc.__init__.*;

import android.content.Context;

import java.io.File;
import java.util.Objects;

public class __self__delete__ {
    public static String __self__delete__(String self, Context context) {
        String value = "";
        String databaseName = "";
        String parentDatabaseName = "";

        for (int x = 0; x <= self.length(); x++) {
            if ('>' != self.charAt(x)) {
                value = value + (self.charAt(x));
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
                                        value = "";
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
                                        break;
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
                        return __self__child__delete__.__self__child__delete__(value, context);
                    } else {
                        return "'" + value + "' database not found";
                    }

                }

                if (value.equals("")) {
                    return "'" + databaseName + "' parent" + " child not found";
                }

                String childData = __file__read__.__file__read__(databaseName, context);

                if (childData.equals("")) {
                    return "'" + value + "' child not found";
                } else {

                    String value1 = "";
                    String name = "";
                    String notFoundChild = "";
                    for (int x1 = 0; x1 <= value.length(); x1++) {

                        if (value.charAt(x1) != devided__tag) {
                            value1 = value1 + value.charAt(x1);
                        }
                        if (value.charAt(x1) == value__child__tag) {
                            name = value1;
                            value1 = "";

                        }
                        /**if (value.charAt(x1) == devided__tag) {
                         String readChild = "";
                         String updateNDB = "";
                         String childMatch = "false";

                         childData = __file__read__.__file__read__(databaseName);

                         for (int x2 = 0; x2 <= childData.length(); x2++) {
                         if (childData.charAt(x2) == start__tag) {
                         updateNDB = updateNDB + childData.charAt(x2);
                         }
                         if (childData.charAt(x2) != start__tag && childData.charAt(x2) != child__end__tag && childData.charAt(x2) != end__tag) {
                         readChild = readChild + childData.charAt(x2);
                         }
                         if (childData.charAt(x2) == child__end__tag) {
                         if (Objects.equals(childMatch, "null") && Objects.equals(updateNDB, String.valueOf(start__tag))) {
                         childMatch = "true";
                         continue;
                         }
                         if (Objects.equals(childMatch, "null") && !Objects.equals(updateNDB, String.valueOf(start__tag))) {
                         childMatch = "true";
                         } else if (childMatch.equals("false") && updateNDB.equals(String.valueOf(start__tag))) {
                         updateNDB = updateNDB + readChild;
                         } else if (childMatch.equals("false") && !updateNDB.equals("")) {
                         updateNDB = updateNDB + child__end__tag + readChild;
                         }

                         readChild = "";

                         }
                         if (childData.charAt(x2) == value__child__tag && childMatch.equals("false")) {
                         if (readChild.equals(name)) {
                         childMatch = "null";
                         }
                         } else if (childMatch.equals("true")) {
                         updateNDB = updateNDB + childData.charAt(x2);
                         }
                         if (childData.charAt(x2) == end__tag && x2 == childData.length() - 1) {
                         if (childMatch.equals("true")) {
                         __database__writer__.__database__writer__(databaseName, updateNDB);
                         }

                         if (childMatch.equals("null")) {
                         updateNDB = updateNDB + end__tag;
                         __database__writer__.__database__writer__(databaseName, updateNDB);
                         }

                         if (childMatch.equals("false")) {
                         notFoundChild = notFoundChild + "'" + name + "'";
                         }

                         }


                         }
                         name = "";
                         value1 = "";
                         }*/
                        if (x1 == value.length() - 1) {

                            if (name.equals("")) {
                                File file = new File(context.getFilesDir(), value + ".ndb");
                                if (file.exists()) {
                                    parentDatabaseName = databaseName + ">" + value;

                                    return __self__child__delete__.__self__child__delete__(parentDatabaseName, context);
                                } else {
                                    return "'" + value + "' child not found";
                                }

                            }

                            String readChild = "";
                            String updateNDB = "";
                            String childMatch = "false";

                            childData = __file__read__.__file__read__(databaseName, context);

                            for (int x2 = 0; x2 <= childData.length(); x2++) {
                                if (childData.charAt(x2) == start__tag) {
                                    updateNDB = String.valueOf(childData.charAt(x2));
                                }
                                if (childData.charAt(x2) != start__tag && childData.charAt(x2) != child__end__tag && childData.charAt(x2) != end__tag) {
                                    readChild = readChild + childData.charAt(x2);
                                }
                                if (childData.charAt(x2) == child__end__tag) {
                                    if (Objects.equals(childMatch, "null") && Objects.equals(updateNDB, String.valueOf(start__tag))) {
                                        childMatch = "true";
                                        continue;
                                    }
                                    if (Objects.equals(childMatch, "null") && !Objects.equals(updateNDB, String.valueOf(start__tag))) {
                                        childMatch = "true";
                                    } else if (childMatch.equals("false") && updateNDB.equals(String.valueOf(start__tag))) {
                                        updateNDB = updateNDB + readChild;
                                    } else if (childMatch.equals("false") && !updateNDB.equals("")) {
                                        updateNDB = updateNDB + child__end__tag + readChild;
                                    }

                                    readChild = "";

                                }
                                if (childData.charAt(x2) == value__child__tag && childMatch.equals("false")) {
                                    if (readChild.equals(name)) {
                                        childMatch = "null";
                                    }
                                } else if (childMatch.equals("true")) {
                                    updateNDB = updateNDB + childData.charAt(x2);
                                }
                                if (x2 == childData.length() - 1) {
                                    if (childMatch.equals("true")) {
                                        if (updateNDB.equals("[]")) {
                                            __database__writer__.__database__writer__(databaseName, updateNDB, context);
                                            if (parentDatabaseName.equals("")) {
                                                parentDatabaseName = databaseName;
                                            } else {
                                                parentDatabaseName = parentDatabaseName + ">" + databaseName;

                                            }
                                            __self__child__delete__.__self__child__delete__(parentDatabaseName, context);
                                            return "true";
                                        } else {
                                            __database__writer__.__database__writer__(databaseName, updateNDB, context);
                                            return "true";
                                        }
                                    }
                                    if (childMatch.equals("null")) {
                                        updateNDB = updateNDB + end__tag;

                                        if (updateNDB.equals("[]")) {
                                            __database__writer__.__database__writer__(databaseName, updateNDB, context);
                                            if (parentDatabaseName.equals("")) {
                                                parentDatabaseName = databaseName;
                                            } else {
                                                parentDatabaseName = parentDatabaseName + ">" + databaseName;

                                            }
                                            __self__child__delete__.__self__child__delete__(parentDatabaseName, context);
                                            return "true";
                                        } else {
                                            __database__writer__.__database__writer__(databaseName, updateNDB, context);
                                            return "true";
                                        }
                                    }
                                    if (childMatch.equals("false")) {
                                        notFoundChild = notFoundChild + "'" + name + "'";
                                        updateNDB = childData.substring(0, childData.length() - 1) + value1 + end__tag;
                                        if (updateNDB.equals("[]")) {
                                            __database__writer__.__database__writer__(databaseName, updateNDB, context);
                                            if (parentDatabaseName.equals("")) {
                                                parentDatabaseName = databaseName;
                                            } else {
                                                parentDatabaseName = parentDatabaseName + ">" + databaseName;

                                            }
                                        } else {
                                            __database__writer__.__database__writer__(databaseName, updateNDB, context);
                                        }
                                        if (!notFoundChild.equals("")) {
                                            return notFoundChild + " child not found";
                                        }


                                    }
                                }

                            }
                            break;

                        }

                    }
                    value = "";

                }
                break;
            }

        }
        return "true";
    }
}
