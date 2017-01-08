package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin4);
    }
    public void onClickai (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton46);
        Intent intent = new Intent(Barin4.this,Barin5.class);
        startActivity(intent);
    }
    public void onClickaj (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton47);
        Intent intent = new Intent(Barin4.this,Barin5.class);
        startActivity(intent);
    }
    public void onClickak (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton48);
        Intent intent = new Intent(Barin4.this,Barin5.class);
        startActivity(intent);
    }
    public void onClickal (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton49);
        Intent intent = new Intent(Barin4.this,Barin5.class);
        startActivity(intent);

    }
}
