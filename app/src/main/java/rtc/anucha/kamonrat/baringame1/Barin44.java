package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin44 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin44);
    }
    public void onClickgm (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton206);
        Intent intent = new Intent(Barin44.this,Barin45.class);
        startActivity(intent);
    }
    public void onClickgn (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton207);
        Intent intent = new Intent(Barin44.this,Barin45.class);
        startActivity(intent);
    }
    public void onClickgo (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton208);
        Intent intent = new Intent(Barin44.this,Barin45.class);
        startActivity(intent);
    }
    public void onClickgp (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton209);
        Intent intent = new Intent(Barin44.this,Barin45.class);
        startActivity(intent);
    }
}
