package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin12);
    }
    public void onClickbo (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton73);
        Intent intent = new Intent(Barin12.this,Barin13.class);
        startActivity(intent);
    }
    public void onClickbp (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton75);
        Intent intent = new Intent(Barin12.this,Barin13.class);
        startActivity(intent);
    }
    public void onClickbq (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton80);
        Intent intent = new Intent(Barin12.this,Barin13.class);
        startActivity(intent);
    }
    public void onClickbr (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton81);
        Intent intent = new Intent(Barin12.this,Barin13.class);
        startActivity(intent);
        finish();
    }
}
