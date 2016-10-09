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
    public static void changeToTheme(Activity activity, int theme)
    {
        //sTheme = theme;
        activity.finish();

        activity.startActivity(new Intent(activity, activity.getClass()));

    }

    public static void onActivityCreateSetTheme(Activity activity, int sTheme)
    {
        switch (sTheme)
        {
            default:
            case STYLE1:
                activity.setTheme(R.style.Style1);
                break;
            case STYLE2:
                activity.setTheme(R.style.Style2);
                break;
            case STYLE3:
                activity.setTheme(R.style.Style3);
                break;
        }
    }
}
