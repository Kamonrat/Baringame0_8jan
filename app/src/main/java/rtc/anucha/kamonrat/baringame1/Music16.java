package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music16);
    }
    public void onClickyq (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton666);
        Intent intent = new Intent(Music16.this,Music17.class);
        startActivity(intent);
    }
    public void onClickyr (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton667);
        Intent intent = new Intent(Music16.this,Music17.class);
        startActivity(intent);
    }
    public void onClickys (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton668);
        Intent intent = new Intent(Music16.this,Music17.class);
        startActivity(intent);
    }
    public void onClickyt (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton669);
        Intent intent = new Intent(Music16.this,Music17.class);
        startActivity(intent);
        finish();
    }
}
