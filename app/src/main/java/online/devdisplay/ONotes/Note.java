package online.devdisplay.ONotes;

import java.util.ArrayList;

public class Note {

    private String note;

    private ArrayList<String> notes;

    public Note() {
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String s) {
    }

    public ArrayList<String> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<String> notes) {
        this.notes = notes;
    }

//    public void addNote(String note) {
//        getNotes().add(note);
//    }

//    public String notesGetI(int index) {
//        String noteEntry = null;
//        if (getNotes().get(index) != null) {
//            noteEntry = getNotes().get(index);
//        }
//        return noteEntry;
//    }

    public String trimmedNotesArray() {
        String noteArrayTooString = getNotes().toString();

        noteArrayTooString = noteArrayTooString.substring(1, noteArrayTooString.length() - 1);
        noteArrayTooString = noteArrayTooString.replaceAll(",", "");
        noteArrayTooString = noteArrayTooString.replaceAll(" ", "");
        return noteArrayTooString;
    }

    public String trimmedNotesArrayEntry(String note) {
        String noteArrayEntryTooString = note;
        noteArrayEntryTooString = noteArrayEntryTooString.substring(1, noteArrayEntryTooString.length() - 1);
        return noteArrayEntryTooString;
    }

    public int sizeOf() {
        return notes.size();
    }
}



