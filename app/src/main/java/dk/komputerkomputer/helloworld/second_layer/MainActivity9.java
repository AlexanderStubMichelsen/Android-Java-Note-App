package dk.komputerkomputer.helloworld.second_layer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

import dk.komputerkomputer.helloworld.R;
import dk.komputerkomputer.helloworld.first_layer.MainActivity;

@SuppressWarnings({"FieldMayBeFinal", "CanBeFinal"})
public class MainActivity9 extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        EditText note = findViewById(R.id.note);

        Note_Func note_func = new Note_Func();

        String file = "MainActivity2.9";

        note.setText(note_func.load(getApplicationContext(), file));

        note.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = note.getText().toString();
                note_func.save(getApplicationContext(), text, file);
//                Toast.makeText(getApplicationContext(), "Save", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        note.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    enterNoteFrontPage();
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    enterNoteFrontPage();
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });
    }

    //TODO Button Back, Save, Load.
    public void enterNoteFrontPage() {
        Intent firstActivityIntent = new Intent(this, MainActivity.class);
        startActivity(firstActivityIntent);
    }
}
