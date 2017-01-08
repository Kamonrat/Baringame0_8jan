package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music26 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music26);
    }
    public void onClickaae (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton706);
        Intent intent = new Intent(Music26.this,Music27.class);
        startActivity(intent);
    }
    public void onClickaaf (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton707);
        Intent intent = new Intent(Music26.this,Music27.class);
        startActivity(intent);
    }
    public void onClickaag (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton708);
        Intent intent = new Intent(Music26.this,Music27.class);
        startActivity(intent);
    }
    public void onClickaah (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton709);
        Intent intent = new Intent(Music26.this,Music27.class);
        startActivity(intent);
    }
}
