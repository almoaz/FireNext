package next.developer.doc;

import android.content.Context;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class __table__append__ {
    public static void __table__append__(String Table_Name, String Data, Context context) {
        System.out.println(Data);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(Table_Name + ".ndb", true));
            writer.write(Data);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
