package next.developer.doc;

import android.content.Context;

import java.io.File;
import java.io.IOException;

public class __create__database__ {
    public static void __create__database__(String self, Context context) {
        File file = new File(context.getFilesDir(), self + ".ndb");
        try {
            file.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
