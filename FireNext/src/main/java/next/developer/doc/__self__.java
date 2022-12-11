package next.developer.doc;

import static next.developer.doc.__init__.*;

import android.content.Context;

public class __self__ {
    private static String __self__read__(String self, Context context) {
        return __file__read__.__file__read__(self, context);
    }

    public static String __self__(String self, Context context) {


        String database = __self__read__(self, context);
        String childValue = "";
        int spaceLength = self.length();
        String childName = "";
        String returnValue = "";

        for (int x = 0; x <= database.length(); x++) {
            if (database.charAt(x) != start__tag && database.charAt(x) != child__end__tag && database.charAt(x) != end__tag) {
                childValue = childValue + database.charAt(x);
            }

            if (database.charAt(x) == value__child__tag) {
                childName = childValue;
                childValue = "";
            }
            if (database.charAt(x) == child__end__tag) {
                if (!childName.equals("")) {
                    if (returnValue.equals("")) {
                        returnValue = self + "\n" + repeat(spaceLength) + devided__tag + line__tag + childName + childValue;
                    } else {
                        returnValue = returnValue + "\n" + repeat(spaceLength) + devided__tag + line__tag + childName + childValue;

                    }
                    childName = "";
                    childValue = "";

                } else {
                    String space = repeat(spaceLength - 1) + devided__tag + repeat(childValue.length() + 2) + devided__tag;
                    String value = __self__1(childValue, space, context);

                    if (returnValue.equals("")) {
                        returnValue = self + "\n" + repeat(spaceLength - 1) + devided__tag + line__tag + value;
                    } else {
                        returnValue = returnValue + "\n" + repeat(spaceLength - 1) + devided__tag + line__tag + value;
                    }
                    childValue = "";
                }

            }
            if (x == database.length() - 1) {
                if (!childName.equals("")) {
                    if (returnValue.equals("")) {
                        returnValue = self + "\n" + repeat(spaceLength) + devided__tag + line__tag + childName + childValue;
                    } else {
                        returnValue = returnValue + "\n" + repeat(spaceLength) + devided__tag + line__tag + childName + childValue;
                    }
                } else {
                    String space = repeat(spaceLength - 1) + devided__tag + repeat(childValue.length() + 2) + devided__tag;
                    String value = __self__1(childValue, space, context);
                    if (returnValue.equals("")) {
                        returnValue = self + "\n" + repeat(spaceLength - 1) + devided__tag + line__tag + value;
                    } else {
                        returnValue = returnValue + "\n" + repeat(spaceLength - 1) + devided__tag + line__tag + value;
                    }
                }
                break;
            }


        }
        return returnValue;
    }

    private static String __self__1(String self, String parentSpace, Context context) {

        String database = __self__read__(self, context);
        String childValue = "";
        String childName = "";
        String returnValue = "";
        for (int x = 0; x <= database.length(); x++) {
            if (database.charAt(x) != start__tag && database.charAt(x) != child__end__tag && database.charAt(x) != end__tag) {
                childValue = childValue + database.charAt(x);
            }

            if (database.charAt(x) == value__child__tag) {
                childName = childValue;
                childValue = "";
            }
            if (database.charAt(x) == child__end__tag) {
                if (!childName.equals("")) {
                    if (returnValue.equals("")) {

                        returnValue = self + "\n" + parentSpace + line__tag + childName + childValue;

                    } else {
                        returnValue = returnValue + "\n" + parentSpace + line__tag + childName + childValue;

                    }
                    childName = "";
                    childValue = "";

                } else {
                    String space = parentSpace + repeat(childValue.length() + 2) + devided__tag;
                    String value = __self__2(childValue, space, context);

                    if (returnValue.equals("")) {
                        returnValue = self + "\n" + parentSpace + line__tag + value;
                    } else {
                        returnValue = returnValue + "\n" + parentSpace + line__tag + value;
                    }
                }
                childValue = "";

            }
            if (x == database.length() - 1) {
                if (!childName.equals("")) {
                    if (returnValue.equals("")) {
                        returnValue = self + "\n" + parentSpace + line__tag + childName + childValue;
                    } else {
                        returnValue = returnValue + "\n" + parentSpace + line__tag + childName + childValue;

                    }
                } else {
                    String space = parentSpace + repeat(childValue.length() + 2) + devided__tag;
                    String value = __self__2(childValue, space, context);
                    if (returnValue.equals("")) {
                        returnValue = self + "\n" + parentSpace + line__tag + value;
                    } else {
                        returnValue = returnValue + "\n" + parentSpace + line__tag + value;
                    }
                }
                break;
            }


        }
        return returnValue;
    }

    private static String __self__2(String self, String parentSpace, Context context) {
        String database = __self__read__(self, context);
        String childValue = "";
        String childName = "";
        String returnValue = "";
        for (int x = 0; x <= database.length(); x++) {
            if (database.charAt(x) != start__tag && database.charAt(x) != child__end__tag && database.charAt(x) != end__tag) {
                childValue = childValue + database.charAt(x);
            }

            if (database.charAt(x) == value__child__tag) {
                childName = childValue;
                childValue = "";
            }
            if (database.charAt(x) == child__end__tag) {
                if (!childName.equals("")) {
                    if (returnValue.equals("")) {
                        returnValue = self + "\n" + parentSpace + line__tag + childName + childValue;
                    } else {
                        returnValue = returnValue + "\n" + parentSpace + line__tag + childName + childValue;

                    }
                    childName = "";
                    childValue = "";

                } else {
                    String space = parentSpace + repeat(childValue.length() + 2) + devided__tag;
                    String value = __self__1(childValue, space, context);

                    if (returnValue.equals("")) {
                        returnValue = self + "\n" + parentSpace + line__tag + value;
                    } else {
                        returnValue = returnValue + "\n" + parentSpace + line__tag + value;
                    }
                    childValue = "";
                }

            }
            if (x == database.length() - 1) {
                if (!childName.equals("")) {
                    if (returnValue.equals("")) {
                        returnValue = self + "\n" + parentSpace + line__tag + childName + childValue;
                    } else {
                        returnValue = returnValue + "\n" + parentSpace + line__tag + childName + childValue;
                    }
                } else {
                    String space = parentSpace + repeat(childValue.length() + 2) + devided__tag;
                    String value = __self__1(childValue, space, context);
                    if (returnValue.equals("")) {
                        returnValue = self + "\n" + parentSpace + line__tag + value;
                    } else {
                        returnValue = returnValue + "\n" + parentSpace + line__tag + value;
                    }
                }
                break;
            }


        }
        return returnValue;
    }

}
