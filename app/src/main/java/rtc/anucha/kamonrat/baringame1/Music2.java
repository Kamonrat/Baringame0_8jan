package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music2);
    }
    public void onClickwu (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton610);
        Intent intent = new Intent(Music2.this,Music3.class);
        startActivity(intent);
    }
    public void onClickwv (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton611);
        Intent intent = new Intent(Music2.this,Music3.class);
        startActivity(intent);
    }
    public void onClickww (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton612);
        Intent intent = new Intent(Music2.this,Music3.class);
        startActivity(intent);
    }
    public void onClickwx (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton613);
        Intent intent = new Intent(Music2.this,Music3.class);
        startActivity(intent);
    }
}
