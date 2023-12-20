package com.spring.jdbc;
import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.*;
import org.json.HTTP;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		boolean continueProgram = true;
		while(continueProgram) {
			try {
		System.out.println("Welcome to Currency Converter :- ");
		System.out.print("Enter the BASE Currency (or 'exit' to quit) :- ");
		String baseCur=sc.nextLine();
		if(baseCur.equalsIgnoreCase("exit")) {
			System.out.println("Thankyou for using the application...!");
			break;
		}
		System.out.print("Enter the TARGET Currency :- ");
		String tarCur=sc.nextLine();
		System.out.print("Enter the amount :- ");
		double amt=sc.nextDouble();
		
		
		String url="https://open.er-api.com/v6/latest/" + baseCur.toUpperCase();
		
		OkHttpClient client=new OkHttpClient();
		Request request=new Request.Builder().url(url).get().build();
		
		Response response=client.newCall(request).execute();
		String stringresponse=response.body().string();
		JSONObject jsonobject=new JSONObject(stringresponse);
		JSONObject ratesobject=jsonobject.getJSONObject("rates");
		double  rate=ratesobject.getDouble(tarCur.toUpperCase());
		double result=rate*amt;
		System.out.println(amt+" "+baseCur.toUpperCase()+" = "+result+" "+tarCur.toUpperCase());
		
		 System.out.print("Do you want to continue? (yes/no): ");
         sc.nextLine(); // Consume the newline character left by nextDouble()
         String userInput = sc.nextLine().toLowerCase();

         continueProgram = userInput.equals("yes");
			}catch(Exception e) {
				System.out.println("Error : "+e.getMessage());
				continueProgram = false;
			}
		}
	}
}

