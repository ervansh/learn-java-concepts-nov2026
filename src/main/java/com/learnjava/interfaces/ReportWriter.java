package com.learnjava.interfaces;

/** Contract for exporting a named report. */
public interface ReportWriter {
    String write(String reportName, String content);

    default boolean supportsEmptyReports() { return false; }

    static boolean isValidName(String name) {
        return name != null && name.matches("[A-Za-z0-9_-]+");
    }
}
