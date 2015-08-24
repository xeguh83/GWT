package ru.spb.nicetu.firstGWT.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface FirstGWTServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
