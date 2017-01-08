package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music39 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music39);
    }
    public void onClickace (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton758);
        Intent intent = new Intent(Music39.this,Music40.class);
        startActivity(intent);
    }
    public void onClickacf (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton759);
        Intent intent = new Intent(Music39.this,Music40.class);
        startActivity(intent);
    }
    public void onClickacg (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton761);
        Intent intent = new Intent(Music39.this,Music40.class);
        startActivity(intent);
    }
    public void onClickach (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton762);
        Intent intent = new Intent(Music39.this,Music40.class);
        startActivity(intent);
    }
}
