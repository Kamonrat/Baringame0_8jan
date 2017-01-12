package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin31 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin31);
    }
    public void onClickem (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton154);
        Intent intent = new Intent(Barin31.this,Barin32.class);
        startActivity(intent);
    }
    public void onClicken (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton155);
        Intent intent = new Intent(Barin31.this,Barin32.class);
        startActivity(intent);
    }
    public void onClickeo (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton156);
        Intent intent = new Intent(Barin31.this,Barin32.class);
        startActivity(intent);
    }
    public void onClickep (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton157);
        Intent intent = new Intent(Barin31.this,Barin32.class);
        startActivity(intent);
        finish();
    }
}
