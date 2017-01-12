package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music34 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music34);
    }
    public void onClickabk (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton738);
        Intent intent = new Intent(Music34.this,Music35.class);
        startActivity(intent);
    }
    public void onClickabl (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton739);
        Intent intent = new Intent(Music34.this,Music35.class);
        startActivity(intent);
    }
    public void onClickabm (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton740);
        Intent intent = new Intent(Music34.this,Music35.class);
        startActivity(intent);
    }
    public void onClickabn (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton741);
        Intent intent = new Intent(Music34.this,Music35.class);
        startActivity(intent);
        finish();
    }
}
