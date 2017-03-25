package arcticfox.studio.paintracker;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TabHost;
import android.widget.TextView;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.WHITE;


@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create tabhost
        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);

        //Creating tab menu
        TabHost.TabSpec tab1 = tabHost.newTabSpec("First tab");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("Second Tab");

        //Setting up tab 1 name
        tab1.setIndicator("Overview");
        //Set tab 1 activity to tab 1 activity
        tab1.setContent(new Intent(this,Tab1Activity.class));

        //Setting up tab 2 name
        tab2.setIndicator("Records");
        //Set tab 2 activity to tab 2 activity
        tab2.setContent(new Intent(this,Tab2Activity.class));

        //Add tabs
        tabHost.addTab(tab1);
        tabHost.addTab(tab2);

//        tabHost.getTabWidget().getChildAt(0).setBackgroundColor(WHITE);
//        tabHost.getTabWidget().getChildAt(1).setBackgroundColor(BLACK);
    }

}
