package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music11);
    }
    public void onClickxw (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton646);
        Intent intent = new Intent(Music11.this,Music12.class);
        startActivity(intent);
    }
    public void onClickxx (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton647);
        Intent intent = new Intent(Music11.this,Music12.class);
        startActivity(intent);
    }
    public void onClickxy (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton648);
        Intent intent = new Intent(Music11.this,Music12.class);
        startActivity(intent);
    }
    public void onClickxz (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton649);
        Intent intent = new Intent(Music11.this,Music12.class);
        startActivity(intent);
    }
}
