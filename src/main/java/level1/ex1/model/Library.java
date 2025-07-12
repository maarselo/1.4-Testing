package level1.ex1.model;

import java.util.ArrayList;

public class Library {
    private ArrayList<String> books = null;

    public Library(){
        books = new ArrayList<>();
    }

    public ArrayList<String> getBooks() {return books;}
    public void setBooks(ArrayList<String> books) {this.books = books;}
}
