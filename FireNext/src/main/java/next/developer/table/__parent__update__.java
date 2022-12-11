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
