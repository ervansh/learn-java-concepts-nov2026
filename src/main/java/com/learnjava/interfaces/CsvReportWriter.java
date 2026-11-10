package com.learnjava.interfaces;

import java.nio.charset.StandardCharsets;

/** Writes a report using a CSV-oriented representation. */
public final class CsvReportWriter implements ReportWriter {
    @Override
    public String write(String reportName, String content) {
        if (!ReportWriter.isValidName(reportName)) {
            throw new IllegalArgumentException("Report name must contain only letters, digits, '_' or '-'.");
        }
        if (content == null || (content.isEmpty() && !supportsEmptyReports())) {
            throw new IllegalArgumentException("Report content is required.");
        }
        return reportName + ".csv (" + content.getBytes(StandardCharsets.UTF_8).length + " bytes)";
    }
}
