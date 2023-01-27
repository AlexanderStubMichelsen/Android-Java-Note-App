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
import java.util.Objects;

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

        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
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

        EditText NoteTitle1 = findViewById(R.id.NoteTitle1);
        EditText NoteTitle2 = findViewById(R.id.NoteTitle2);
        EditText NoteTitle3 = findViewById(R.id.NoteTitle3);
        EditText NoteTitle4 = findViewById(R.id.NoteTitle4);
        EditText NoteTitle5 = findViewById(R.id.NoteTitle5);
        EditText NoteTitle6 = findViewById(R.id.NoteTitle6);
        EditText NoteTitle7 = findViewById(R.id.NoteTitle6);
        EditText NoteTitle8 = findViewById(R.id.NoteTitle6);
        EditText NoteTitle9 = findViewById(R.id.NoteTitle6);
        EditText NoteTitle10 = findViewById(R.id.NoteTitle6);
        EditText NoteTitle11 = findViewById(R.id.NoteTitle6);


        //TODO MAYBE MAKE LONGPRESS AND DOUBLETAP ACCESS NOTESPACES AND SINGLE CLICK EDIT AS NOW

        NoteTitle1.addTextChangedListener(new TextWatcher() {
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

        NoteTitle1.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    enterNote1();
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    enterNote1();
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });

        NoteTitle2.addTextChangedListener(new TextWatcher() {
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

        NoteTitle2.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    enterNote2();
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    enterNote2();
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });

        NoteTitle3.addTextChangedListener(new TextWatcher() {
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

        NoteTitle3.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    enterNote3();
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    enterNote3();
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });

        NoteTitle4.addTextChangedListener(new TextWatcher() {
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

        NoteTitle4.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    enterNote4();
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    enterNote4();
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });

        NoteTitle5.addTextChangedListener(new TextWatcher() {
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

        NoteTitle5.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    enterNote5();
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    enterNote5();
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });

        NoteTitle6.addTextChangedListener(new TextWatcher() {
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

        NoteTitle6.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    enterNote6();
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    enterNote6();
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });

        NoteTitle7.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                save7();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        NoteTitle7.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
//                    enterNoteCollectionSpace7();
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
//                    enterNoteCollectionSpace7();
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });

        NoteTitle8.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                save8();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        NoteTitle8.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
//                    enterNoteCollectionSpace8();
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
//                    enterNoteCollectionSpace8();
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });
        NoteTitle9.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                save9();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        NoteTitle9.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
//                    enterNoteCollectionSpace9();
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
//                    enterNoteCollectionSpace9();
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });
        NoteTitle10.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                save10();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        NoteTitle10.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
//                    enterNoteCollectionSpace10();
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
//                    enterNoteCollectionSpace10();
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });
        NoteTitle11.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                save11();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        NoteTitle11.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
//                    enterNoteCollectionSpace11();
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
//                    enterNoteCollectionSpace11();
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

    public void enterNote1() {
        Intent secondActivityIntent = new Intent(this, MainActivity2.class);
        startActivity(secondActivityIntent);
    }

    public void enterNote2() {
        Intent secondActivityIntent = new Intent(this, MainActivity3.class);
        startActivity(secondActivityIntent);
    }

    public void enterNote3() {
        Intent secondActivityIntent = new Intent(this, MainActivity4.class);
        startActivity(secondActivityIntent);
    }

    public void enterNote4() {
        Intent secondActivityIntent = new Intent(this, MainActivity5.class);
        startActivity(secondActivityIntent);
    }

    public void enterNote5() {
        Intent secondActivityIntent = new Intent(this, MainActivity6.class);
        startActivity(secondActivityIntent);
    }

    public void enterNote6() {
        Intent secondActivityIntent = new Intent(this, MainActivity7.class);
        startActivity(secondActivityIntent);
    }
/*
    public void enterNote7() {
        Intent secondActivityIntent = new Intent(this, MainActivity8.class);
        startActivity(secondActivityIntent);
    }

    public void enterNote8() {
        Intent secondActivityIntent = new Intent(this, MainActivity9.class);
        startActivity(secondActivityIntent);
    }

    public void enterNote9() {
        Intent secondActivityIntent = new Intent(this, MainActivity10.class);
        startActivity(secondActivityIntent);
    }

    public void enterNote10() {
        Intent secondActivityIntent = new Intent(this, MainActivity11.class);
        startActivity(secondActivityIntent);
    }

    public void enterNote11() {
        Intent secondActivityIntent = new Intent(this, MainActivity12.class);
        startActivity(secondActivityIntent);
    }*/

    public void save() {
        EditText NoteTitle1 = findViewById(R.id.NoteTitle1);
        try {
            FileOutputStream fos = openFileOutput("MainActivity11", Context.MODE_PRIVATE);
            fos.write(NoteTitle1.getText().toString().getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save2() {
        EditText NoteTitle2 = findViewById(R.id.NoteTitle2);
        try {
            FileOutputStream fos = openFileOutput("MainActivity12", Context.MODE_PRIVATE);
            fos.write(NoteTitle2.getText().toString().getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save3() {
        EditText NoteTitle3 = findViewById(R.id.NoteTitle3);
        try {
            FileOutputStream fos = openFileOutput("MainActivity13", Context.MODE_PRIVATE);
            fos.write(NoteTitle3.getText().toString().getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save4() {
        EditText NoteTitle4 = findViewById(R.id.NoteTitle4);
        try {
            FileOutputStream fos = openFileOutput("MainActivity14", Context.MODE_PRIVATE);
            fos.write(NoteTitle4.getText().toString().getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save5() {
        EditText NoteTitle5 = findViewById(R.id.NoteTitle5);
        try {
            FileOutputStream fos = openFileOutput("MainActivity15", Context.MODE_PRIVATE);
            fos.write(NoteTitle5.getText().toString().getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save6() {
        EditText NoteTitle6 = findViewById(R.id.NoteTitle6);
        try {
            FileOutputStream fos = openFileOutput("MainActivity16", Context.MODE_PRIVATE);
            fos.write(NoteTitle6.getText().toString().getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save7() {
        EditText NoteTitle7 = findViewById(R.id.NoteTitle7);
        try {
            FileOutputStream fos = openFileOutput("MainActivity17", Context.MODE_PRIVATE);
            fos.write(NoteTitle7.getText().toString().getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save8() {
        EditText NoteTitle8 = findViewById(R.id.NoteTitle8);
        try {
            FileOutputStream fos = openFileOutput("MainActivity18", Context.MODE_PRIVATE);
            fos.write(NoteTitle8.getText().toString().getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save9() {
        EditText NoteTitle9 = findViewById(R.id.NoteTitle9);
        try {
            FileOutputStream fos = openFileOutput("MainActivity19", Context.MODE_PRIVATE);
            fos.write(NoteTitle9.getText().toString().getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save10() {
        EditText NoteTitle10 = findViewById(R.id.NoteTitle10);
        try {
            FileOutputStream fos = openFileOutput("MainActivity20", Context.MODE_PRIVATE);
            fos.write(NoteTitle10.getText().toString().getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save11() {
        EditText NoteTitle11 = findViewById(R.id.NoteTitle11);
        try {
            FileOutputStream fos = openFileOutput("MainActivity21", Context.MODE_PRIVATE);
            fos.write(NoteTitle11.getText().toString().getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void load() {
        EditText NoteTitle1 = findViewById(R.id.NoteTitle1);
        StringBuilder stringBuilder;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity11")));
            String inputString;
            stringBuilder = new StringBuilder();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuilder.append(inputString);
            }
            NoteTitle1.setText(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load2() {
        EditText NoteTitle2 = findViewById(R.id.NoteTitle2);
        StringBuilder stringBuilder;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity12")));
            String inputString;
            stringBuilder = new StringBuilder();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuilder.append(inputString);
            }
            NoteTitle2.setText(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load3() {
        EditText NoteTitle3 = findViewById(R.id.NoteTitle3);
        StringBuilder stringBuilder;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity13")));
            String inputString;
            stringBuilder = new StringBuilder();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuilder.append(inputString);
            }
            NoteTitle3.setText(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load4() {
        EditText NoteTitle4 = findViewById(R.id.NoteTitle4);
        StringBuilder stringBuilder;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity14")));
            String inputString;
            stringBuilder = new StringBuilder();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuilder.append(inputString);
            }
            NoteTitle4.setText(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load5() {
        EditText NoteTitle5 = findViewById(R.id.NoteTitle5);
        StringBuilder stringBuilder;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity15")));
            String inputString;
            stringBuilder = new StringBuilder();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuilder.append(inputString);
            }
            NoteTitle5.setText(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load6() {
        EditText NoteTitle6 = findViewById(R.id.NoteTitle6);
        StringBuilder stringBuilder;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity16")));
            String inputString;
            stringBuilder = new StringBuilder();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuilder.append(inputString);
            }
            NoteTitle6.setText(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load7() {
        EditText NoteTitle7 = findViewById(R.id.NoteTitle6);
        StringBuilder stringBuilder;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity17")));
            String inputString;
            stringBuilder = new StringBuilder();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuilder.append(inputString);
            }
            NoteTitle7.setText(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load8() {
        EditText NoteTitle8 = findViewById(R.id.NoteTitle6);
        StringBuilder stringBuilder;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity18")));
            String inputString;
            stringBuilder = new StringBuilder();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuilder.append(inputString);
            }
            NoteTitle8.setText(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load9() {
        EditText NoteTitle9 = findViewById(R.id.NoteTitle6);
        StringBuilder stringBuilder;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity19")));
            String inputString;
            stringBuilder = new StringBuilder();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuilder.append(inputString);
            }
            NoteTitle9.setText(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load10() {
        EditText NoteTitle10 = findViewById(R.id.NoteTitle6);
        StringBuilder stringBuilder;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity20")));
            String inputString;
            stringBuilder = new StringBuilder();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuilder.append(inputString);
            }
            NoteTitle10.setText(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load11() {
        EditText NoteTitle11 = findViewById(R.id.NoteTitle6);
        StringBuilder stringBuilder;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity21")));
            String inputString;
            stringBuilder = new StringBuilder();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuilder.append(inputString);
            }
            NoteTitle11.setText(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

