package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music14);
    }
    public void onClickyi (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton658);
        Intent intent = new Intent(Music14.this,Music15.class);
        startActivity(intent);
    }
    public void onClickyj (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton659);
        Intent intent = new Intent(Music14.this,Music15.class);
        startActivity(intent);
    }
    public void onClickyk (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton660);
        Intent intent = new Intent(Music14.this,Music15.class);
        startActivity(intent);
    }
    public void onClickyl (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton661);
        Intent intent = new Intent(Music14.this,Music15.class);
        startActivity(intent);
        finish();
    }
}
