package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin30 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin30);
    }
    public void onClickei (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton150);
        Intent intent = new Intent(Barin30.this,Barin31.class);
        startActivity(intent);
    }
    public void onClickej (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton151);
        Intent intent = new Intent(Barin30.this,Barin31.class);
        startActivity(intent);
    }
    public void onClickek (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton152);
        Intent intent = new Intent(Barin30.this,Barin31.class);
        startActivity(intent);
    }
    public void onClickel (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton153);
        Intent intent = new Intent(Barin30.this,Barin31.class);
        startActivity(intent);
    }
}
