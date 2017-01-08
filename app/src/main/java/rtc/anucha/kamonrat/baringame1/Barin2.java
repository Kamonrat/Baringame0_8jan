package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin2);
    }
    public void onClickad (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton10);
        Intent intent = new Intent(Barin2.this,Barin3.class);
        startActivity(intent);
    }
    public void onClickaa (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton11);
        Intent intent = new Intent(Barin2.this,Barin3.class);
        startActivity(intent);
    }
    public void onClickab (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton12);
        Intent intent = new Intent(Barin2.this,Barin3.class);
        startActivity(intent);
    }
    public void onClickac (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton13);
        Intent intent = new Intent(Barin2.this,Barin3.class);
        startActivity(intent);
    }
}
