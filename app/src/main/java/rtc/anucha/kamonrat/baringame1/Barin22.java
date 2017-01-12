package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin22);
    }
    public void onClickdc (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton118);
        Intent intent = new Intent(Barin22.this,Barin23.class);
        startActivity(intent);
    }
    public void onClickdd (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton119);
        Intent intent = new Intent(Barin22.this,Barin23.class);
        startActivity(intent);
    }
    public void onClickde (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton120);
        Intent intent = new Intent(Barin22.this,Barin23.class);
        startActivity(intent);
    }
    public void onClickdf (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton121);
        Intent intent = new Intent(Barin22.this,Barin23.class);
        startActivity(intent);
        finish();
    }
}
