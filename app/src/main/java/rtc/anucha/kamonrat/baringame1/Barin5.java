package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin5);
    }
    public void onClickaa (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton50);
        Intent intent = new Intent(Barin5.this,Barin6.class);
        startActivity(intent);
    }
    public void onClickat (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton51);
        Intent intent = new Intent(Barin5.this,Barin6.class);
        startActivity(intent);
    }
    public void onClickao (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton52);
        Intent intent = new Intent(Barin5.this,Barin6.class);
        startActivity(intent);
    }
    public void onClickap (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton53);
        Intent intent = new Intent(Barin5.this,Barin6.class);
        startActivity(intent);
    }
}
