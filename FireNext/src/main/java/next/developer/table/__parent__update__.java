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
package next.developer.table;

import static next.developer.table.__init__.*;

import android.content.Context;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class __parent__update__ {
    public static void __parent__update__(String self, String child, Context context) {
        File file = new File(context.getFilesDir(), self + ".ndb");
        if (file.exists()) {
            String database = "";
            try {
                Scanner myReader = new Scanner(file);

                while (myReader.hasNextLine()) {

                    String data = myReader.nextLine();
                    database = database + data;
                }

                myReader.close();

            } catch (FileNotFoundException e) {

                e.printStackTrace();

            }
            String value = "";
            String updateDB = "";
            String child_update = "false";

            for (int x = 0; x <= database.length(); x++) {
                if (database.charAt(x) != start__tag && database.charAt(x) != child__end__tag && database.charAt(x) != end__tag) {
                    value = value + database.charAt(x);
                }
                if (database.charAt(x) == child__end__tag) {
                    if (child.equals(value)) {
                        child_update = "true";
                        if (updateDB.equals("")) {
                            updateDB = value + child__end__tag;
                        } else {
                            updateDB = updateDB + value + child__end__tag;
                        }
                    } else {
                        if (updateDB.equals("")) {
                            updateDB = value + child__end__tag;
                        } else {
                            updateDB = updateDB + value + child__end__tag;
                        }
                    }
                    value = "";
                }
                if (x == database.length() - 1) {
                    if (!child.equals(value)) {
                        if (child_update.equals("false")) {
                            updateDB = updateDB + value + child__end__tag + child;
                        } else {
                            updateDB = updateDB + value;
                        }
                    }
                    if (child.equals(value)) {
                        if (updateDB.equals("")) {
                            updateDB = value;
                        } else {
                            updateDB = updateDB + value;
                        }
                    }
                    break;
                }
            }
            try {
                FileOutputStream fileOutputStream;
                fileOutputStream = context.openFileOutput(self + ".ndb", Context.MODE_PRIVATE);
                updateDB = start__tag + updateDB + end__tag;
                fileOutputStream.write(updateDB.getBytes(StandardCharsets.UTF_8));
                Toast.makeText(context, "successful", Toast.LENGTH_SHORT).show();
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(context, "error", Toast.LENGTH_SHORT).show();
            }

        } else {
            try {
                FileOutputStream fileOutputStream;
                fileOutputStream = context.openFileOutput(self + ".ndb", Context.MODE_PRIVATE);
                child = start__tag + child + end__tag;
                fileOutputStream.write(child.getBytes(StandardCharsets.UTF_8));
            } catch (Exception e) {
                e.printStackTrace();

            }
        }

    }
}
