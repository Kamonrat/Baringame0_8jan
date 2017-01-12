package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music49 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music49);
    }
    public void onClickadu (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton798);
        Intent intent = new Intent(Music49.this,Music50.class);
        startActivity(intent);
    }
    public void onClickadv(View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton799);
        Intent intent = new Intent(Music49.this,Music50.class);
        startActivity(intent);
    }
    public void onClickadw (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton800);
        Intent intent = new Intent(Music49.this,Music50.class);
        startActivity(intent);
    }
    public void onClickadx (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton801);
        Intent intent = new Intent(Music49.this,Music50.class);
        startActivity(intent);
        finish();
    }
}
