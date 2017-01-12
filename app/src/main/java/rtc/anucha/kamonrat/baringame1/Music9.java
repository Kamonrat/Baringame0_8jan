package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music9);
    }
    public void onClickxo (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton638);
        Intent intent = new Intent(Music9.this,Music10.class);
        startActivity(intent);
    }
    public void onClickxp (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton639);
        Intent intent = new Intent(Music9.this,Music10.class);
        startActivity(intent);
    }
    public void onClickxq (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton640);
        Intent intent = new Intent(Music9.this,Music10.class);
        startActivity(intent);
    }
    public void onClickxr (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton641);
        Intent intent = new Intent(Music9.this,Music10.class);
        startActivity(intent);
        finish();
    }
}
