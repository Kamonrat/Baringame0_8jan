package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin19);
    }
    public void onClickcq (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton106);
        Intent intent = new Intent(Barin19.this,Barin20.class);
        startActivity(intent);
    }
    public void onClickcr (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton107);
        Intent intent = new Intent(Barin19.this,Barin20.class);
        startActivity(intent);
    }
    public void onClickcs (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton108);
        Intent intent = new Intent(Barin19.this,Barin20.class);
        startActivity(intent);
    }
    public void onClickct (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton109);
        Intent intent = new Intent(Barin19.this,Barin20.class);
        startActivity(intent);
    }
}
