package next.developer.doc;

import android.content.Context;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class __file__read__ {
    public static String __file__read__(String Table_Name, Context context) {
        String table = "";
        try {

            File file = new File(context.getFilesDir(), Table_Name + ".ndb");

            Scanner myReader = new Scanner(file);

            while (myReader.hasNextLine()) {

                String data = myReader.nextLine();
                table = table + data;


            }

            myReader.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
            return "false";

        }
        return table;
    }
}
