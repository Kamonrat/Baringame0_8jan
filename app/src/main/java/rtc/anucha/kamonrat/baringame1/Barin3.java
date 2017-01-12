package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin3);
    }
    public void onClickad (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton42);
        Intent intent = new Intent(Barin3.this,Barin4.class);
        startActivity(intent);
    }
    public void onClickaf (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton43);
        Intent intent = new Intent(Barin3.this,Barin4.class);
        startActivity(intent);
    }
    public void onClickag (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton44);
        Intent intent = new Intent(Barin3.this,Barin4.class);
        startActivity(intent);
    }
    public void onClickah (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton45);
        Intent intent = new Intent(Barin3.this,Barin4.class);
        startActivity(intent);
        finish();
    }
}
