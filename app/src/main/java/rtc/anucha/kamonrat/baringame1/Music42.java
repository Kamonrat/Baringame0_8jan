package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music42 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music42);
    }
    public void onClickacq (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton770);
        Intent intent = new Intent(Music42.this,Music43.class);
        startActivity(intent);
    }
    public void onClickacr (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton771);
        Intent intent = new Intent(Music42.this,Music43.class);
        startActivity(intent);
    }
    public void onClickacs (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton772);
        Intent intent = new Intent(Music42.this,Music43.class);
        startActivity(intent);
    }
    public void onClickact (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton773);
        Intent intent = new Intent(Music42.this,Music43.class);
        startActivity(intent);
    }
}
