package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music19);
    }
    public void onClickzc (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton678);
        Intent intent = new Intent(Music19.this,Music20.class);
        startActivity(intent);
    }
    public void onClickzd (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton679);
        Intent intent = new Intent(Music19.this,Music20.class);
        startActivity(intent);
    }
    public void onClickze (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton680);
        Intent intent = new Intent(Music19.this,Music20.class);
        startActivity(intent);
    }
    public void onClickzf (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton681);
        Intent intent = new Intent(Music19.this,Music20.class);
        startActivity(intent);
        finish();
    }
}
