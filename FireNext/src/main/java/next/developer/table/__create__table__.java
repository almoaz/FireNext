package next.developer.table;

import android.content.Context;

import java.io.File;
import java.io.IOException;

public class __create__table__ {
    public static String __create__table__(String Table_Name, Context context) {
        File file = new File(context.getFilesDir(), Table_Name + ".nt");
        if (file.exists()) {
            return "already" + " \"" + Table_Name + "\" " + "table created";
        } else {
            try {
                file.createNewFile();
                return "true";
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
