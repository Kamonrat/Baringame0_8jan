package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music33 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music33);
    }
    public void onClickabg (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton734);
        Intent intent = new Intent(Music33.this,Music34.class);
        startActivity(intent);
    }
    public void onClickabh (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton735);
        Intent intent = new Intent(Music33.this,Music34.class);
        startActivity(intent);
    }
    public void onClickabi (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton736);
        Intent intent = new Intent(Music33.this,Music34.class);
        startActivity(intent);
    }
    public void onClickabj (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton737);
        Intent intent = new Intent(Music33.this,Music34.class);
        startActivity(intent);
        finish();
    }
}
