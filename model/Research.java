package model;

import java.util.ArrayList;

public class Research {
    private String title;
    private String journal;
    private String paperAbstract;
    private ArrayList<String> authors;
    public Research(String title, String journal, String paperAbstract, ArrayList<String> authors){
        this.title = title;
        this.journal = journal;
        this.paperAbstract = paperAbstract;
        this.authors = authors;
    }
    public ArrayList<String> getAuthors() {
        return authors;
    }
    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }
    public String getPaperAbstract() {
        return paperAbstract;
    }
    public void setPaperAbstract(String paperAbstract) {
        this.paperAbstract = paperAbstract;
    }
    public String getJournal() {
        return journal;
    }
    public void setJournal(String journal) {
        this.journal = journal;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
