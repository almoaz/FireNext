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
        String check = __self__check__.__self__check__(path, "add");
        if (check.equals("child"))
        {
            return "value child not found";
        }
        if (check.equals("parent"))
        {
            return "parent not found";
        }
        if (check.equals("syntax"))
        {
            return "'error' "+path;
        }
        return __self__add__.__self__add__(check, context);
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

        String check = __self__check__.__self__check__(path, "child");
        if (check.equals("child"))
        {
            return "value child not found";
        }
        if (check.equals("syntax"))
        {
            return "'error' "+path;
        }
        return __self__read__.__self__read__(check, context);
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

        String check = __self__check__.__self__check__(path, "child");
        if (check.equals("child"))
        {
            return "value child not found";
        }
        if (check.equals("syntax"))
        {
            return "'error' "+path;
        }

        return __self__child__.__self__child__(check, context);
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
        ArrayList<String> returnValue = new ArrayList<>();
        String check = __self__check__.__self__check__(path, "child");
        if (check.equals("child"))
        {
            returnValue.add("value child not found");
            return returnValue;
        }
        if (check.equals("syntax"))
        {
            returnValue.add("'error' "+path);
            return returnValue;
        }
        return __self__query__.__self__query__(check, context);
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
        String check = __self__check__.__self__check__(path, "child");
        if (check.equals("child"))
        {
            return "value child not found";
        }
        if (check.equals("syntax"))
        {
            return "'error' "+path;
        }

        return __self__delete__.__self__delete__(check, context);
    }

}
