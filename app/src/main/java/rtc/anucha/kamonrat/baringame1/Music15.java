package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music15);
    }
    public void onClickym (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton662);
        Intent intent = new Intent(Music15.this,Music16.class);
        startActivity(intent);
    }
    public void onClickyn (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton663);
        Intent intent = new Intent(Music15.this,Music16.class);
        startActivity(intent);
    }
    public void onClickyo (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton664);
        Intent intent = new Intent(Music15.this,Music16.class);
        startActivity(intent);
    }
    public void onClickyp (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton665);
        Intent intent = new Intent(Music15.this,Music16.class);
        startActivity(intent);
    }
}
