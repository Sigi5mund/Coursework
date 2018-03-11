import java.util.ArrayList;

public class Journal {

    private ArrayList<String> journalEntries;

    public Journal(){
        journalEntries = new ArrayList<String>();
    }

    public void writeJournal(String entry){
        journalEntries.add(entry);
    }

    public String getJournalEntry(int index){
        return journalEntries.get(index);
    }

    public String getLastJournalEntry(){
        return getJournalEntry(journalEntries.size() - 1);
    }
}
