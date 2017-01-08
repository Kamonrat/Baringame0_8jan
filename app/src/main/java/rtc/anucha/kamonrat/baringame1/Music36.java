package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music36 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music36);
    }
    public void onClickabs (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton746);
        Intent intent = new Intent(Music36.this,Music37.class);
        startActivity(intent);
    }
    public void onClickabt (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton747);
        Intent intent = new Intent(Music36.this,Music37.class);
        startActivity(intent);
    }
    public void onClickabu (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton748);
        Intent intent = new Intent(Music36.this,Music37.class);
        startActivity(intent);
    }
    public void onClickabv (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton749);
        Intent intent = new Intent(Music36.this,Music37.class);
        startActivity(intent);
    }
}
