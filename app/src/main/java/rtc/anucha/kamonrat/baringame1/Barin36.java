package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin36 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin36);
    }
    public void onClickfg (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton174);
        Intent intent = new Intent(Barin36.this,Barin37.class);
        startActivity(intent);
    }
    public void onClickfh (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton175);
        Intent intent = new Intent(Barin36.this,Barin37.class);
        startActivity(intent);
    }
    public void onClickfi (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton176);
        Intent intent = new Intent(Barin36.this,Barin37.class);
        startActivity(intent);
    }
    public void onClickfj (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton177);
        Intent intent = new Intent(Barin36.this,Barin37.class);
        startActivity(intent);
        finish();
    }
}
