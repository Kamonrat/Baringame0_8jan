package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music32 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music32);
    }
    public void onClickabc (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton730);
        Intent intent = new Intent(Music32.this,Music33.class);
        startActivity(intent);
    }
    public void onClickabd (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton731);
        Intent intent = new Intent(Music32.this,Music33.class);
        startActivity(intent);
    }
    public void onClickabe (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton732);
        Intent intent = new Intent(Music32.this,Music33.class);
        startActivity(intent);
    }
    public void onClickabf (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton733);
        Intent intent = new Intent(Music32.this,Music33.class);
        startActivity(intent);
        finish();
    }
}
