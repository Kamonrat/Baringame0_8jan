package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music12);
    }
    public void onClickya (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton651);
        Intent intent = new Intent(Music12.this,Music13.class);
        startActivity(intent);
    }
    public void onClickyb (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton652);
        Intent intent = new Intent(Music12.this,Music13.class);
        startActivity(intent);
    }
    public void onClickyc (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton653);
        Intent intent = new Intent(Music12.this,Music13.class);
        startActivity(intent);
    }
    public void onClickyd (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton654);
        Intent intent = new Intent(Music12.this,Music13.class);
        startActivity(intent);
    }
}
