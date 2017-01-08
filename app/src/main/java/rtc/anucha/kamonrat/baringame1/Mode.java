package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Mode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode);
    }
    public void onClicka (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton);
        Intent intent = new Intent(Mode.this,Barin1.class);
        startActivity(intent);
    }
    public void onClickb (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton2);
        Intent intent = new Intent(Mode.this,Dara1.class);
        startActivity(intent);
    }
    public void onClickk (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton3);
        Intent intent = new Intent(Mode.this,Animal1.class);
        startActivity(intent);
    }
    public void onClickz (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton4);
        Intent intent = new Intent(Mode.this,Music1.class);
        startActivity(intent);


    }
}
