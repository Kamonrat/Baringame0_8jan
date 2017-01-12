package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin11);
    }
    public void onClickbk (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton76);
        Intent intent = new Intent(Barin11.this,Barin12.class);
        startActivity(intent);
    }
    public void onClickbl (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton77);
        Intent intent = new Intent(Barin11.this,Barin12.class);
        startActivity(intent);
    }
    public void onClickbm (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton78);
        Intent intent = new Intent(Barin11.this,Barin12.class);
        startActivity(intent);
    }
    public void onClickbn (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton79);
        Intent intent = new Intent(Barin11.this,Barin12.class);
        startActivity(intent);
        finish();
    }
}
