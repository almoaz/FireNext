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

package next.firenext;
import android.content.Context;
import java.util.List;
import next.developer.table.*;

public class NextTable {

    public static String table_to_doc(Context context, String Table_Name, String Column_Name)
    {
        /**
         System.out.println(NextTable.delete_col(getApplicationContext(), "Table_Name", "id"))

         Table_Name.nt   (Table)

         id                  name                   email
         -----------------------------------------------------------------
         183071007           Mahfuz Salehin Moaz    xyz@xyz.com
         -----------------------------------------------------------------
         183071008           Mithila Nisa           xyz@xyz.com
         -----------------------------------------------------------------
         183071009           Shamim                xyz@xyz.com

         output :

         document
         |---183071007
         |           |---id:183071007
         |           |---name:Mahfuz Salehin Moaz
         |           |---email:xyz@xyz.com
         |---183071008
         |           |---id:183071008
         |           |---name:Mithila Nisa
         |           |---email:xyz@xyz.com
         |---183071009
         |           |---id:183071009
         |           |---name:Shamim
         |           |---email:xyz@xyz.com

         :return converted result
         */
        return __convert__table__doc__.__convert__table__doc__(Table_Name, Column_Name, context);
    }


    public static String delete_col(Context context,String Table_Name, String Column_Name)
    {

        /**

        System.out.println(NextTable.delete_col(getApplicationContext(), "ducument", "email"))

        output: (now)
        id                  name
        ----------------------------------------
        183071007           Mahfuz Salehin Moaz
        ----------------------------------------
        183071008           Mithila Nisa
        ----------------------------------------
        183071009           Sharmin

        #################################################################

        ducument.nt   (previous)

        id                  name                   email
        -----------------------------------------------------------------
        183071007           Mahfuz Salehin Moaz    xyz@xyz.com
        -----------------------------------------------------------------
        183071008           Mithila Nisa           xyz@xyz.com
        -----------------------------------------------------------------
        183071009           Sharmin                xyz@xyz.com


        :return Successful!

         Warning : When you delete a column, you los column data.

        */
        return __delete__col__.__delete__col__(Table_Name,Column_Name, context);
    }
    public static String delete_row(Context context,String Table_Name, String Search_Id)
    {
        /**

         System.out.println(NextTable.delete_row(getApplicationContext(), "ducument", "Mithila Nisa"))

        output: (now)
        id                  name                   email
        -----------------------------------------------------------------
        183071007           Mahfuz Salehin Moaz    xyz@xyz.com
        -----------------------------------------------------------------
        183071009           Sharmin                xyz@xyz.com

        #################################################################

        ducument.nt   (previous)

        id                  name                   email
        -----------------------------------------------------------------
        183071007           Mahfuz Salehin Moaz    xyz@xyz.com
        -----------------------------------------------------------------
        183071008           Mithila Nisa           xyz@xyz.com
        -----------------------------------------------------------------
        183071009           Sharmin                xyz@xyz.com


        :return Successful!

         Warning : When you delete a row, you los this rows data.

        */
        return __delete__row__.__delete__row__(Table_Name, Search_Id, context);
    }
    public static String update_row(Context context,String Table_Name, String Search_Id, String Update_Data)
    {
        /**

         System.out.println(NextTable.update_row(getApplicationContext(), "ducument", "Mithila Nisa", "183071008|Mithila Mithi|abc@abc.com"))

        output: (now)
        id                  name                   email
        -----------------------------------------------------------------
        183071007           Mahfuz Salehin Moaz    xyz@xyz.com
        -----------------------------------------------------------------
        183071008           Mithila Mithi          abc@abc.com
        -----------------------------------------------------------------
        183071009           Sharmin                xyz@xyz.com

        #################################################################

        ducument.nt   (previous)

        id                  name                   email
        -----------------------------------------------------------------
        183071007           Mahfuz Salehin Moaz    xyz@xyz.com
        -----------------------------------------------------------------
        183071008           Mithila Nisa           xyz@xyz.com
        -----------------------------------------------------------------
        183071009           Sharmin                xyz@xyz.com


        :return Successful!

        */
        return __update__row__.__update__row__(Table_Name, Search_Id, Update_Data, context);
    }
    public static String delete_data(Context context, String Table_Name, String Search_Id, String Column_Name)
    {
        /**

         System.out.println(NextTable.delete_data(getApplicationContext(), "ducument", "Mithila Nisa", "name"))

        output: (now)
        id                  name                   email
        -----------------------------------------------------------------
        183071007           Mahfuz Salehin Moaz    xyz@xyz.com
        -----------------------------------------------------------------
        183071008                                  xyz@xyz.com
        -----------------------------------------------------------------
        183071009           Sharmin                xyz@xyz.com

        #################################################################

        ducument.nt   (previous)

        id                  name                   email
        -----------------------------------------------------------------
        183071007           Mahfuz Salehin Moaz    xyz@xyz.com
        -----------------------------------------------------------------
        183071008           Mithila Nisa           xyz@xyz.com
        -----------------------------------------------------------------
        183071009           Sharmin                xyz@xyz.com


        :return Successful!

        */
        return __delete__data__.__delete__data__(Table_Name, Search_Id, Column_Name, context);
    }
    public static String update_data(Context context,String Table_Name, String Search_Id, String Column_Name, String Update_Data)
    {
        /**

         System.out.println(NextTable.delete_data(getApplicationContext(), "ducument", "Mithila Nisa", "email", "abc@abc.com"))

        output: (now)
        id                  name                   email
        -----------------------------------------------------------------
        183071007           Mahfuz Salehin Moaz    xyz@xyz.com
        -----------------------------------------------------------------
        183071008           Mithila Nisa           abc@abc.com
        -----------------------------------------------------------------
        183071009           Sharmin                xyz@xyz.com

        #################################################################

        ducument.nt   (previous)

        id                  name                   email
        -----------------------------------------------------------------
        183071007           Mahfuz Salehin Moaz    xyz@xyz.com
        -----------------------------------------------------------------
        183071008           Mithila Nisa           xyz@xyz.com
        -----------------------------------------------------------------
        183071009           Sharmin                xyz@xyz.com


        :return Successful!

        */
        return __update__data__.__update__data__(Table_Name, Search_Id, Column_Name, Update_Data, context);
    }
    public static List<Object> search_col_data(Context context, String Table_Name, String Column_Name)
    {
        /**
         List<Object> value = NextTable.search_col_data(getApplicationContext(), tableName,"id");
         System.out.println(value);

         output: [183071007, 183071008, 183071009]

         System.out.println(value.get(0));
         output: 183071007

        #################################################################

        ducument.nt

        id                  name                   email
        -----------------------------------------------------------------
        183071007           Mahfuz Salehin Moaz    xyz@xyz.com
        -----------------------------------------------------------------
        183071008           Mithila Nisa           xyz@xyz.com
        -----------------------------------------------------------------
        183071009           Sharmin                xyz@xyz.com


        :return [183071007, 183071008, 183071009]

        */
        return __search__col__data__.__search__col__data__(Table_Name, Column_Name, context);
    }
    public static List<Object> search_row_data(Context context, String Table_Name, String Search_Id)
    {
        /**

         System.out.println(NextTable.search_row_data(getApplicationContext(), "ducument", "183071007"))

        output:
        id                  name                   email
        -----------------------------------------------------------------
        183071007           Mahfuz Salehin Moaz    xyz@xyz.com


        #################################################################

        ducument.nt

        id                  name                   email
        -----------------------------------------------------------------
        183071007           Mahfuz Salehin Moaz    xyz@xyz.com
        -----------------------------------------------------------------
        183071008           Mithila Nisa           xyz@xyz.com
        -----------------------------------------------------------------
        183071009           Sharmin                xyz@xyz.com

        #################################################################

        :return :
        id                  name                   email
        -----------------------------------------------------------------
        183071007           Mahfuz Salehin Moaz    xyz@xyz.com

        */
        return __search__row__data__.__search__row__data__(Table_Name, Search_Id, context);
    }
    public static String search_data(Context context, String Table_Name, String Search_Id, String Column_Name)
    {
        /**

         System.out.println(NextTable.search_data(getApplicationContext(), "ducument", "183071008", "name"))

        output: Mithila Nisa


        #################################################################

        ducument.nt

        id                  name                   email
        -----------------------------------------------------------------
        183071007           Mahfuz Salehin Moaz    xyz@xyz.com
        -----------------------------------------------------------------
        183071008           Mithila Nisa           xyz@xyz.com
        -----------------------------------------------------------------
        183071009           Sharmin                xyz@xyz.com


        :return Mithila Nisa

        */
        return __search__data__.__search__data__(Table_Name, Search_Id, Column_Name, context);
    }
    public static String read_table(Context context, String Table_Name)
    {
        /**

         System.out.println(NextTable.read_table(getApplicationContext(), "ducument"))

        output:

        id                  name                   email
        -----------------------------------------------------------------
        183071007           Mahfuz Salehin Moaz    xyz@xyz.com
        -----------------------------------------------------------------
        183071008           Mithila Nisa           xyz@xyz.com
        -----------------------------------------------------------------
        183071009           Sharmin                xyz@xyz.com

        #################################################################

        :return

        id                  name                   email
        -----------------------------------------------------------------
        183071007           Mahfuz Salehin Moaz    xyz@xyz.com
        -----------------------------------------------------------------
        183071008           Mithila Nisa           xyz@xyz.com
        -----------------------------------------------------------------
        183071009           Sharmin                xyz@xyz.com

        */
        return __read__table__.__read__table__(Table_Name, context);
    }
    public static String add_data(Context context, String Table_Name, String Data)
    {
        /**

         System.out.println(NextTable.add_data(getApplicationContext(), "ducument", "183071009|Sharmin|xyz@xyz.com"))

        output: (now)
        id                  name                   email
        -----------------------------------------------------------------
        183071007           Mahfuz Salehin Moaz    xyz@xyz.com
        -----------------------------------------------------------------
        183071008           Mithila Mithi          abc@abc.com
        -----------------------------------------------------------------
        183071009           Sharmin                xyz@xyz.com

        #################################################################

        ducument.nt   (previous)

        id                  name                   email
        -----------------------------------------------------------------
        183071007           Mahfuz Salehin Moaz    xyz@xyz.com
        -----------------------------------------------------------------
        183071008           Mithila Nisa           xyz@xyz.com


        :return Successful!

        */
        return __add__data__.__add__data__(Table_Name, Data, context);
    }
    public static String delete_col_name(Context context, String Table_Name, String Column_Name)
    {
        /**

         System.out.println(NextTable.delete_col_name(getApplicationContext(), "ducument", "email"))

        output: (now)
        id                  name
        -----------------------------------------------------------------
        183071007           Mahfuz Salehin Moaz    xyz@xyz.com
        -----------------------------------------------------------------
        183071008           Mithila Mithi          abc@abc.com
        -----------------------------------------------------------------
        183071009           Sharmin                xyz@xyz.com

        #################################################################

        ducument.nt   (previous)

        id                  name                   email
        -----------------------------------------------------------------
        183071007           Mahfuz Salehin Moaz    xyz@xyz.com
        -----------------------------------------------------------------
        183071008           Mithila Mithi          abc@abc.com
        -----------------------------------------------------------------
        183071009           Sharmin                xyz@xyz.com


        :return Successful!

        */
        return __delete__col__name__.__delete__col__name__(Table_Name, Column_Name, context);
    }
    public static String update_col_name(Context context, String Table_Name, String Column_Name, String Update_Column_Name)
    {
        /**

         System.out.println(NextTable.update_col_data(getApplicationContext(), "ducument", "email", "EMAIL"))

        output: (now)
        id                  name                   EMAIL
        -----------------------------------------------------------------
        183071007           Mahfuz Salehin Moaz    xyz@xyz.com
        -----------------------------------------------------------------
        183071008           Mithila Mithi          abc@abc.com
        -----------------------------------------------------------------
        183071009           Sharmin                xyz@xyz.com

        #################################################################

        ducument.nt   (previous)

        id                  name                   email
        -----------------------------------------------------------------
        183071007           Mahfuz Salehin Moaz    xyz@xyz.com
        -----------------------------------------------------------------
        183071008           Mithila Mithi          abc@abc.com
        -----------------------------------------------------------------
        183071009           Sharmin                xyz@xyz.com


        :return Successful!

        */
        return __update__col__name__.__update__col__name__(Table_Name, Column_Name, Update_Column_Name, context);
    }
    public static List<Object> read_col_name(Context context, String Table_Name)
    {
        /**

         System.out.println(NextTable.read_col_name(getApplicationContext(), "ducument", "email", "EMAIL"))

        output:
        id     name      email

        #################################################################

        ducument.nt

        id                  name                   email
        -----------------------------------------------------------------
        183071007           Mahfuz Salehin Moaz    xyz@xyz.com
        -----------------------------------------------------------------
        183071008           Mithila Mithi          abc@abc.com
        -----------------------------------------------------------------
        183071009           Sharmin                xyz@xyz.com

        #################################################################

        :return id    name     email

        */
        return __read__col__name__.__read__col__name__(Table_Name, context);
    }
    public static String add_col_name(Context context, String Table_Name, String Column_Name)
    {
        /**

         System.out.println(NextTable.add_col_name(getApplicationContext(), "ducument", "email"))

        output: (now)
        id                  name                   email
        -----------------------------------------------------------------
        183071007           Mahfuz Salehin Moaz    xyz@xyz.com
        -----------------------------------------------------------------
        183071008           Mithila Mithi          abc@abc.com
        -----------------------------------------------------------------
        183071009           Sharmin                xyz@xyz.com

        #################################################################

        ducument.nt

        id                  name
        -----------------------------------------------------------------
        183071007           Mahfuz Salehin Moaz    xyz@xyz.com
        -----------------------------------------------------------------
        183071008           Mithila Mithi          abc@abc.com
        -----------------------------------------------------------------
        183071009           Sharmin                xyz@xyz.com

        #################################################################

        :return successful!

        */
        return __add__col__name__.__add__col__name__(Table_Name, Column_Name, context);
    }
    public static String delete_table(Context context, String Table_Name)
    {
        /**
         System.out.println(delete_table(getApplicationContext(), "tableName"))

        Already do you have a (tablename.nt) file then you delete this file any time.

        :return: Successfully! delete


        Warning : When you delete a table you los your table data.
        */
        return __delete__table__.__delete__table__(Table_Name, context);
    }
    public static String create_table(Context context, String Table_Name)
    {
        /**
         System.out.println(create_table(getApplicationContext(), "tableName"))

        When you create a table then you find a (tablename.nt) file .

        :return: Successfully! create
        */
        return __create__table__.__create__table__(Table_Name, context);
    }
}
