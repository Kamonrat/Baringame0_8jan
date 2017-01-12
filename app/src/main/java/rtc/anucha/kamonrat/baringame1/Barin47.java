package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin47 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin47);
    }
    public void onClickgy (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton215);
        Intent intent = new Intent(Barin47.this,Barin48.class);
        startActivity(intent);
    }
    public void onClickgz (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton219);
        Intent intent = new Intent(Barin47.this,Barin48.class);
        startActivity(intent);
    }
    public void onClickha (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton220);
        Intent intent = new Intent(Barin47.this,Barin48.class);
        startActivity(intent);
    }
    public void onClickhb (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton221);
        Intent intent = new Intent(Barin47.this,Barin48.class);
        startActivity(intent);
        finish();
    }
}
