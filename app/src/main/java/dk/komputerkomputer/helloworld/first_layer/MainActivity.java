package dk.komputerkomputer.helloworld.first_layer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import dk.komputerkomputer.helloworld.R;
import dk.komputerkomputer.helloworld.second_layer.MainActivity2;
import dk.komputerkomputer.helloworld.second_layer.MainActivity3;
import dk.komputerkomputer.helloworld.second_layer.MainActivity4;
import dk.komputerkomputer.helloworld.second_layer.MainActivity5;
import dk.komputerkomputer.helloworld.second_layer.MainActivity6;
import dk.komputerkomputer.helloworld.second_layer.MainActivity7;

@SuppressWarnings({"FieldMayBeFinal", "CanBeFinal"})
public class MainActivity extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_baseline_notes_24);

        setContentView(R.layout.activity_main);
        //TODO:: complete this

        try {
            load();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            load2();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            load3();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            load4();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            load5();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            load6();
        } catch (Exception e) {
            e.printStackTrace();
        }

        EditText editText = findViewById(R.id.textView1mTwo);
        EditText editText2 = findViewById(R.id.textView2mTwo);
        EditText editText3 = findViewById(R.id.textView3mTwo);
        EditText editText4 = findViewById(R.id.textView4mTwo);
        EditText editText5 = findViewById(R.id.textView5mTwo);
        EditText editText6 = findViewById(R.id.textView6mTwo);


        //TODO MAYBE MAKE LONGPRESS AND DOUBLETAP ACCESS NOTESPACES AND SINGLE CLICK EDIT AS NOW

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                save();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editText.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    enterNoteCollectionSpace();
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    enterNoteCollectionSpace();
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });

        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                save2();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editText2.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    enterNoteCollectionSpace2();
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    enterNoteCollectionSpace2();
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });

        editText3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                save3();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editText3.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    enterNoteCollectionSpace3();
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    enterNoteCollectionSpace3();
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });

        editText4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                save4();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editText4.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    enterNoteCollectionSpace4();
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    enterNoteCollectionSpace4();
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });

        editText5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                save5();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editText5.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    enterNoteCollectionSpace5();
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    enterNoteCollectionSpace5();
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });

        editText6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                save6();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editText6.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    enterNoteCollectionSpace6();
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    enterNoteCollectionSpace6();
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

    //TODO Make Interface

    //TODO WRITE METHOD REFRESH

    //TODO MAKE SAVE ON LONGPRESS DOUBLETAP WHILST CHANGING SCREEN

    public void enterNoteCollectionSpace() {
        Intent secondActivityIntent = new Intent(this, MainActivity2.class);
        startActivity(secondActivityIntent);
    }

    public void enterNoteCollectionSpace2() {
        Intent secondActivityIntent = new Intent(this, MainActivity3.class);
        startActivity(secondActivityIntent);
    }

    public void enterNoteCollectionSpace3() {
        Intent secondActivityIntent = new Intent(this, MainActivity4.class);
        startActivity(secondActivityIntent);
    }

    public void enterNoteCollectionSpace4() {
        Intent secondActivityIntent = new Intent(this, MainActivity5.class);
        startActivity(secondActivityIntent);
    }

    public void enterNoteCollectionSpace5() {
        Intent secondActivityIntent = new Intent(this, MainActivity6.class);
        startActivity(secondActivityIntent);
    }

    public void enterNoteCollectionSpace6() {
        Intent secondActivityIntent = new Intent(this, MainActivity7.class);
        startActivity(secondActivityIntent);
    }

    public void save() {
        EditText edtEmTwo = findViewById(R.id.textView1mTwo);
        try {
            FileOutputStream fos = openFileOutput("MainActivity11", Context.MODE_PRIVATE);
            fos.write(edtEmTwo.getText().toString().getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save2() {
        EditText edtEmTwo = findViewById(R.id.textView2mTwo);
        try {
            FileOutputStream fos = openFileOutput("MainActivity12", Context.MODE_PRIVATE);
            fos.write(edtEmTwo.getText().toString().getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save3() {
        EditText edtEmTwo = findViewById(R.id.textView3mTwo);
        try {
            FileOutputStream fos = openFileOutput("MainActivity13", Context.MODE_PRIVATE);
            fos.write(edtEmTwo.getText().toString().getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save4() {
        EditText edtEmTwo = findViewById(R.id.textView4mTwo);
        try {
            FileOutputStream fos = openFileOutput("MainActivity14", Context.MODE_PRIVATE);
            fos.write(edtEmTwo.getText().toString().getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save5() {
        EditText edtEmTwo = findViewById(R.id.textView5mTwo);
        try {
            FileOutputStream fos = openFileOutput("MainActivity15", Context.MODE_PRIVATE);
            fos.write(edtEmTwo.getText().toString().getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save6() {
        EditText edtEmTwo = findViewById(R.id.textView6mTwo);
        try {
            FileOutputStream fos = openFileOutput("MainActivity16", Context.MODE_PRIVATE);
            fos.write(edtEmTwo.getText().toString().getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void load() {
        EditText edtEmTwo = findViewById(R.id.textView1mTwo);
        StringBuilder stringBuilder = null;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity11")));
            String inputString;
            stringBuilder = new StringBuilder();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuilder.append(inputString);
            }
            edtEmTwo.setText(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load2() {
        EditText edtEmTwo = findViewById(R.id.textView2mTwo);
        StringBuilder stringBuilder = null;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity12")));
            String inputString;
            stringBuilder = new StringBuilder();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuilder.append(inputString);
            }
            edtEmTwo.setText(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load3() {
        EditText edtEmTwo = findViewById(R.id.textView3mTwo);
        StringBuilder stringBuilder = null;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity13")));
            String inputString;
            stringBuilder = new StringBuilder();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuilder.append(inputString);
            }
            edtEmTwo.setText(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load4() {
        EditText edtEmTwo = findViewById(R.id.textView4mTwo);
        StringBuilder stringBuilder = null;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity14")));
            String inputString;
            stringBuilder = new StringBuilder();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuilder.append(inputString);
            }
            edtEmTwo.setText(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load5() {
        EditText edtEmTwo = findViewById(R.id.textView5mTwo);
        StringBuilder stringBuilder = null;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity15")));
            String inputString;
            stringBuilder = new StringBuilder();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuilder.append(inputString);
            }
            edtEmTwo.setText(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load6() {
        EditText edtEmTwo = findViewById(R.id.textView6mTwo);
        StringBuffer stringBuffer = null;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity16")));
            String inputString;
            stringBuffer = new StringBuffer();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuffer.append(inputString);
            }
            edtEmTwo.setText(stringBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

