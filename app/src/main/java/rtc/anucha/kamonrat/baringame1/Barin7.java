package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin7);
    }
    public void onClickau (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton58);
        Intent intent = new Intent(Barin7.this,Barin8.class);
        startActivity(intent);
    }
    public void onClickav (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton59);
        Intent intent = new Intent(Barin7.this,Barin8.class);
        startActivity(intent);
    }
    public void onClickaw (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton60);
        Intent intent = new Intent(Barin7.this,Barin8.class);
        startActivity(intent);
    }
    public void onClickax (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton61);
        Intent intent = new Intent(Barin7.this,Barin8.class);
        startActivity(intent);
        finish();
    }
}
