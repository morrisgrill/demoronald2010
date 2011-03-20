package com.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Principal extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
        

        //===============
        //LOGO DEL MENÚ
        //===============
        
        ImageView logo1 = (ImageView) findViewById(R.id.ImageLogo1);
        //Animacion del logo
        Animation fade1 = AnimationUtils.loadAnimation(this, R.anim.fade_in); 
        logo1.setAnimation(fade1);

        
        //===============
        //LISTA DEL MENÚ
        //===============
        ListView menuList = (ListView) findViewById(R.id.ListView_Menu);
        
        //se carga la lista de items
        String[] items = { getResources().getString(R.string.menu_item_play),
                getResources().getString(R.string.menu_item_scores),
                getResources().getString(R.string.menu_item_settings),
                getResources().getString(R.string.menu_item_help),
                getResources().getString(R.string.menu_item_exit)
                };
        
        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, R.layout.menu_item, items);
        menuList.setAdapter(adapt);
        
        
        //se agrega funcionalidad para el menú
        menuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {
                // Note: if the list was built "by hand" the id could be used.
                // As-is, though, each item has the same id
                TextView textView = (TextView) itemClicked;
                String strText = textView.getText().toString();
                if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_play))) {
                    // Launch the Game Activity
                    //startActivity(new Intent(QuizMenuActivity.this, QuizGameActivity.class));
                } else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_help))) {
                    // Launch the Help Activity
                    //startActivity(new Intent(QuizMenuActivity.this, QuizHelpActivity.class));
                } else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_settings))) {
                    // Launch the Settings Activity
                    //startActivity(new Intent(QuizMenuActivity.this, QuizSettingsActivity.class));
                } else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_scores))) {
                    // Launch the Scores Activity
                    //startActivity(new Intent(QuizMenuActivity.this, QuizScoresActivity.class));
                } else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_exit))) {
                    // Launch the Scores Activity
                    startActivity(new Intent(Principal.this, DemoLogin.class));
                }
            }
        });
        
        
     
    }
    
}