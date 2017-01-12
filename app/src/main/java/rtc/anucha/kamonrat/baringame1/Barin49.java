package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin49 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin49);
    }
    public void onClickhg (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton226);
        Intent intent = new Intent(Barin49.this,Barin50.class);
        startActivity(intent);
    }
    public void onClickhh (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton227);
        Intent intent = new Intent(Barin49.this,Barin50.class);
        startActivity(intent);
    }
    public void onClickhi (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton228);
        Intent intent = new Intent(Barin49.this,Barin50.class);
        startActivity(intent);
    }
    public void onClickhj (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton229);
        Intent intent = new Intent(Barin49.this,Barin50.class);
        startActivity(intent);
        finish();
    }
}
