package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music27 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music27);
    }
    public void onClickaai (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton710);
        Intent intent = new Intent(Music27.this,Music28.class);
        startActivity(intent);
    }
    public void onClickaaj (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton711);
        Intent intent = new Intent(Music27.this,Music28.class);
        startActivity(intent);
    }
    public void onClickaak (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton712);
        Intent intent = new Intent(Music27.this,Music28.class);
        startActivity(intent);
    }
    public void onClickaal (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton713);
        Intent intent = new Intent(Music27.this,Music28.class);
        startActivity(intent);
    }
}
