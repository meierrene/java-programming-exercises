package de.renemeier.udemy.timbuchalka.exercises.exercise38.printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = 15;
        printer.printPages(pagesPrinted);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = 2;
        printer.printPages(pagesPrinted);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = 21;
        printer.printPages(pagesPrinted);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
    }
}