package com.example.ahmed.medical.BlurImage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.design.widget.TextInputLayout;
import android.text.TextPaint;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ahmed.medical.R;

import java.lang.reflect.Field;


/**
 * Created by ok on 01/11/2016.
 */

public class TypefaceUtil {

    public static void overrideFonts(final Context context, final View v) {
        try {
            if (v instanceof ViewGroup) {
                ViewGroup vg = (ViewGroup) v;
                for (int i = 0; i < vg.getChildCount(); i++) {
                    View child = vg.getChildAt(i);
                    overrideFonts(context, child);
                }
            } else if (v instanceof TextView) {
                ((TextView) v).setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/DroidKufi-Bold.ttf"));
                ((TextView) v).setTextColor(context.getResources().getColor(R.color.black));
            }/*else if(v instanceof EditText){
                ((EditText) v).setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/DroidKufi-Bold.ttf"));
                }*/

        } catch (Exception e) {
        }
    }


    public static void setTypefaceToInputLayout(final Context context,TextInputLayout inputLayout, String typeFace){

        final Typeface tf = Typeface.createFromAsset(context.getAssets(), typeFace);

        inputLayout.getEditText().setTypeface(tf);
        try {
            // Retrieve the CollapsingTextHelper Field
            final Field collapsingTextHelperField = inputLayout.getClass().getDeclaredField("mCollapsingTextHelper");
            collapsingTextHelperField.setAccessible(true);

            // Retrieve an instance of CollapsingTextHelper and its TextPaint
            final Object collapsingTextHelper = collapsingTextHelperField.get(inputLayout);
            final Field tpf = collapsingTextHelper.getClass().getDeclaredField("mTextPaint");
            tpf.setAccessible(true);

            // Apply your Typeface to the CollapsingTextHelper TextPaint
            ((TextPaint) tpf.get(collapsingTextHelper)).setTypeface(tf);
        } catch (Exception ignored) {
            // Nothing to do
        }
    }
}
