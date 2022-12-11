package next.developer.doc;

import static next.developer.doc.__init__.*;

import android.content.Context;

import java.io.File;

public class __self__child__delete__ {
    public static String __self__child__delete__(String self, Context context) {
        String value = "";
        String parent = "";
        String databaseName = "";

        for (int x = 0; x <= self.length(); x++) {
            if (self.charAt(x) != '>') {
                value = value + self.charAt(x);
            }
            if (self.charAt(x) == '>') {
                value = value + self.charAt(x);
                parent = parent + value;
                value = "";
            }
            if (x == self.length() - 1) {
                File file;
                System.out.println(parent);
                if (!parent.equals("")) {
                    file = new File(context.getFilesDir(), value + ".ndb");
                    if (file.exists()) {
                        String database = __file__read__.__file__read__(value, context);
                        if (database.equals("[]") || database.equals("")) {
                            __self__update__.__self__update__(parent.substring(0, parent.length() - 1), value, context);
                            File file1 = new File(context.getFilesDir(), value + ".ndb");
                            file1.delete();
                            return "true";
                        } else {
                            databaseName = value;
                            value = "";
                            String childFound = "true";

                            for (int x1 = 0; x1 <= database.length(); x1++) {
                                if (database.charAt(x1) != child__end__tag && database.charAt(x1) != start__tag && database.charAt(x1) != end__tag) {
                                    value = value + database.charAt(x1);
                                }
                                if (database.charAt(x1) == value__child__tag) {
                                    childFound = "false";
                                } else if (database.charAt(x1) == child__end__tag) {
                                    if (childFound.equals("true")) {
                                        __self__child__delete__.__self__child__delete__1(value, context);
                                        value = "";
                                    } else {
                                        value = "";
                                        childFound = "true";
                                    }
                                }
                                if (x1 == database.length() - 1) {
                                    if (childFound.equals("true")) {
                                        __self__child__delete__.__self__child__delete__1(value, context);
                                    }
                                    File file1 = new File(context.getFilesDir(), databaseName + ".ndb");
                                    file1.delete();
                                    break;
                                }


                            }
                        }
                    } else {
                        return "'" + value + "' child not found";
                    }

                } else {
                    file = new File(context.getFilesDir(), value + ".ndb");

                    if (file.exists()) {
                        String database = __file__read__.__file__read__(value, context);
                        if (database.equals("[]") || database.equals("")) {

                            File file1 = new File(context.getFilesDir(), value + ".ndb");
                            file1.delete();
                            return "true";
                        } else {
                            databaseName = value;
                            value = "";
                            String childFound = "true";

                            for (int x1 = 0; x1 <= database.length(); x1++) {
                                if (database.charAt(x1) != child__end__tag && database.charAt(x1) != start__tag && database.charAt(x1) != end__tag) {
                                    value = value + database.charAt(x1);
                                }
                                if (database.charAt(x1) == value__child__tag) {
                                    childFound = "false";
                                } else if (database.charAt(x1) == child__end__tag) {
                                    if (childFound.equals("true")) {
                                        __self__child__delete__.__self__child__delete__1(value, context);
                                        value = "";
                                    } else {
                                        value = "";
                                        childFound = "true";
                                    }
                                }
                                if (x1 == database.length() - 1) {
                                    if (childFound.equals("true")) {
                                        __self__child__delete__.__self__child__delete__1(value, context);
                                    }
                                    File file1 = new File(context.getFilesDir(), databaseName + ".ndb");
                                    file1.delete();
                                    break;
                                }


                            }
                        }
                    } else {
                        return "'" + value + "' child not found";
                    }

                }


                break;
            }

        }
        if (!parent.equals("")) {
            __self__update__.__self__update__(parent.substring(0, parent.length() - 1), databaseName, context);
        }
        return "true";
    }

    private static String __self__child__delete__1(String self, Context context) {
        String value = "";
        String databaseName = "";

        for (int x = 0; x <= self.length(); x++) {
            if (self.charAt(x) != '>') {
                value = value + self.charAt(x);
            }
            if (self.charAt(x) == '>') {

                value = "";
            }
            if (x == self.length() - 1) {
                File file = new File(context.getFilesDir(), value + ".ndb");
                if (file.exists()) {
                    String database = __file__read__.__file__read__(value, context);
                    if (database.equals("[]") || database.equals("")) {
                        File file1 = new File(context.getFilesDir(), value + ".ndb");
                        file1.delete();
                        return "true";
                    } else {
                        databaseName = value;
                        value = "";
                        String childFound = "true";

                        for (int x1 = 0; x1 <= database.length(); x1++) {
                            if (database.charAt(x1) != child__end__tag && database.charAt(x1) != start__tag && database.charAt(x1) != end__tag) {
                                value = value + database.charAt(x1);
                            }
                            if (database.charAt(x1) == value__child__tag) {
                                childFound = "false";
                            } else if (database.charAt(x1) == child__end__tag) {
                                if (childFound.equals("true")) {
                                    __self__child__delete__.__self__child__delete__2(value, context);
                                    value = "";
                                } else {
                                    value = "";
                                    childFound = "true";
                                }
                            }
                            if (x1 == database.length() - 1) {
                                if (childFound.equals("true")) {
                                    __self__child__delete__.__self__child__delete__2(value, context);
                                }
                                File file1 = new File(context.getFilesDir(), databaseName + ".ndb");
                                file1.delete();
                                break;
                            }


                        }
                    }
                } else {
                    return "'" + value + "' child not found";
                }
                break;
            }

        }
        return "";
    }

    private static String __self__child__delete__2(String self, Context context) {
        String value = "";
        String databaseName = "";

        for (int x = 0; x <= self.length(); x++) {
            if (self.charAt(x) != '>') {
                value = value + self.charAt(x);
            }
            if (self.charAt(x) == '>') {

                value = "";
            }
            if (x == self.length() - 1) {
                File file = new File(context.getFilesDir(), value + ".ndb");
                if (file.exists()) {
                    String database = __file__read__.__file__read__(value, context);
                    if (database.equals("[]") || database.equals("")) {
                        File file1 = new File(context.getFilesDir(), value + ".ndb");
                        file1.delete();
                        return "true";
                    } else {
                        databaseName = value;
                        value = "";
                        String childFound = "true";

                        for (int x1 = 0; x1 <= database.length(); x1++) {
                            if (database.charAt(x1) != child__end__tag && database.charAt(x1) != start__tag && database.charAt(x1) != end__tag) {
                                value = value + database.charAt(x1);
                            }
                            if (database.charAt(x1) == value__child__tag) {
                                childFound = "false";
                            } else if (database.charAt(x1) == child__end__tag) {
                                if (childFound.equals("true")) {
                                    __self__child__delete__.__self__child__delete__1(value, context);
                                    value = "";
                                } else {
                                    value = "";
                                    childFound = "true";
                                }
                            }
                            if (x1 == database.length() - 1) {
                                if (childFound.equals("true")) {
                                    __self__child__delete__.__self__child__delete__1(value, context);
                                }
                                File file1 = new File(context.getFilesDir(), databaseName + ".ndb");
                                file1.delete();
                                break;
                            }


                        }
                    }
                } else {
                    return "'" + value + "' child not found";
                }
                break;
            }

        }
        return "";
    }
}
