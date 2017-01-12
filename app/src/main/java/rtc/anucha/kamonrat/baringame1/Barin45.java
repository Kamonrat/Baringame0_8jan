package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin45 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin45);
    }
    public void onClickgq (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton210);
        Intent intent = new Intent(Barin45.this,Barin46.class);
        startActivity(intent);
    }
    public void onClickgr (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton211);
        Intent intent = new Intent(Barin45.this,Barin46.class);
        startActivity(intent);
    }
    public void onClickgs (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton212);
        Intent intent = new Intent(Barin45.this,Barin46.class);
        startActivity(intent);
    }
    public void onClickgt (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton213);
        Intent intent = new Intent(Barin45.this,Barin46.class);
        startActivity(intent);
        finish();

    }
}
