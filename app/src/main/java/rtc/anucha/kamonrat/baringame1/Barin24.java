package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin24 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin24);
    }
    public void onClickdk (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton124);
        Intent intent = new Intent(Barin24.this,Barin25.class);
        startActivity(intent);
    }
    public void onClickdl (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton127);
        Intent intent = new Intent(Barin24.this,Barin25.class);
        startActivity(intent);
    }
    public void onClickdm (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton128);
        Intent intent = new Intent(Barin24.this,Barin25.class);
        startActivity(intent);
    }
    public void onClickdn (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton129);
        Intent intent = new Intent(Barin24.this,Barin25.class);
        startActivity(intent);

    }
}
