package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin46 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin46);
    }
    public void onClickgu (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton214);
        Intent intent = new Intent(Barin46.this,Barin47.class);
        startActivity(intent);
    }
    public void onClickgv (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton216);
        Intent intent = new Intent(Barin46.this,Barin47.class);
        startActivity(intent);
    }
    public void onClickgw (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton217);
        Intent intent = new Intent(Barin46.this,Barin47.class);
        startActivity(intent);
    }
    public void onClickgx (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton218);
        Intent intent = new Intent(Barin46.this,Barin47.class);
        startActivity(intent);
    }
}
