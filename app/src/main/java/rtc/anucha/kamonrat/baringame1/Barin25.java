package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin25 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin25);
    }
    public void onClickdo (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton130);
        Intent intent = new Intent(Barin25.this,Barin26.class);
        startActivity(intent);
    }
    public void onClickdp (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton131);
        Intent intent = new Intent(Barin25.this,Barin26.class);
        startActivity(intent);
    }
    public void onClickdq (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton132);
        Intent intent = new Intent(Barin25.this,Barin26.class);
        startActivity(intent);
    }
    public void onClickdr (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton133);
        Intent intent = new Intent(Barin25.this,Barin26.class);
        startActivity(intent);
        finish();
    }
}
