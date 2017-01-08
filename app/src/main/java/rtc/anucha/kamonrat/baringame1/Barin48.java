package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin48 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin48);
    }
    public void onClickhc (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton222);
        Intent intent = new Intent(Barin48.this,Barin49.class);
        startActivity(intent);
    }
    public void onClickhd (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton223);
        Intent intent = new Intent(Barin48.this,Barin49.class);
        startActivity(intent);
    }
    public void onClickhe (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton224);
        Intent intent = new Intent(Barin48.this,Barin49.class);
        startActivity(intent);
    }
    public void onClickhf (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton225);
        Intent intent = new Intent(Barin48.this,Barin49.class);
        startActivity(intent);
      }
}
