package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin6);
    }
    public void onClickaq (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton54);
        Intent intent = new Intent(Barin6.this,Barin7.class);
        startActivity(intent);
    }
    public void onClickar (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton55);
        Intent intent = new Intent(Barin6.this,Barin7.class);
        startActivity(intent);
    }
    public void onClickas (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton56);
        Intent intent = new Intent(Barin6.this,Barin7.class);
        startActivity(intent);
    }
    public void onClickae (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton57);
        Intent intent = new Intent(Barin6.this,Barin7.class);
        startActivity(intent);
        finish();

    }
}
