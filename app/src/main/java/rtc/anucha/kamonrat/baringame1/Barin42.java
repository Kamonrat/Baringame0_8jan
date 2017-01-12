package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin42 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin42);
    }
    public void onClickge (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton198);
        Intent intent = new Intent(Barin42.this,Barin43.class);
        startActivity(intent);
    }
    public void onClickgf (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton199);
        Intent intent = new Intent(Barin42.this,Barin43.class);
        startActivity(intent);
    }
    public void onClickgg (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton200);
        Intent intent = new Intent(Barin42.this,Barin43.class);
        startActivity(intent);
    }
    public void onClickgh (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton201);
        Intent intent = new Intent(Barin42.this,Barin43.class);
        startActivity(intent);
        finish();
    }
}
