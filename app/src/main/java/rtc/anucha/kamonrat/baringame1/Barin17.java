package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin17);
    }
    public void onClickci (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton98);
        Intent intent = new Intent(Barin17.this,Barin18.class);
        startActivity(intent);
    }
    public void onClickcj (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton100);
        Intent intent = new Intent(Barin17.this,Barin18.class);
        startActivity(intent);
    }
    public void onClickck (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton101);
        Intent intent = new Intent(Barin17.this,Barin18.class);
        startActivity(intent);
    }
    public void onClickcl (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton102);
        Intent intent = new Intent(Barin17.this,Barin18.class);
        startActivity(intent);
    }
}
