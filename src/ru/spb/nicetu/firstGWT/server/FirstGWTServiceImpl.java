package ru.spb.nicetu.firstGWT.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import ru.spb.nicetu.firstGWT.client.FirstGWTService;

public class FirstGWTServiceImpl extends RemoteServiceServlet implements FirstGWTService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}