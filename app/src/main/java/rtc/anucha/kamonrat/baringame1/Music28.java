package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music28 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music28);
    }
    public void onClickaam (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton714);
        Intent intent = new Intent(Music28.this,Music29.class);
        startActivity(intent);
    }
    public void onClickaan (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton715);
        Intent intent = new Intent(Music28.this,Music29.class);
        startActivity(intent);
    }
    public void onClickaao (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton716);
        Intent intent = new Intent(Music28.this,Music29.class);
        startActivity(intent);
    }
    public void onClickaap (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton717);
        Intent intent = new Intent(Music28.this,Music29.class);
        startActivity(intent);
    }
}
