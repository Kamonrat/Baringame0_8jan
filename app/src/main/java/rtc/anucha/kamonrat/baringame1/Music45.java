package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music45 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music45);
    }
    public void onClickade (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton782);
        Intent intent = new Intent(Music45.this,Music46.class);
        startActivity(intent);
    }
    public void onClickadf (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton783);
        Intent intent = new Intent(Music45.this,Music46.class);
        startActivity(intent);
    }
    public void onClickadg (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton784);
        Intent intent = new Intent(Music45.this,Music46.class);
        startActivity(intent);
    }
    public void onClickadh (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton785);
        Intent intent = new Intent(Music45.this,Music46.class);
        startActivity(intent);
    }
}
