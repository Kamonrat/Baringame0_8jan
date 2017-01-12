package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music46 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music46);
    }
    public void onClickadi (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton786);
        Intent intent = new Intent(Music46.this,Music47.class);
        startActivity(intent);
    }
    public void onClickadj (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton787);
        Intent intent = new Intent(Music46.this,Music47.class);
        startActivity(intent);
    }
    public void onClickadk (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton789);
        Intent intent = new Intent(Music46.this,Music47.class);
        startActivity(intent);
    }
    public void onClickadl (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton790);
        Intent intent = new Intent(Music46.this,Music47.class);
        startActivity(intent);
        finish();
    }
}
