package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin23 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin23);
    }
    public void onClickdg (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton122);
        Intent intent = new Intent(Barin23.this,Barin24.class);
        startActivity(intent);
    }
    public void onClickdh (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton123);
        Intent intent = new Intent(Barin23.this,Barin24.class);
        startActivity(intent);
    }
    public void onClickdi (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton125);
        Intent intent = new Intent(Barin23.this,Barin24.class);
        startActivity(intent);
    }
    public void onClickdj (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton126);
        Intent intent = new Intent(Barin23.this,Barin24.class);
        startActivity(intent);
    }
}
