package creational.builder;

import java.util.HashMap;

enum HTTPMethod {
    GET, POST, PUT, DELETE
}

public class Request {
    private final Long MILLIS_FACTOR = 1000L;
    private Long timeout;
    private HTTPMethod httpMethod;
    private Object body;
    private String baseUrl;
    private String relativePath;
    private HashMap<String, String> headers;
    private HashMap<String, String> queryParamters;

    private Request(Long timeout, HTTPMethod httpMethod, String baseUrl)  {
       this.timeout = timeout;
       this.httpMethod = httpMethod;
       this.baseUrl = baseUrl;
    }

    private Request(Builder builder) {
		this(builder.timeout, builder.httpMethod, builder.baseUrl);
        this.body = builder.body;
        this.relativePath = builder.relativePath;
        this.queryParamters = builder.queryParamters;
        this.headers = builder.headers;
	}

    @Override
    public String toString() {
        String out = ("BASE URL: -> " + baseUrl + "\n");
        if (relativePath != null) {
            out += ("RELATIVE PATH: -> " + relativePath  + "\n");
        }
        out += ("CONNECTION TIMEOUT: -> " + timeout/MILLIS_FACTOR + "s" + "\n");
        out += ("HTTP METHOD: -> " + httpMethod + "\n");
        if (httpMethod != HTTPMethod.GET) {
            out += ("BODY : -> " + body  + "\n");
        }
        if (queryParamters != null) {
            out += ("QUERY PARAMETERS: -> " + queryParamters  + "\n");
        }
        if (headers != null) {
            out += ("HEADERS: -> " + headers  + "\n");
        }
        return out;
    }

    public static class Builder {
        private Long timeout = null;
        private HTTPMethod httpMethod = null;
        private Object body = null;
        private String baseUrl = null;
        private String relativePath = null;
        private HashMap<String, String> headers = null;
        private HashMap<String, String> queryParamters = null;

        void setTimeOut(Long timeout) {
            this.timeout = timeout;
        }

        void setBaseUrl(String url) {
            this.baseUrl = url;
        }

        void setRelativePath(String relativePath) {
            this.relativePath = relativePath;
        }

        void setQueryParameters(HashMap<String, String> queryParamters) {
            this.queryParamters = queryParamters;
        }

        void setBody(Object body) {
            this.body = body;
        }

        void setHTTPMethod(HTTPMethod method) {
            this.httpMethod  = method;
        }

        void setRequestHeader(HashMap<String, String> headers) {
            this.headers = headers;
        }
  
        private Boolean validate() {
            if(timeout == null || httpMethod == null || baseUrl == null ){
                System.out.println("ERROR ===>> Please ensure that You have provided a baseUrl and httpMethod, as well as positive timeout");
                return false;
            }
            if (timeout <= 0) {
                System.out.println("ERROR ===>> Invaid timeout" + timeout);
                return false;
            }
            if (httpMethod == HTTPMethod.GET && body != null) {
                System.out.println("ERROR ===>> GET request do not support body:" + body);
                return false;
            }
            return true;
        }

        Request build() {
            if (validate()==false)  {
                return null;
            }
            return new Request(this);
        }
    }
 }