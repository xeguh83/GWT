package ru.spb.nicetu.firstGWT.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("FirstGWTService")
public interface FirstGWTService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use FirstGWTService.App.getInstance() to access static instance of FirstGWTServiceAsync
     */
    public static class App {
        private static FirstGWTServiceAsync ourInstance = GWT.create(FirstGWTService.class);

        public static synchronized FirstGWTServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
