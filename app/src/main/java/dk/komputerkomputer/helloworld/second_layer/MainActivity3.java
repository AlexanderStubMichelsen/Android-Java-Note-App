package dk.komputerkomputer.helloworld.second_layer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import dk.komputerkomputer.helloworld.Note;
import dk.komputerkomputer.helloworld.R;
import dk.komputerkomputer.helloworld.first_layer.MainActivity;
import dk.komputerkomputer.helloworld.third_layer.MainActivity5;
import dk.komputerkomputer.helloworld.third_layer.MainActivity6;
import dk.komputerkomputer.helloworld.third_layer.MainActivity7;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    private static final String FILE_NAME = "Note.txt";

    Note note = new Note();
    ArrayList<String> tempNotes = new ArrayList<>();

    public void refreshNotesCountTwo3() {
        TextView txtViewEmTwo = findViewById(R.id.textViewEmTwo);
        String StandardMessage = "You have a total of " + note.getNotes().size() + " Notes";
        txtViewEmTwo.setText(StandardMessage);
    }

    public void enterNoteCollectionSpaceMain (View view) {
        Intent firstActivityIntent = new Intent(this, MainActivity5.class);
        startActivity(firstActivityIntent);
    }

    public void enterNoteCollectionSpaceSecond (View view) {
        Intent firstActivityIntent = new Intent(this, MainActivity6.class);
        startActivity(firstActivityIntent);
    }

    public void enterNoteCollectionSpaceThird (View view) {
        Intent firstActivityIntent = new Intent(this, MainActivity7.class);
        startActivity(firstActivityIntent);
    }

    public void enterNoteFrontPage (View view) {
        Intent firstActivityIntent = new Intent(this, MainActivity.class);
        startActivity(firstActivityIntent);
    }

    public void onBtnClickTwo(View view) {
        TextView txtViewDmTwo = findViewById(R.id.textViewDmTwo);
        TextView txtViewVmTwo = findViewById(R.id.textViewVmTwo);
        TextView txtViewWmTwo = findViewById(R.id.textViewWmTwo);

        EditText edtTxt = findViewById(R.id.edtEmTwo);
        //        edtTxt.getText().clear();

        try {
            String stringNote = edtTxt.getText().toString();
            tempNotes.add(stringNote);
            note.setNotes(tempNotes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            txtViewDmTwo.setText(note.getNotes().get(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            txtViewVmTwo.setText(note.getNotes().get(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            txtViewWmTwo.setText(note.getNotes().get(2));
        } catch (Exception e) {
            e.printStackTrace();
        }
        refreshNotesCountTwo3();
    }


//        ArrayList <String> tempNotes = new ArrayList<>();
//            tempNotes.add(stringNote);
//            note.setNotes(tempNotes);
//            txtViewDm.setText(note.trimmedNotesArray());
//        }
//
//        if(note.notesGetI(0) != null ) {
//            String noteEntry = note.notesGetI(0);
//            String noteEntryTrimmed = note.trimmedNotesArrayEntry(noteEntry);
//            txtViewDm.setText(noteEntryTrimmed);
//        } if(note.notesGetI(1) != null ) {
//            String noteEntry = note.notesGetI(1);
//            String noteEntryTrimmed = note.trimmedNotesArrayEntry(noteEntry);
//            txtViewVm.setText(noteEntryTrimmed);
//        } if(note.notesGetI(2) != null ) {
//            String noteEntry = note.notesGetI(2);
//            String noteEntryTrimmed = note.trimmedNotesArrayEntry(noteEntry);
//            txtViewWm.setText(noteEntryTrimmed);
//        }
//        refreshNotesCount();
//            save();
//}

    //TODO Make Interface

    public void deleteLastNoteTwo(View view) {
        TextView txtViewDmTwo = findViewById(R.id.textViewEmTwo);
        TextView txtViewVmTwo = findViewById(R.id.textViewVmTwo);
        TextView txtViewWmTwo = findViewById(R.id.textViewWmTwo);

        ArrayList <String> tempNotes;
        tempNotes = note.getNotes();
        if(tempNotes.size() >= 0) {
//            tempNotes.remove(tempNotes.size() - 1);
//            note.setNotes(tempNotes);
            if(tempNotes.size() == 1) {
                tempNotes.remove(tempNotes.size() - 1);
                txtViewDmTwo.setText("");
            }
            if(tempNotes.size() == 2) {
                tempNotes.remove(tempNotes.size() - 1);
                txtViewVmTwo.setText("");
            }
            if(tempNotes.size() == 3) {
                tempNotes.remove(tempNotes.size() - 1);
                txtViewWmTwo.setText("");
            }
        }
        refreshNotesCountTwo3();
    }

    public void saveTwo(View view) {
        String noteArray = note.trimmedNotesArray();
        FileOutputStream fos = null;

        try {
            fos = openFileOutput(FILE_NAME, MODE_PRIVATE);
            fos.write(noteArray.getBytes());

            Toast.makeText(this, "saved to " + getFilesDir() + "/" + FILE_NAME, Toast.LENGTH_LONG).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void loadTwo(View view) {
        TextView txtViewDm = findViewById(R.id.textViewDmTwo);
//        EditText edtTxt = findViewById(R.id.edtEm);
        FileInputStream fis = null;

        try {
            fis = openFileInput(FILE_NAME);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String text;

            while ((text = br.readLine()) != null) {
                sb.append(text).append('\n');
            }

            TextView txtViewTwo = findViewById(R.id.textViewTwo);
            txtViewTwo.setText((sb.toString()));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
