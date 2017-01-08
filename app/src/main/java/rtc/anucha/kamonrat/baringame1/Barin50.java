package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin50 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin50);
    }
    public void onClickhk (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton197);
        Intent intent = new Intent(Barin50.this, Barin50.class);
        startActivity(intent);
    }
    public void onClickhl (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton197);
        Intent intent = new Intent(Barin50.this, Barin50.class);
        startActivity(intent);
    }
    public void onClickhm (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton197);
        Intent intent = new Intent(Barin50.this, Barin50.class);
        startActivity(intent);
    }
    public void onClickhn (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton197);
        Intent intent = new Intent(Barin50.this,Barin50.class);
        startActivity(intent);
    }
}
