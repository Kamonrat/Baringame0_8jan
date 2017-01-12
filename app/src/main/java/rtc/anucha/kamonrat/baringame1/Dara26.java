package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara26 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara26);
    }
    public void onClicklk (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton326);
        Intent intent = new Intent(Dara26.this, Dara27.class);
        startActivity(intent);
    }
    public void onClickll (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton327);
        Intent intent = new Intent(Dara26.this, Dara27.class);
        startActivity(intent);
    }
    public void onClicklm (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton328);
        Intent intent = new Intent(Dara26.this, Dara27.class);
        startActivity(intent);
    }
    public void onClickln (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton329);
        Intent intent = new Intent(Dara26.this, Dara27.class);
        startActivity(intent);
        finish();
    }
}
