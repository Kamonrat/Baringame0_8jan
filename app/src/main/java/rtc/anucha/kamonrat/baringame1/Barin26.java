package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin26 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin26);
    }
    public void onClickds (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton134);
        Intent intent = new Intent(Barin26.this,Barin27.class);
        startActivity(intent);
    }
    public void onClickdt (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton135);
        Intent intent = new Intent(Barin26.this,Barin27.class);
        startActivity(intent);
    }
    public void onClickdu (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton137);
        Intent intent = new Intent(Barin26.this,Barin27.class);
        startActivity(intent);
    }
    public void onClickdv (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton138);
        Intent intent = new Intent(Barin26.this,Barin27.class);
        startActivity(intent);
    }
}
