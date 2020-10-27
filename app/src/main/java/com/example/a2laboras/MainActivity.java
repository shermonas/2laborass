package com.example.a2laboras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spCountingOption;
    private EditText edEnteredText;
    private TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.spCountingOption = findViewById(R.id.spCountingOption);
        this.edEnteredText = findViewById(R.id.edEnteredText);
        this.tvResult = findViewById(R.id.tvResult);

        this.spCountingOption = findViewById(R.id.spCountingOption);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.selection_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spCountingOption.setAdapter(adapter);

    }

    public void onBtnShowResultClick(View view) {
        Toast.makeText(this, this.spCountingOption.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
        if (this.spCountingOption.getSelectedItem().toString().equalsIgnoreCase(getString(R.string.selection_chars))) {
            this.tvResult.setText(String.valueOf(this.edEnteredText.getText().toString().length()));

            String result;
            int userInputLength;
            int wCounter = 0;
            if (userInputLength > 0) {
                CharSequence userInput;
                if (result.equals("Words")) {

                    char[] userInputCharacters = new char[userInputLength];
                    for (int i = 0; i < userInputLength; i++) {
                        userInputCharacters[i] = userInput.charAt(i);
                        wCounter++;
                    }

                } else if (result.equals("Chars")) {
                    this.tvResult.setText(Integer.toString(userInput.length()));
                } else {
                    Toast.makeText(this, "Blank", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}