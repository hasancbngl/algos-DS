package com.cobanogluhasan;

import java.util.HashMap;
import java.util.Map;

public class BookCatalogue {

    Map<String, Book> bookCollection = new HashMap<String, Book>();
    int currentDay;
    int lentgthOfCheckoutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;

    public BookCatalogue(Map<String, Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    public BookCatalogue(Map<String, Book> bookCollection, int currentDay, int lentgthOfCheckoutPeriod, double initialLateFee, double feePerLateDay) {
        this.bookCollection = bookCollection;
        this.currentDay = currentDay;
        this.lentgthOfCheckoutPeriod = lentgthOfCheckoutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }

    public int getCurrentDay() {
        return this.currentDay;
    }

    public int getLentgthOfCheckoutPeriod() {
        return this.lentgthOfCheckoutPeriod;
    }

    public Map<String, Book> getBookCollection() {
        return this.bookCollection;
    }

    public Book getBook(String bookTitle) {
        return getBookCollection().get(bookTitle);
    }

    public double getInitialLateFee() {
        return this.initialLateFee;
    }

    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }

    public void nextDay() {
        currentDay++;
    }

    public void setCurrentDay(int day) {
        this.currentDay = day;
    }

    public void checkOutBook(String title) {
        Book book = getBook(title);
        if (book.getIsCheckedOut()) {
            bookAlreadyCheckedOut(book);
        } else {
            book.setCheckedOut(true, currentDay);
            System.out.println("checked out. " + title + "its due on day:" + (getCurrentDay() + getLentgthOfCheckoutPeriod()) + ".");
        }
    }

    public void returnBook(String title) {
        Book book = getBook(title);
        int daysLate = currentDay - (book.dayCheckedOut + getLentgthOfCheckoutPeriod());
        if (daysLate > 0) {
            System.out.println("you owe the library $" + daysLate * getFeePerLateDay() + (getInitialLateFee())
                    + " the book " + daysLate + " late!");
        } else System.out.println("Book returned!");
        book.setCheckedOut(false, -1);
    }

    public void bookAlreadyCheckedOut(Book book) {
        System.out.println("The book" + book.getTitle() + " is already checkout out. IT should  be back at " +
                (getLentgthOfCheckoutPeriod() + book.getDayCheckedOut()));
    }

    public static void main(String[] args) {
        Map<String, Book> collection = new HashMap<>();
        Book book = new Book("harry potter", 123, 546);
        collection.put("harry", book);
        BookCatalogue catalogue = new BookCatalogue(collection);
        catalogue.checkOutBook("harry");
        catalogue.nextDay();
        catalogue.nextDay();
        catalogue.checkOutBook("harry");
        catalogue.setCurrentDay(2);
    }
}
