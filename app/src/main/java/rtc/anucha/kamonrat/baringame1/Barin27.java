package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin27 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin27);
    }
    public void onClickdw (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton136);
        Intent intent = new Intent(Barin27.this,Barin28.class);
        startActivity(intent);
    }
    public void onClickdx (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton139);
        Intent intent = new Intent(Barin27.this,Barin28.class);
        startActivity(intent);
    }
    public void onClickdy (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton140);
        Intent intent = new Intent(Barin27.this,Barin28.class);
        startActivity(intent);
    }
    public void onClickdz (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton141);
        Intent intent = new Intent(Barin27.this,Barin28.class);
        startActivity(intent);
        finish();
    }
}
