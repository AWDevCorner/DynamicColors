package tiwiz.utils;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.Drawable;

public class DrawingUtils {

    public static final Drawable getColoredDrawable(Context mContext, int whiteResId, int finalColor){
        Drawable whiteDrawable = mContext.getResources().getDrawable(whiteResId);
        final ColorFilter filter = new LightingColorFilter(finalColor, 0);
        whiteDrawable.mutate().setColorFilter(filter);

        return whiteDrawable;
    }
}
