package com.learnjava.interfaces;

/** Demonstrates programming to an interface rather than an implementation. */
public final class InterfacesDemo {
    private InterfacesDemo() { }

    public static void main(String[] args) {
        ReportWriter writer = new CsvReportWriter();
        String result = writer.write("monthly-summary", "passed,failed\n42,2");
        System.out.println(result);
        System.out.println("Valid name: " + ReportWriter.isValidName("monthly-summary"));
        System.out.println("Supports empty reports: " + writer.supportsEmptyReports());
    }
}
