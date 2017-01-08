package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music38 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music38);
    }
    public void onClickaca (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton754);
        Intent intent = new Intent(Music38.this,Music39.class);
        startActivity(intent);
    }
    public void onClickacb (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton755);
        Intent intent = new Intent(Music38.this,Music39.class);
        startActivity(intent);
    }
    public void onClickacc (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton756);
        Intent intent = new Intent(Music38.this,Music39.class);
        startActivity(intent);
    }
    public void onClickacd (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton757);
        Intent intent = new Intent(Music38.this,Music39.class);
        startActivity(intent);
    }
}
