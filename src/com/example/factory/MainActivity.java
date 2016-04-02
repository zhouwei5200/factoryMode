package com.example.factory;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Human wHuman = HumanFactory.creatHuman(WhiteHuman.class);
		wHuman.cry();
		wHuman.laugh();
		wHuman.talk();
		Human blackHuman = HumanFactory.creatHuman(BlackHuman.class);
		blackHuman.cry();
		blackHuman.laugh();
		blackHuman.talk();
		Human yellowHuman = HumanFactory.creatHuman(YellowHuman.class);
		yellowHuman.cry();
		yellowHuman.laugh();
		yellowHuman.talk();
    }


    
    
}
