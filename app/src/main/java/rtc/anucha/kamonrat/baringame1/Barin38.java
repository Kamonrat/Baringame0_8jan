package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin38 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin38);
    }
    public void onClickfo (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton182);
        Intent intent = new Intent(Barin38.this,Barin39.class);
        startActivity(intent);
    }
    public void onClickfp (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton183);
        Intent intent = new Intent(Barin38.this,Barin39.class);
        startActivity(intent);
    }
    public void onClickfq (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton184);
        Intent intent = new Intent(Barin38.this,Barin39.class);
        startActivity(intent);
    }
    public void onClickfr (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton185);
        Intent intent = new Intent(Barin38.this,Barin39.class);
        startActivity(intent);
    }
}
