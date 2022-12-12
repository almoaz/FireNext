package next.firenext;

import android.content.Context;

import java.util.ArrayList;

import next.developer.doc.*;


public class NextDatabase {

    public static String add(Context context,String path)
    {
        /**
           System.out.println(NextDatabase.add_data(getApplicationContext(), "USER>001>name:Mahfuz Salehin Moaz|age:26|nationality:Bangladesh"))
           output :
           USER
               |---001
               |     |---name:Mahfuz Salehin Moaz
               |     |---age:26
               |     |---nationality:Bangladesh

           ---------------------------------------------
           USER
               |---001
               |     |---name:Mahfuz Salehin Moaz
               |     |---age:26
               |     |---nationality:Bangladesh
               |---002
               |     |---name:Mithila Nisa
               |     |---age:23
               |     |---nationality:Bangladesh
               |---003
               |     |---name:Sharmin
               |     |---age:22
               |     |---nationality:Bangladesh
           ----------------------------------------------



           System.out.println(NextDatabase.add_data(getApplicationContext(), "USER>001>name:"))
           output :
           USER
               |---001
               |     |---name:

           ---------------------------------------------
           USER
               |---001
               |     |---name:
               |     |---age:26
               |     |---nationality:Bangladesh
               |---002
               |     |---name:Mithila Nisa
               |     |---age:23
               |     |---nationality:Bangladesh
               |---003
               |     |---name:Sharmin
               |     |---age:22
               |     |---nationality:Bangladesh
           ----------------------------------------------
        */
        return __self__add__.__self__add__(path, context);
    }
    public static String read(Context context,String path)
    {
        /**
           System.out.println(NextDatabase.read(getApplicationContext(), "USER>001>name:"))
           output : Mahfuz Salehin Moaz


           System.out.println(NextDatabase.read(getApplicationContext(), "USER"))
           output:
           --------------------------------------------
           USER
               |---001
               |     |---name:Mahfuz Salehin Moaz
               |     |---age:26
               |     |---nationality:Bangladesh
               |---002
               |     |---name:Mithila Nisa
               |     |---age:23
               |     |---nationality:Bangladesh
               |---003
               |     |---name:Sharmin
               |     |---age:22
               |     |---nationality:Bangladesh
           ----------------------------------------------

           System.out.println(NextDatabase.read(getApplicationContext(), "USER>001"))
           output:
           ---------------------------------
           001
             |---name:Mahfuz Salehin Moaz
             |---age:26
             |---nationality:Bangladesh
           ---------------------------------
        */
        return __self__read__.__self__read__(path, context);
    }

    public static String hasChild(Context context, String path)
    {
        /**
           System.out.println(NextDatabase.hasChild(getApplicationContext(), "USER>001>name:"))
           output : true

           ---------------------------------------------
           USER
               |---001
               |     |---name:Mahfuz Salehin Moaz
               |     |---age:26
               |     |---nationality:Bangladesh
               |---002
               |     |---name:Mithila Nisa
               |     |---age:23
               |     |---nationality:Bangladesh
               |---003
               |     |---name:Sharmin
               |     |---age:22
               |     |---nationality:Bangladesh
           ----------------------------------------------
        */
        return __self__child__.__self__child__(path, context);
    }

    public static ArrayList query(Context context,String path)
    {
        /**
           child = NextDatabase.query(getApplicationContext(), "USER>name:")
           output : [001,002,003]

           for x in child:

             if NextDatabase.hasChild(getApplicationContext(), "USER>"+x">name:") == "true":
                System.out.println(NextDatabase.read_data(getApplicationContext(), "USER>"+x">name:"))

           output : Mahfuz Salehin Moaz
                    Mithila Nisa
                    Sharmin
           ---------------------------------------------
           USER
               |---001
               |     |---name:Mahfuz Salehin Moaz
               |     |---age:26
               |     |---nationality:Bangladesh
               |---002
               |     |---name:Mithila Nisa
               |     |---age:23
               |     |---nationality:Bangladesh
               |---003
               |     |---name:Sharmin
               |     |---age:22
               |     |---nationality:Bangladesh
           ----------------------------------------------
        */
        return __self__query__.__self__query__(path, context);
    }

    public static String delete(Context context,String path)
    {
        /**
           System.out.println(NextDatabase.read_data(getApplicationContext(), "USER>001>name:"))
           output:
           ---------------------------------------------
           USER
               |---001
               |     |---age:26
               |     |---nationality:Bangladesh
               |---002
               |     |---name:Mithila Nisa
               |     |---age:23
               |     |---nationality:Bangladesh
               |---003
               |     |---name:Sharmin
               |     |---age:22
               |     |---nationality:Bangladesh
           ----------------------------------------------


           System.out.println(NextDatabase.read_data(getApplicationContext(), "USER>001))
           output:
           ---------------------------------------------
           USER
               |---002
               |     |---name:Mithila Nisa
               |     |---age:23
               |     |---nationality:Bangladesh
               |---003
               |     |---name:Sharmin
               |     |---age:22
               |     |---nationality:Bangladesh
           ----------------------------------------------
        */


        return __self__delete__.__self__delete__(path, context);
    }

}
