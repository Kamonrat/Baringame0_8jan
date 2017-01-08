package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music37 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music37);
    }
    public void onClickabw (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton750);
        Intent intent = new Intent(Music37.this,Music38.class);
        startActivity(intent);
    }
    public void onClickabx (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton751);
        Intent intent = new Intent(Music37.this,Music38.class);
        startActivity(intent);
    }
    public void onClickaby (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton752);
        Intent intent = new Intent(Music37.this,Music38.class);
        startActivity(intent);
    }
    public void onClickabz (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton753);
        Intent intent = new Intent(Music37.this,Music38.class);
        startActivity(intent);
    }
}
