package com.fission.SampleJavascriptSignIN;

import java.util.Scanner;

import org.scribe.builder.ServiceBuilder;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuthService;
 
public class Google2Example {
 
  private static final String NETWORK_NAME = "Google";
 
  private static final String PROTECTED_RESOURCE_URL = "https://www.googleapis.com/oauth2/v2/userinfo?alt=json";
 
  private static final String SCOPE = "https://mail.google.com/ https://www.googleapis.com/auth/userinfo.email";
 
  private static final Token EMPTY_TOKEN = null;
 
  public static void main(String[] args) {
 
     
      //String callbackUrl = "http://localhost:8080/SampleJavascriptSignIN/googlesignin";
	  String callbackUrl = "http://localhost:8080/googlesignin";
 
      
     String apiKey="92208181413-5f19jn5j14k2tgirsq5p30qf42fpo3kq.apps.googleusercontent.com";
    	String apiSecret="jMN_QJDnbzwQY-LeVA9TvUei";
    	/*String apiKey = "627385188828-rtn68ovus7cerg84uuqccf4avsfrim3i.apps.googleusercontent.com";

    	String apiSecret = "ENfcksHghviw26cEBVyc0xlw";*/
      // Create OAuthService for Google OAuth 2.0
      OAuthService service = new ServiceBuilder().provider(Google2Api.class)
              .apiKey(apiKey).apiSecret(apiSecret).callback(callbackUrl)
              .scope(SCOPE).build();
 
      Scanner in = new Scanner(System.in);
 
      System.out.println("=== " + NETWORK_NAME + "'s OAuth Workflow ===");
      System.out.println();
 
      Verifier verifier = null;
 
      Token accessToken = null;
 
      // Obtain the Authorization URL
      System.out.println("Fetching the Authorization URL...");
      String authorizationUrl = service.getAuthorizationUrl(EMPTY_TOKEN);
      System.out.println("Got the Authorization URL!");
      System.out.println("Now go and authorize Scribe here:");
      System.out.println();
 
  
      // Copy this URL and run in browser.
      System.out.println(authorizationUrl);
      System.out.println();
 
  
      // Copy Authorization Code in browser URL and paste to Console
      System.out.println("And paste the authorization code here");
      System.out.print(">>");
      verifier = new Verifier(in.nextLine());
      System.out.println();
 
      // Trade the Request Token and Verfier for the Access Token
      System.out.println("Trading the Request Token for an Access Token...");
      accessToken = service.getAccessToken(EMPTY_TOKEN, verifier);
      System.out.println("Got the Access Token!");
      System.out.println("(if your curious it looks like this: "
              + accessToken + " )");
      System.out.println();
 
      // Now let's go and ask for a protected resource!
      System.out.println("Now we're going to access a protected resource...");
      OAuthRequest request = new OAuthRequest(Verb.GET,
              PROTECTED_RESOURCE_URL);
      service.signRequest(accessToken, request);
      Response response = request.send();
      System.out.println("Got it! Lets see what we found...");
      System.out.println();
      System.out.println(response.getCode());
      System.out.println(response.getBody());
 
      System.out.println();
      System.out
              .println("Thats it man! Go and build something awesome with Scribe! :)");
      in.close();
  }
}