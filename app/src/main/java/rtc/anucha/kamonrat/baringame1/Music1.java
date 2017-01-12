package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music1);
    }
    public void onClickwq (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton606);
        Intent intent = new Intent(Music1.this,Music2.class);
        startActivity(intent);
    }
    public void onClickwr (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton607);
        Intent intent = new Intent(Music1.this,Music2.class);
        startActivity(intent);
    }
    public void onClickws (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton608);
        Intent intent = new Intent(Music1.this,Music2.class);
        startActivity(intent);
    }
    public void onClickwt (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton609);
        Intent intent = new Intent(Music1.this,Music2.class);
        startActivity(intent);
        finish();
    }
}
