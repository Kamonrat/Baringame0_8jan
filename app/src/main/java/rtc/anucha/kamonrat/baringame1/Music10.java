package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music10);
    }
    public void onClickxs (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton642);
        Intent intent = new Intent(Music10.this,Music11.class);
        startActivity(intent);
    }
    public void onClickxt (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton643);
        Intent intent = new Intent(Music10.this,Music11.class);
        startActivity(intent);
    }
    public void onClickxu (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton644);
        Intent intent = new Intent(Music10.this,Music11.class);
        startActivity(intent);
    }
    public void onClickxv (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton645);
        Intent intent = new Intent(Music10.this,Music11.class);
        startActivity(intent);
        finish();
    }
}
