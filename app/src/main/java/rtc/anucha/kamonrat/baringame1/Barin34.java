package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin34 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin34);
    }
    public void onClickey (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton166);
        Intent intent = new Intent(Barin34.this,Barin35.class);
        startActivity(intent);
    }
    public void onClickez (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton167);
        Intent intent = new Intent(Barin34.this,Barin35.class);
        startActivity(intent);
    }
    public void onClickfa (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton168);
        Intent intent = new Intent(Barin34.this,Barin35.class);
        startActivity(intent);
    }
    public void onClickfb (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton169);
        Intent intent = new Intent(Barin34.this,Barin35.class);
        startActivity(intent);
        finish();
    }
}
