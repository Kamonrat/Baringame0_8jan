package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin35 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin35);
    }
    public void onClickfc (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton170);
        Intent intent = new Intent(Barin35.this,Barin36.class);
        startActivity(intent);
    }
    public void onClickfd (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton171);
        Intent intent = new Intent(Barin35.this,Barin36.class);
        startActivity(intent);
    }
    public void onClickfe (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton172);
        Intent intent = new Intent(Barin35.this,Barin36.class);
        startActivity(intent);
    }
    public void onClickff (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton173);
        Intent intent = new Intent(Barin35.this,Barin36.class);
        startActivity(intent);
        finish();
    }
}
