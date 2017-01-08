package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music29 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music29);
    }
    public void onClickaaq (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton718);
        Intent intent = new Intent(Music29.this,Music30.class);
        startActivity(intent);
    }
    public void onClickaar (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton722);
        Intent intent = new Intent(Music29.this,Music30.class);
        startActivity(intent);
    }
    public void onClickaas (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton723);
        Intent intent = new Intent(Music29.this,Music30.class);
        startActivity(intent);
    }
    public void onClickaat (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton724);
        Intent intent = new Intent(Music29.this,Music30.class);
        startActivity(intent);

    }
}
