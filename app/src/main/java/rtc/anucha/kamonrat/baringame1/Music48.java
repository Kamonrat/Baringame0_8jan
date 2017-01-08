package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music48 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music48);
    }
    public void onClickadq (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton794);
        Intent intent = new Intent(Music48.this,Music49.class);
        startActivity(intent);
    }
    public void onClickadr(View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton795);
        Intent intent = new Intent(Music48.this,Music49.class);
        startActivity(intent);
    }
    public void onClickads (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton796);
        Intent intent = new Intent(Music48.this,Music49.class);
        startActivity(intent);
    }
    public void onClickadt (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton797);
        Intent intent = new Intent(Music48.this,Music49.class);
        startActivity(intent);
    }
}
