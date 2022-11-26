package dk.komputerkomputer.helloworld.first_layer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import dk.komputerkomputer.helloworld.Note;
import dk.komputerkomputer.helloworld.R;
import dk.komputerkomputer.helloworld.second_layer.MainActivity2;
import dk.komputerkomputer.helloworld.second_layer.MainActivity3;
import dk.komputerkomputer.helloworld.second_layer.MainActivity4;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO:: complete this

        TextView txtViewDm = findViewById(R.id.textViewDmTwo);
        TextView txtViewVm = findViewById(R.id.textViewVmTwo);
        TextView txtViewWm = findViewById(R.id.textViewWmTwo);

        Note note = new Note();
        ArrayList<String> tempNotes = new ArrayList<>();

       /* try {
            txtViewDm.setText(load(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            txtViewVm.setText(load(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            txtViewWm.setText(load(2));
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }

    /*TextView txtViewDm = findViewById(R.id.textViewDmTwo);
    TextView txtViewVm = findViewById(R.id.textViewVmTwo);
    TextView txtViewWm = findViewById(R.id.textViewWmTwo);*/

    Note note = new Note();
    ArrayList<String> tempNotes = new ArrayList<>();

    public void onBtnClick(View view) {
        TextView txtViewDm = findViewById(R.id.textViewDmTwo);
        TextView txtViewVm = findViewById(R.id.textViewVmTwo);
        TextView txtViewWm = findViewById(R.id.textViewWmTwo);

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
            txtViewDm.setText(note.getNotes().get(0));
            save(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            txtViewVm.setText(note.getNotes().get(1));
            save(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            txtViewWm.setText(note.getNotes().get(2));
            save(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        refreshNotesCount();
    }

    //TODO Make Interface

    public void deleteLastNote(View view) {
        TextView txtViewDm = findViewById(R.id.textViewDmTwo);
        TextView txtViewVm = findViewById(R.id.textViewVmTwo);
        TextView txtViewWm = findViewById(R.id.textViewWmTwo);

        //TODO CONSIDER SWITCH CASE --

        tempNotes = note.getNotes();

        if (tempNotes.size() == 1) {
            tempNotes.remove(tempNotes.size() - 1);
            note.setNotes(tempNotes);
            txtViewDm.setText("");
            delete(1);
        }
        if (tempNotes.size() == 2) {
            tempNotes.remove(tempNotes.size() - 1);
            note.setNotes(tempNotes);
            txtViewVm.setText("");
            delete(2);

        }
        if (tempNotes.size() == 3) {
            tempNotes.remove(tempNotes.size() - 1);
            note.setNotes(tempNotes);
            txtViewWm.setText("");
            delete(3);
        }
//        refreshNotesCount();
    }

        //TODO WRITE METHOD REFRESH

    public void enterNoteCollectionSpace(View view) {
        Intent secondActivityIntent = new Intent(this, MainActivity2.class);
        startActivity(secondActivityIntent);
    }

    public void enterNoteCollectionSpaceTwo(View view) {
        Intent secondActivityIntent = new Intent(this, MainActivity3.class);
        startActivity(secondActivityIntent);
    }

    public void enterNoteCollectionSpaceThree(View view) {
        Intent secondActivityIntent = new Intent(this, MainActivity4.class);
        startActivity(secondActivityIntent);
    }

    public void refreshNotesCount() {
        TextView txtViewEm = findViewById(R.id.textViewEmTwo);
        String StandardMessage = "You have a total of " + note.getNotes().size() + " Notes";
        txtViewEm.setText(StandardMessage);
    }

    public String fileName(int i) {
        String fileName = "Note-Layer-One-Space-" + i + ".txt";
        return fileName;
    }

    public void save(int i) {
        String noteArray = note.getNotes().get(i);
        FileOutputStream fos = null;

        try {
            fos = openFileOutput(fileName(i), MODE_PRIVATE);
            fos.write(noteArray.getBytes());

            Toast.makeText(this, "saved to " + getFilesDir() + "/" + fileName(i), Toast.LENGTH_LONG).show();
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

    public void delete(int i) {
        String path = getFilesDir().getAbsolutePath() + "/" + fileName(i);
        File file = new File(path);
        file.delete();
        Toast.makeText(this, "deleted " + getFilesDir() + "/" + fileName(i), Toast.LENGTH_LONG).show();

    }

    public String load(int i) {
        TextView txtViewDm = findViewById(R.id.textViewDmTwo);
        FileInputStream fis;

        String s = null;
        try {
            fis = openFileInput(fileName(i));
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String text;

            while ((text = br.readLine()) != null) {
                sb.append(text).append('\n');
            }

//            txtViewDm.setText((sb.toString()));

            s = sb.toString();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
}

