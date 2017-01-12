package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music22);
    }
    public void onClickzo (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton694);
        Intent intent = new Intent(Music22.this,Music23.class);
        startActivity(intent);
    }
    public void onClickzp (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton695);
        Intent intent = new Intent(Music22.this,Music23.class);
        startActivity(intent);
    }
    public void onClickzq (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton696);
        Intent intent = new Intent(Music22.this,Music23.class);
        startActivity(intent);
    }
    public void onClickzr (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton697);
        Intent intent = new Intent(Music22.this,Music23.class);
        startActivity(intent);
        finish();
    }
}
