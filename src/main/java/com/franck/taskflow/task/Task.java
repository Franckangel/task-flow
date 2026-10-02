package com.franck.taskflow.task;


/** An immutable task record: one line gives fields, constructor, getters, equals, toString. */
public record Task(Long id, String title, boolean completed) {
}
