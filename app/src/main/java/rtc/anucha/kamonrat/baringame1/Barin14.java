package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin14);
    }
    public void onClickbw (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton85);
        Intent intent = new Intent(Barin14.this,Barin15.class);
        startActivity(intent);
    }
    public void onClickbx (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton87);
        Intent intent = new Intent(Barin14.this,Barin15.class);
        startActivity(intent);
    }
    public void onClickby (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton88);
        Intent intent = new Intent(Barin14.this,Barin15.class);
        startActivity(intent);
    }
    public void onClickbz (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton89);
        Intent intent = new Intent(Barin14.this,Barin15.class);
        startActivity(intent);
        finish();
    }
}
