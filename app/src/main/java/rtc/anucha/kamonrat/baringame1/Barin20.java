package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin20);
    }
    public void onClickcu (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton110);
        Intent intent = new Intent(Barin20.this,Barin21.class);
        startActivity(intent);
    }
    public void onClickcv (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton111);
        Intent intent = new Intent(Barin20.this,Barin21.class);
        startActivity(intent);
    }
    public void onClickcw (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton112);
        Intent intent = new Intent(Barin20.this,Barin21.class);
        startActivity(intent);
    }
    public void onClickcx (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton113);
        Intent intent = new Intent(Barin20.this,Barin21.class);
        startActivity(intent);
        finish();
    }
}
