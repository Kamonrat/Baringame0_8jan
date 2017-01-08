package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin8);
    }
    public void onClickay (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton62);
        Intent intent = new Intent(Barin8.this,Barin9.class);
        startActivity(intent);
    }
    public void onClickaz (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton63);
        Intent intent = new Intent(Barin8.this,Barin9.class);
        startActivity(intent);
    }
    public void onClickba (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton63);
        Intent intent = new Intent(Barin8.this,Barin9.class);
        startActivity(intent);
    }
    public void onClickbb (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton64);
        Intent intent = new Intent(Barin8.this,Barin9.class);
        startActivity(intent);
    }
}
