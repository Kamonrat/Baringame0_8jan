package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin40 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin40);
    }
    public void onClickfw (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton190);
        Intent intent = new Intent(Barin40.this,Barin41.class);
        startActivity(intent);
    }
    public void onClickfx (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton191);
        Intent intent = new Intent(Barin40.this,Barin41.class);
        startActivity(intent);
    }
    public void onClickfy (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton192);
        Intent intent = new Intent(Barin40.this,Barin41.class);
        startActivity(intent);
    }
    public void onClickfz (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton193);
        Intent intent = new Intent(Barin40.this,Barin41.class);
        startActivity(intent);
        finish();
    }
}
