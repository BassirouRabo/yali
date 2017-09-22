package yali.hkonnect.net.yalilearns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class TranscriptActivity extends AppCompatActivity {
    private static final String ARG_TRANSCRIPT = "transcript";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transcript);
        getSupportActionBar().hide();

        String transcript = getIntent().getStringExtra(ARG_TRANSCRIPT);
        TextView textViewTranscript = findViewById(R.id.textViewTranscript);
        if (transcript == null) finish();
        textViewTranscript.setText(transcript);
    }

    public void closePage(View view) {
        finish();
    }
}
