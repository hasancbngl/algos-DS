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

    public static void main(String[] args) {

    }
}
