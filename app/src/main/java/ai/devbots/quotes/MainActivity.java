package ai.devbots.quotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String[] quotes;
    private TextView quotesText;
    private Button bttn;

    // Which index of the Array of quotes am I displaying right now?
    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        quotes = new String[]{
                "When you don't create things, you become defined by your tastes rather than ability",
                "Programs must be written for people to read, and only incidentally for machines to execute.",
        };

        setContentView(R.layout.activity_main);
        quotesText = findViewById(R.id.quote_text);
        bttn = findViewById(R.id.button);

       setQuote(0);

    }

    private void setQuote(int index){
        quotesText.setText(quotes[index]);
    }
}
