package next.developer.table;

import static next.developer.table.__init__.*;

import android.content.Context;

import java.util.List;

import next.firenext.NextDatabase;

public class __convert__table__doc__ {
    public static String __convert__table__doc__(String self, String Column_Name, Context context) {
        List<Object> value_child = __read__col__name__.__read__col__name__(self, context);
        List<Object> child_id = __search__col__data__.__search__col__data__(self, Column_Name, context);
        String child = "";

        for (int x = 0; x <= child_id.size(); x++) {
            for (int x1 = 0; x1 <= value_child.size(); x1++) {
                String value = __search__data__.__search__data__(self, (String) child_id.get(x), (String) value_child.get(x1), context);
                value = (String) value_child.get(x1) + value__child__tag + value;
                if (child.equals("")) {
                    child = value;
                } else {
                    child = child + devided__tag + value;
                }
                if (x1 == value_child.size() - 1) {
                    break;
                }

            }
            if (!child.equals("")) {
                NextDatabase.add(context, child_id.get(x) + ">" + child);
                __parent__update__.__parent__update__(self, (String) child_id.get(x), context);
            }
            if (x == child_id.size() - 1) {
                break;
            }
            child = "";
        }
        return "true";
    }
}
