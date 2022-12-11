package next.developer.table;

import android.content.Context;

import java.io.File;

public class __delete__table__ {
    public static String __delete__table__(String Table_Name, Context context) {
        File file = new File(context.getFilesDir(), Table_Name + ".nt");
        if (file.exists()) {
            file.delete();
            return "true";
        } else {
            return "'error' [" + Table_Name + "] table not found";
        }
    }
}
