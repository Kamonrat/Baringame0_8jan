package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music4);
    }
    public void onClickwy (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton614);
        Intent intent = new Intent(Music4.this,Music5.class);
        startActivity(intent);
    }
    public void onClickwz (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton615);
        Intent intent = new Intent(Music4.this,Music5.class);
        startActivity(intent);
    }
    public void onClickxa (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton616);
        Intent intent = new Intent(Music4.this,Music5.class);
        startActivity(intent);
    }
    public void onClickxb (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton617);
        Intent intent = new Intent(Music4.this,Music5.class);
        startActivity(intent);
    }
}
