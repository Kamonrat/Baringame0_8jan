package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music24 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music24);
    }
    public void onClickzw (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton698);
        Intent intent = new Intent(Music24.this,Music25.class);
        startActivity(intent);
    }
    public void onClickzx (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton699);
        Intent intent = new Intent(Music24.this,Music25.class);
        startActivity(intent);
    }
    public void onClickzy (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton700);
        Intent intent = new Intent(Music24.this,Music25.class);
        startActivity(intent);
    }
    public void onClickzz (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton701);
        Intent intent = new Intent(Music24.this,Music25.class);
        startActivity(intent);
    }
}
