package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music13);
    }
    public void onClickye (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton650);
        Intent intent = new Intent(Music13.this,Music14.class);
        startActivity(intent);
    }
    public void onClickyf (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton655);
        Intent intent = new Intent(Music13.this,Music14.class);
        startActivity(intent);
    }
    public void onClickyg (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton656);
        Intent intent = new Intent(Music13.this,Music14.class);
        startActivity(intent);
    }
    public void onClickyh (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton657);
        Intent intent = new Intent(Music13.this,Music14.class);
        startActivity(intent);
    }
}
