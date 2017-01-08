package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin41 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin41);
    }
    public void onClickga (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton194);
        Intent intent = new Intent(Barin41.this,Barin42.class);
        startActivity(intent);
    }
    public void onClickgb (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton195);
        Intent intent = new Intent(Barin41.this,Barin42.class);
        startActivity(intent);
    }
    public void onClickgc (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton196);
        Intent intent = new Intent(Barin41.this,Barin42.class);
        startActivity(intent);
    }
    public void onClickgd (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton197);
        Intent intent = new Intent(Barin41.this,Barin42.class);
        startActivity(intent);
    }
}
