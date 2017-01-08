package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music5);
    }
    public void onClickxc (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton622);
        Intent intent = new Intent(Music5.this,Music6.class);
        startActivity(intent);
    }
    public void onClickxd (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton623);
        Intent intent = new Intent(Music5.this,Music6.class);
        startActivity(intent);
    }
    public void onClickxe (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton624);
        Intent intent = new Intent(Music5.this,Music6.class);
        startActivity(intent);
    }
    public void onClickxf (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton625);
        Intent intent = new Intent(Music5.this,Music6.class);
        startActivity(intent);
    }
}
