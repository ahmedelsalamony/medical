package com.example.ahmed.medical.BlurImage;

import android.content.Context;
import android.graphics.Typeface;
import android.support.design.widget.TextInputLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.EditText;

import java.lang.reflect.Field;

/**
 * Created by ok on 01/11/2016.
 */

public final class CustomTextInputLayout {

    public static void setDefaultFont(Context context,
                                      String staticTypefaceFieldName, String fontAssetName) {
        final Typeface regular = Typeface.createFromAsset(context.getAssets(),
                fontAssetName);
        replaceFont(staticTypefaceFieldName, regular);
    }

    protected static void replaceFont(String staticTypefaceFieldName,
                                      final Typeface newTypeface) {
        try {
            final Field staticField = Typeface.class
                    .getDeclaredField(staticTypefaceFieldName);
            staticField.setAccessible(true);

            staticField.set(null, newTypeface);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }}
