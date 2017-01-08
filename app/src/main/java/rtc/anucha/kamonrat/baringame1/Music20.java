package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music20);
    }
    public void onClickzg (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton682);
        Intent intent = new Intent(Music20.this,Music21.class);
        startActivity(intent);
    }
    public void onClickzh (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton683);
        Intent intent = new Intent(Music20.this,Music21.class);
        startActivity(intent);
    }
    public void onClickzi (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton684);
        Intent intent = new Intent(Music20.this,Music21.class);
        startActivity(intent);
    }
    public void onClickzj (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton685);
        Intent intent = new Intent(Music20.this,Music21.class);
        startActivity(intent);
    }
}
