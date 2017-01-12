package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music23 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music23);
    }
    public void onClickzs (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton690);
        Intent intent = new Intent(Music23.this,Music24.class);
        startActivity(intent);
    }
    public void onClickzt (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton691);
        Intent intent = new Intent(Music23.this,Music24.class);
        startActivity(intent);
    }
    public void onClickzu (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton692);
        Intent intent = new Intent(Music23.this,Music24.class);
        startActivity(intent);
    }
    public void onClickzv (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton693);
        Intent intent = new Intent(Music23.this,Music24.class);
        startActivity(intent);
        finish();
    }
}
