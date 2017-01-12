package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music6);
    }
    public void onClickxg (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton626);
        Intent intent = new Intent(Music6.this,Music7.class);
        startActivity(intent);
    }
    public void onClickxh (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton627);
        Intent intent = new Intent(Music6.this,Music7.class);
        startActivity(intent);
    }
    public void onClickxi (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton628);
        Intent intent = new Intent(Music6.this,Music7.class);
        startActivity(intent);
    }
    public void onClickxj (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton629);
        Intent intent = new Intent(Music6.this,Music7.class);
        startActivity(intent);
        finish();
    }
}
