package dk.komputerkomputer.helloworld.first_layer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

import dk.komputerkomputer.helloworld.R;
import dk.komputerkomputer.helloworld.second_layer.MainActivity1;
import dk.komputerkomputer.helloworld.second_layer.MainActivity10;
import dk.komputerkomputer.helloworld.second_layer.MainActivity11;
import dk.komputerkomputer.helloworld.second_layer.MainActivity12;
import dk.komputerkomputer.helloworld.second_layer.MainActivity13;
import dk.komputerkomputer.helloworld.second_layer.MainActivity14;
import dk.komputerkomputer.helloworld.second_layer.MainActivity15;
import dk.komputerkomputer.helloworld.second_layer.MainActivity16;
import dk.komputerkomputer.helloworld.second_layer.MainActivity17;
import dk.komputerkomputer.helloworld.second_layer.MainActivity18;
import dk.komputerkomputer.helloworld.second_layer.MainActivity2;
import dk.komputerkomputer.helloworld.second_layer.MainActivity3;
import dk.komputerkomputer.helloworld.second_layer.MainActivity4;
import dk.komputerkomputer.helloworld.second_layer.MainActivity5;
//import dk.komputerkomputer.helloworld.second_layer.MainActivity6;
import dk.komputerkomputer.helloworld.second_layer.MainActivity6;
import dk.komputerkomputer.helloworld.second_layer.MainActivity7;
import dk.komputerkomputer.helloworld.second_layer.MainActivity8;
import dk.komputerkomputer.helloworld.second_layer.MainActivity9;
import dk.komputerkomputer.helloworld.second_layer.Note_Func1;

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

        //TODO Make all save methods try, catch



        EditText noteTitle1 = findViewById(R.id.NoteTitle1);
        EditText noteTitle2 = findViewById(R.id.NoteTitle2);
        EditText noteTitle3 = findViewById(R.id.NoteTitle3);
        EditText noteTitle4 = findViewById(R.id.NoteTitle4);
        EditText noteTitle5 = findViewById(R.id.NoteTitle5);
        EditText noteTitle6 = findViewById(R.id.NoteTitle6);
        EditText noteTitle7 = findViewById(R.id.NoteTitle7);
        EditText noteTitle8 = findViewById(R.id.NoteTitle8);
        EditText noteTitle9 = findViewById(R.id.NoteTitle9);
        EditText noteTitle10 = findViewById(R.id.NoteTitle10);
        EditText noteTitle11 = findViewById(R.id.NoteTitle11);
        EditText noteTitle12 = findViewById(R.id.NoteTitle12);
        EditText noteTitle13 = findViewById(R.id.NoteTitle13);
        EditText noteTitle14 = findViewById(R.id.NoteTitle14);
        EditText noteTitle15 = findViewById(R.id.NoteTitle15);
        EditText noteTitle16 = findViewById(R.id.NoteTitle16);
        EditText noteTitle17 = findViewById(R.id.NoteTitle17);
        EditText noteTitle18 = findViewById(R.id.NoteTitle18);

        TextView textView = findViewById(R.id.PPLink);

        Note_Func1 note_func1 = new Note_Func1();

        ScrollView sv = findViewById(R.id.scrl);
        sv.scrollTo(0, 1000);

        textView.setText(Html.fromHtml(
                "&nbsp; "+
                        "<a href=\"http://207.154.228.165\">Privacy policy</a> " +
                        "created with xml and java in android studio++"));
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        try {
            String file = "MainActivity1.1";
            noteTitle1.setText(note_func1.load(getApplicationContext(), file));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String file = "MainActivity1.2";
            noteTitle1.setText(note_func1.load(getApplicationContext(), file));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String file = "MainActivity1.3";
            noteTitle1.setText(note_func1.load(getApplicationContext(), file));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String file = "MainActivity1.4";
            noteTitle1.setText(note_func1.load(getApplicationContext(), file));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String file = "MainActivity1.5";
            noteTitle1.setText(note_func1.load(getApplicationContext(), file));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String file = "MainActivity1.6";
            noteTitle1.setText(note_func1.load(getApplicationContext(), file));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String file = "MainActivity1.7";
            noteTitle1.setText(note_func1.load(getApplicationContext(), file));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String file = "MainActivity1.8";
            noteTitle1.setText(note_func1.load(getApplicationContext(), file));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String file = "MainActivity1.9";
            noteTitle1.setText(note_func1.load(getApplicationContext(), file));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String file = "MainActivity1.10";
            noteTitle1.setText(note_func1.load(getApplicationContext(), file));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String file = "MainActivity1.11";
            noteTitle1.setText(note_func1.load(getApplicationContext(), file));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String file = "MainActivity1.12";
            noteTitle1.setText(note_func1.load(getApplicationContext(), file));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String file = "MainActivity1.13";
            noteTitle1.setText(note_func1.load(getApplicationContext(), file));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String file = "MainActivity1.14";
            noteTitle1.setText(note_func1.load(getApplicationContext(), file));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String file = "MainActivity1.15";
            noteTitle1.setText(note_func1.load(getApplicationContext(), file));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String file = "MainActivity1.16";
            noteTitle1.setText(note_func1.load(getApplicationContext(), file));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String file = "MainActivity1.17";
            noteTitle1.setText(note_func1.load(getApplicationContext(), file));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String file = "MainActivity1.18";
            noteTitle1.setText(note_func1.load(getApplicationContext(), file));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //TODO MAYBE MAKE LONGPRESS AND DOUBLETAP ACCESS NOTESPACES AND SINGLE CLICK EDIT AS NOW

        noteTitle1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = noteTitle1.getText().toString();
                String file = "MainActivity1.1";
                note_func1.save(getApplicationContext(), text, file);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        noteTitle1.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote1(getApplicationContext());
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote1(getApplicationContext());
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });

        noteTitle2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = noteTitle2.getText().toString();
                String file = "MainActivity1.2";
                note_func1.save(getApplicationContext(), text, file);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        // TODO actities does not refer properly to each other and hints do not work properly


        noteTitle2.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {
                Activity MainActivity2 = new Activity();

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote2(getApplicationContext());
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote2(getApplicationContext());
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });

        noteTitle3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = noteTitle3.getText().toString();
                String file = "MainActivity1.3";
                note_func1.save(getApplicationContext(), text, file);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        noteTitle3.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote3(getApplicationContext());
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote3(getApplicationContext());
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });

        noteTitle4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = noteTitle4.getText().toString();
                String file = "MainActivity1.4";
                note_func1.save(getApplicationContext(), text, file);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        noteTitle4.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote5(getApplicationContext());
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote5(getApplicationContext());
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });

        noteTitle5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = noteTitle5.getText().toString();
                String file = "MainActivity1.5";
                note_func1.save(getApplicationContext(), text, file);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        noteTitle5.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote6(getApplicationContext());
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote6(getApplicationContext());
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });

        noteTitle6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = noteTitle6.getText().toString();
                String file = "MainActivity1.6";
                note_func1.save(getApplicationContext(), text, file);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        noteTitle6.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote7(getApplicationContext());
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote7(getApplicationContext());
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });

        noteTitle7.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = noteTitle7.getText().toString();
                String file = "MainActivity1.7";
                note_func1.save(getApplicationContext(), text, file);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        noteTitle7.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote8(getApplicationContext());
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote8(getApplicationContext());
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });

        noteTitle8.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = noteTitle8.getText().toString();
                String file = "MainActivity1.8";
                note_func1.save(getApplicationContext(), text, file);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        noteTitle8.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote9(getApplicationContext());
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote9(getApplicationContext());
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });
        noteTitle9.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = noteTitle9.getText().toString();
                String file = "MainActivity1.9";
                note_func1.save(getApplicationContext(), text, file);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        noteTitle9.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote10(getApplicationContext());
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote10(getApplicationContext());
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });
        noteTitle10.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = noteTitle10.getText().toString();
                String file = "MainActivity1.10";
                note_func1.save(getApplicationContext(), text, file);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        noteTitle10.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote11(getApplicationContext());
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote11(getApplicationContext());
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });
        noteTitle11.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = noteTitle11.getText().toString();
                String file = "MainActivity1.11";
                note_func1.save(getApplicationContext(), text, file);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        noteTitle11.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote12(getApplicationContext());
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote12(getApplicationContext());
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });
        noteTitle12.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = noteTitle12.getText().toString();
                String file = "MainActivity1.12";
                note_func1.save(getApplicationContext(), text, file);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        noteTitle12.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote12(getApplicationContext());
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote12(getApplicationContext());
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });

        noteTitle13.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = noteTitle13.getText().toString();
                String file = "MainActivity1.13";
                note_func1.save(getApplicationContext(), text, file);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        noteTitle13.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote13(getApplicationContext());
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote13(getApplicationContext());
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });

        noteTitle14.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = noteTitle14.getText().toString();
                String file = "MainActivity1.14";
                note_func1.save(getApplicationContext(), text, file);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        noteTitle14.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote14(getApplicationContext());
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote14(getApplicationContext());
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });

        noteTitle15.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = noteTitle15.getText().toString();
                String file = "MainActivity1.15";
                note_func1.save(getApplicationContext(), text, file);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        noteTitle15.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    String text = noteTitle15.getText().toString();
                    String file = "MainActivity1.15";
                    note_func1.save(getApplicationContext(), text, file);
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote15(getApplicationContext());
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });

        noteTitle16.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = noteTitle16.getText().toString();
                String file = "MainActivity1.16";
                note_func1.save(getApplicationContext(), text, file);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        noteTitle16.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote16(getApplicationContext());
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote17(getApplicationContext());
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });

        noteTitle17.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = noteTitle17.getText().toString();
                String file = "MainActivity1.17";
                note_func1.save(getApplicationContext(), text, file);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        noteTitle17.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote17(getApplicationContext());
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote17(getApplicationContext());
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });

        noteTitle18.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = noteTitle18.getText().toString();
                String file = "MainActivity1.18";
                note_func1.save(getApplicationContext(), text, file);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        noteTitle18.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote18(getApplicationContext());
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
//                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    note_func1.enterNote18(getApplicationContext());
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

    /*public void load1() {
        EditText NoteTitle1 = findViewById(R.id.NoteTitle1);
        StringBuilder stringBuilder;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity1.1")));
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
                    openFileInput("MainActivity1.2")));
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
                    openFileInput("MainActivity1.3")));
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
                    openFileInput("MainActivity1.4")));
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
                    openFileInput("MainActivity1.5")));
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
                    openFileInput("MainActivity1.6")));
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
        EditText NoteTitle7 = findViewById(R.id.NoteTitle7);
        StringBuilder stringBuilder;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity1.7")));
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
        EditText NoteTitle8 = findViewById(R.id.NoteTitle8);
        StringBuilder stringBuilder;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity1.8")));
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
        EditText NoteTitle9 = findViewById(R.id.NoteTitle9);
        StringBuilder stringBuilder;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity1.9")));
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
        EditText NoteTitle10 = findViewById(R.id.NoteTitle10);
        StringBuilder stringBuilder;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity1.10")));
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
        EditText NoteTitle11 = findViewById(R.id.NoteTitle11);
        StringBuilder stringBuilder;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity1.11")));
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

    public void load12() {
        EditText NoteTitle12 = findViewById(R.id.NoteTitle12);
        StringBuilder stringBuilder;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity1.12")));
            String inputString;
            stringBuilder = new StringBuilder();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuilder.append(inputString);
            }
            NoteTitle12.setText(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load13() {
        EditText NoteTitle13 = findViewById(R.id.NoteTitle13);
        StringBuilder stringBuilder;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity1.13")));
            String inputString;
            stringBuilder = new StringBuilder();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuilder.append(inputString);
            }
            NoteTitle13.setText(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load14() {
        EditText NoteTitle14 = findViewById(R.id.NoteTitle14);
        StringBuilder stringBuilder;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity1.14")));
            String inputString;
            stringBuilder = new StringBuilder();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuilder.append(inputString);
            }
            NoteTitle14.setText(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load15() {
        EditText NoteTitle15 = findViewById(R.id.NoteTitle15);
        StringBuilder stringBuilder;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity1.15")));
            String inputString;
            stringBuilder = new StringBuilder();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuilder.append(inputString);
            }
            NoteTitle15.setText(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load16() {
        EditText NoteTitle16 = findViewById(R.id.NoteTitle16);
        StringBuilder stringBuilder;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity1.16")));
            String inputString;
            stringBuilder = new StringBuilder();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuilder.append(inputString);
            }
            NoteTitle16.setText(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load17() {
        EditText NoteTitle17 = findViewById(R.id.NoteTitle17);
        StringBuilder stringBuilder;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity1.17")));
            String inputString;
            stringBuilder = new StringBuilder();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuilder.append(inputString);
            }
            NoteTitle17.setText(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load18() {
        EditText NoteTitle18 = findViewById(R.id.NoteTitle18);
        StringBuilder stringBuilder;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivity1.18")));
            String inputString;
            stringBuilder = new StringBuilder();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuilder.append(inputString);
            }
            NoteTitle18.setText(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}

