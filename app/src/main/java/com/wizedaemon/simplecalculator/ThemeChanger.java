package com.wizedaemon.simplecalculator;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by Хозяин on 09.10.2016.
 */
public class ThemeChanger {
    private static int sTheme;

    public final static int STYLE1 = 0;
    public final static int STYLE2 = 1;
    public final static int STYLE3 = 2;
    public static void setTheme( int theme)
    {
        sTheme = theme;


        //activity.startActivity(new Intent(activity, activity.getClass()));
        //activity.recreate();

    }

    public static int getThemeId () {
        switch (sTheme)
        {
            default:
            case STYLE1:
                return R.style.Style1;
                //break;
            case STYLE2:
               return R.style.Style2;
                //break;
            case STYLE3:
                return R.style.Style3;
                //break;
        }
    }
}
