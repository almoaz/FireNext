/*
 MIT License
 Copyright (c) 2022 Mahfuz Salehin Moaz

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.
 */
package next.developer.doc;

import static next.developer.doc.__init__.*;
import android.content.Context;

import java.io.File;

public class __self__update__ {
    public static String __self__update__(String self, String child, Context context) {
        String parentValue = "";
        String parent1 = "";

        for (int x = 0; x < self.length(); x++) {
            if (self.charAt(x) != '>') {
                parentValue = parentValue + self.charAt(x);
            }
            if (self.charAt(x) == '>') {
                parentValue = parentValue + self.charAt(x);
                parent1 = parent1 + parentValue;
                parentValue = "";
            }
            if (x == self.length() - 1) {
                String dataBase = __file__read__.__file__read__(parentValue, context);
                String value = "";
                String updateNDB = "";

                for (int x1 = 0; x1 <= dataBase.length(); x1++) {
                    if (dataBase.charAt(x1) == start__tag) {
                        updateNDB = updateNDB + dataBase.charAt(x1);
                    }
                    if (dataBase.charAt(x1) != child__end__tag && dataBase.charAt(x1) != start__tag && dataBase.charAt(x1) != end__tag) {
                        value = value + dataBase.charAt(x1);
                    }
                    if (dataBase.charAt(x1) == child__end__tag) {
                        if (!value.equals(child)) {
                            value = value + dataBase.charAt(x1);
                            updateNDB = updateNDB + value;

                        }
                        value = "";

                    }
                    if (x1 == dataBase.length() - 1) {
                        if (value.equals(child)) {
                            if (updateNDB.equals(String.valueOf(start__tag))) {
                                updateNDB = updateNDB + end__tag;
                                __database__writer__.__database__writer__(parentValue, updateNDB, context);
                            } else {
                                updateNDB = updateNDB.substring(0, updateNDB.length() - 1) + end__tag;
                                __database__writer__.__database__writer__(parentValue, updateNDB, context);
                            }

                            if (updateNDB.equals(String.valueOf(start__tag+end__tag))) {
                                File file = new File(context.getFilesDir(), parentValue + ".ndb");
                                file.delete();
                                __self__update__.__self__update__1(parent1.substring(0, parent1.length() - 1), parentValue, context);
                            }

                        } else {
                            updateNDB = updateNDB + value + end__tag;
                            __database__writer__.__database__writer__(parentValue, updateNDB, context);
                        }
                        break;
                    }


                }
                break;
            }


        }
        return "false";
    }

    private static String __self__update__1(String self, String child, Context context) {
        String parentValue = "";
        String parent1 = "";

        for (int x = 0; x < self.length(); x++) {
            if (self.charAt(x) != '>') {
                parentValue = parentValue + self.charAt(x);
            }
            if (self.charAt(x) == '>') {
                parentValue = parentValue + self.charAt(x);
                parent1 = parent1 + parentValue;
                parentValue = "";
            }
            if (x == self.length() - 1) {
                String dataBase = __file__read__.__file__read__(parentValue, context);
                String value = "";
                String updateNDB = "";

                for (int x1 = 0; x1 <= dataBase.length(); x1++) {
                    if (dataBase.charAt(x1) == start__tag) {
                        updateNDB = updateNDB + dataBase.charAt(x1);
                    }
                    if (dataBase.charAt(x1) != child__end__tag && dataBase.charAt(x1) != start__tag && dataBase.charAt(x1) != end__tag) {
                        value = value + dataBase.charAt(x1);
                    }
                    if (dataBase.charAt(x1) == child__end__tag) {
                        if (!value.equals(child)) {
                            value = value + dataBase.charAt(x1);
                            updateNDB = updateNDB + value;

                        }
                        value = "";

                    }
                    if (x1 == dataBase.length() - 1) {
                        if (value.equals(child)) {
                            if (updateNDB.equals(String.valueOf(start__tag))) {
                                updateNDB = updateNDB + end__tag;
                                __database__writer__.__database__writer__(parentValue, updateNDB, context);
                            } else {
                                updateNDB = updateNDB.substring(0, updateNDB.length() - 1) + end__tag;
                                __database__writer__.__database__writer__(parentValue, updateNDB, context);
                            }

                            if (updateNDB.equals(String.valueOf(start__tag+end__tag))) {
                                File file = new File(context.getFilesDir(), parentValue + ".ndb");
                                file.delete();
                                __self__update__.__self__update__(parent1.substring(0, parent1.length() - 1), parentValue, context);
                            }

                        } else {
                            updateNDB = updateNDB + value + end__tag;
                            __database__writer__.__database__writer__(parentValue, updateNDB, context);
                        }
                        break;
                    }


                }
                break;
            }


        }
        return "false";
    }
}
