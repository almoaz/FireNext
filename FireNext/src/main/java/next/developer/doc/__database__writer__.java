package next.developer.doc;

import android.content.Context;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class __database__writer__ {
    public static void __database__writer__(String Table_Name, String Data, Context context) {

        try {
            FileOutputStream fileOutputStream;
            fileOutputStream = context.openFileOutput(Table_Name + ".ndb", Context.MODE_PRIVATE);

            fileOutputStream.write(Data.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(context, "error", Toast.LENGTH_SHORT).show();
        }
    }
}
