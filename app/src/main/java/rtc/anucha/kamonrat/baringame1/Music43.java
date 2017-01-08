package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music43 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music43);
    }
    public void onClickacu (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton774);
        Intent intent = new Intent(Music43.this,Music44.class);
        startActivity(intent);
    }
    public void onClickacv (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton775);
        Intent intent = new Intent(Music43.this,Music44.class);
        startActivity(intent);
    }
    public void onClickacw (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton776);
        Intent intent = new Intent(Music43.this,Music44.class);
        startActivity(intent);
    }
    public void onClickacx (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton777);
        Intent intent = new Intent(Music43.this,Music44.class);
        startActivity(intent);
    }
}
