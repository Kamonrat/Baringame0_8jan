package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music35 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music35);
    }
    public void onClickabo (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton742);
        Intent intent = new Intent(Music35.this,Music36.class);
        startActivity(intent);
    }
    public void onClickabp (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton743);
        Intent intent = new Intent(Music35.this,Music36.class);
        startActivity(intent);
    }
    public void onClickabq (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton744);
        Intent intent = new Intent(Music35.this,Music36.class);
        startActivity(intent);
    }
    public void onClickabr (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton745);
        Intent intent = new Intent(Music35.this,Music36.class);
        startActivity(intent);
    }
}
