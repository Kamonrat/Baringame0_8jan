package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin32 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin32);
    }
    public void onClickeeo (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton158);
        Intent intent = new Intent(Barin32.this,Barin33.class);
        startActivity(intent);
    }
    public void onClicker (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton159);
        Intent intent = new Intent(Barin32.this,Barin33.class);
        startActivity(intent);
    }
    public void onClickes (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton160);
        Intent intent = new Intent(Barin32.this,Barin33.class);
        startActivity(intent);
    }
    public void onClicket (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton161);
        Intent intent = new Intent(Barin32.this,Barin33.class);
        startActivity(intent);
        finish();
    }
}
