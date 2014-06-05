package it.androidworld.devcorner.dynamiccolors;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import tiwiz.utils.DrawingUtils;


public class MainActivity extends Activity implements OnClickListener {

    private Resources res;
    ImageView robotImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        res = getResources();

        findViewById(R.id.button_blue).setOnClickListener(this);
        findViewById(R.id.button_violet).setOnClickListener(this);
        findViewById(R.id.button_green).setOnClickListener(this);
        findViewById(R.id.button_orange).setOnClickListener(this);
        findViewById(R.id.button_red).setOnClickListener(this);

        robotImage = (ImageView) findViewById(R.id.targetImage);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        int color = 0;
        switch(v.getId()){
            case R.id.button_blue:
                color = res.getColor(R.color.blue);
                break;
            case R.id.button_violet:
                color = res.getColor(R.color.violet);
                break;
            case R.id.button_green:
                color = res.getColor(R.color.green);
                break;
            case R.id.button_orange:
                color = res.getColor(R.color.orange);
                break;
            case R.id.button_red:
                color = res.getColor(R.color.red);
                break;
        }

        final Drawable newDrawable = DrawingUtils.getColoredDrawable(this, R.drawable.android_robot_outline, color);
        robotImage.setImageDrawable(newDrawable);
    }
}
