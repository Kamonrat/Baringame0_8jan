package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin33 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin33);
    }
    public void onClickeu (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton162);
        Intent intent = new Intent(Barin33.this,Barin34.class);
        startActivity(intent);
    }
    public void onClickev (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton163);
        Intent intent = new Intent(Barin33.this,Barin34.class);
        startActivity(intent);
    }
    public void onClickew (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton164);
        Intent intent = new Intent(Barin33.this,Barin34.class);
        startActivity(intent);
    }
    public void onClickex (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton165);
        Intent intent = new Intent(Barin33.this,Barin34.class);
        startActivity(intent);
    }
}
