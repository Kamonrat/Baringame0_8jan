package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music17);
    }
    public void onClickyu (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton670);
        Intent intent = new Intent(Music17.this,Music18.class);
        startActivity(intent);
    }
    public void onClickyv (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton671);
        Intent intent = new Intent(Music17.this,Music18.class);
        startActivity(intent);
    }
    public void onClickyw (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton672);
        Intent intent = new Intent(Music17.this,Music18.class);
        startActivity(intent);
    }
    public void onClickyx (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton673);
        Intent intent = new Intent(Music17.this,Music18.class);
        startActivity(intent);
    }
}
