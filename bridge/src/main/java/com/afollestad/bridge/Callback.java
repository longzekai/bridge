package com.afollestad.bridge;

/**
 * @author Aidan Follestad (afollestad)
 */
public abstract class Callback {

    public abstract void response(Request request, Response response, RequestException e);

    public void progress(Request request, int current, int total, int percent) {
    }
}
