package com.example.factory;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

public class WhiteHuman extends Activity
 implements Human {

	@Override
	public void laugh() {
		// TODO Auto-generated method stub
		Log.i("tag", "��Ц");
		//Toast.makeText(this, "��Ц", 1).show();
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		Log.i("tag", "�׿�");
		//Toast.makeText(this, "��Ц", 1).show();
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		Log.i("tag", "��˵");
		//Toast.makeText(this, "��Ц", 1).show();
	}

}
