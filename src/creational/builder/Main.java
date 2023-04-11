package creational.builder;

public class Main {

	public static void main(String[] args) {
		
		// load objects
		var requestBuilder =  new Request.Builder();
		
		requestBuilder.setBaseUrl("wwww.google.com");
        requestBuilder.setHTTPMethod(HTTPMethod.GET);
        requestBuilder.setTimeOut(1000L);

        // Once the builder is set, calling the build method many times should result in identical object being created
        var request = requestBuilder.build();
        var duplicateRequest = requestBuilder.build();

        System.out.println(request);
        System.out.println(duplicateRequest);

        requestBuilder.setRelativePath("image");
        var requestWithRelativePath = requestBuilder.build();
        System.out.println(requestWithRelativePath);
        
        requestBuilder.setBody("A sample body");
        var invalidRequest = requestBuilder.build();
        System.out.println(invalidRequest);
	}

}
