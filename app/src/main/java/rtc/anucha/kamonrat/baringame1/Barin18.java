package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin18);
    }
    public void onClickcm (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton99);
        Intent intent = new Intent(Barin18.this,Barin19.class);
        startActivity(intent);
    }
    public void onClickcn (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton103);
        Intent intent = new Intent(Barin18.this,Barin19.class);
        startActivity(intent);
    }
    public void onClickco (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton104);
        Intent intent = new Intent(Barin18.this,Barin19.class);
        startActivity(intent);
    }
    public void onClickcp (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton105);
        Intent intent = new Intent(Barin18.this,Barin19.class);
        startActivity(intent);
        finish();
    }
}
