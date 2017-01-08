package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal11);
    }
    public void onClickqm (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton445);
        Intent intent = new Intent(Animal11.this, Animal12.class);
        startActivity(intent);
    }
    public void onClickqn (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton447);
        Intent intent = new Intent(Animal11.this, Animal12.class);
        startActivity(intent);
    }
    public void onClickqo (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton448);
        Intent intent = new Intent(Animal11.this, Animal12.class);
        startActivity(intent);
    }
    public void onClickqp (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton449);
        Intent intent = new Intent(Animal11.this,Animal12.class);
        startActivity(intent);
    }
}
