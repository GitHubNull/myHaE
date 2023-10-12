package burp.ui.board;

import burp.IHttpRequestResponsePersisted;
import java.net.URL;

public class LogEntry {

    private final String comment;
    private final IHttpRequestResponsePersisted requestResponse;
    private final URL url;
    private final String length;
    private final String color;
    private final String method;

    LogEntry(IHttpRequestResponsePersisted requestResponse, String method, URL url, String comment, String length, String color) {
        this.requestResponse = requestResponse;
        this.method = method;
        this.url = url;
        this.comment = comment;
        this.length = length;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public URL getUrl() {
        return this.url;
    }

    public String getLength() {
        return this.length;
    }

    public String getComment() {
        return this.comment;
    }

    public String getMethod() {
        return this.method;
    }

    public IHttpRequestResponsePersisted getRequestResponse() {
        return this.requestResponse;
    }
}
