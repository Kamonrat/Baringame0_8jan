package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin21);
    }
    public void onClickcy (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton114);
        Intent intent = new Intent(Barin21.this,Barin22.class);
        startActivity(intent);
    }
    public void onClickcz (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton115);
        Intent intent = new Intent(Barin21.this,Barin22.class);
        startActivity(intent);
    }
    public void onClickda (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton116);
        Intent intent = new Intent(Barin21.this,Barin22.class);
        startActivity(intent);
    }
    public void onClickdb (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton117);
        Intent intent = new Intent(Barin21.this,Barin22.class);
        startActivity(intent);
        finish();
    }
}
