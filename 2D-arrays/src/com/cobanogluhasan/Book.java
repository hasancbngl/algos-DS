package com.cobanogluhasan;

public class Book {
    public String title;
    public int ISBN;
    public int pageNumber;
    public boolean isCheckedOut;
    public int dayCheckedOut;

    public Book(String title, int ISBN, int pageNumber) {
        this.title = title;
        this.pageNumber = pageNumber;
        this.ISBN = ISBN;
        this.isCheckedOut = false;
    }

    public String getTitle() {
        return this.title;
    }

    public int getISBN() {
        return this.ISBN;
    }

    public int getPageNumber() {
        return this.pageNumber;
    }

    public int getDayCheckedOut() {
        return dayCheckedOut;
    }

    public boolean getIsCheckedOut() {
        return this.isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut, int dayCheckedOut) {
        isCheckedOut = checkedOut;
        setDayCheckedOut(dayCheckedOut);
    }

    private void setDayCheckedOut(int dayCheckedOut) {
        this.dayCheckedOut = dayCheckedOut;
    }
}
