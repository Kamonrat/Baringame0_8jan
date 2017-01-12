package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music18);
    }
    public void onClickyy (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton674);
        Intent intent = new Intent(Music18.this,Music19.class);
        startActivity(intent);
    }
    public void onClickyz (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton675);
        Intent intent = new Intent(Music18.this,Music19.class);
        startActivity(intent);
    }
    public void onClickza (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton676);
        Intent intent = new Intent(Music18.this,Music19.class);
        startActivity(intent);
    }
    public void onClickzb (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton677);
        Intent intent = new Intent(Music18.this,Music19.class);
        startActivity(intent);
        finish();
    }
}
