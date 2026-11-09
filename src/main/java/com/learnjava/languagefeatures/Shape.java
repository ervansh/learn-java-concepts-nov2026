package com.learnjava.languagefeatures;

/** Closed hierarchy used to demonstrate sealed types and pattern matching. */
public sealed interface Shape permits Circle, Rectangle {
    double area();
}
