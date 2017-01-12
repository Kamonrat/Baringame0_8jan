package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music47 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music47);
    }
    public void onClickadm (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton788);
        Intent intent = new Intent(Music47.this,Music48.class);
        startActivity(intent);
    }
    public void onClickadn (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton791);
        Intent intent = new Intent(Music47.this,Music48.class);
        startActivity(intent);
    }
    public void onClickado (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton792);
        Intent intent = new Intent(Music47.this,Music48.class);
        startActivity(intent);
    }
    public void onClickadp (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton793);
        Intent intent = new Intent(Music47.this,Music48.class);
        startActivity(intent);
        finish();
    }
}
