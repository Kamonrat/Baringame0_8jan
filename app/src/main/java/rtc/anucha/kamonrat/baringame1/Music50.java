package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music50 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music50);
    }
    public void onClickady (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton802);
        Intent intent = new Intent(Music50.this,Music50.class);
        startActivity(intent);
    }
    public void onClickadz(View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton803);
        Intent intent = new Intent(Music50.this,Music50.class);
        startActivity(intent);
    }
    public void onClickaea (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton804);
        Intent intent = new Intent(Music50.this,Music50.class);
        startActivity(intent);
    }
    public void onClickaeb (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton805);
        Intent intent = new Intent(Music50.this,Music50.class);
        startActivity(intent);
        finish();
    }
}
