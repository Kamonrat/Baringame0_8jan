package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music21);
    }
    public void onClickzk (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton686);
        Intent intent = new Intent(Music21.this,Music22.class);
        startActivity(intent);
    }
    public void onClickzl (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton687);
        Intent intent = new Intent(Music21.this,Music22.class);
        startActivity(intent);
    }
    public void onClickzm (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton688);
        Intent intent = new Intent(Music21.this,Music22.class);
        startActivity(intent);
    }
    public void onClickzn (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton689);
        Intent intent = new Intent(Music21.this,Music22.class);
        startActivity(intent);
    }
}
