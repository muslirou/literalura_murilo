package com.alura.literalura_murilo.service;

import org.json.JSONArray;
import org.json.JSONObject;

public class NovoConverteDados (String json) {

           String json = "";

            JSONObject jsonObject = new JSONObject(json);
            JSONArray resultsArray = jsonObject.getJSONArray("results");

            for (int i = 0; i < resultsArray.length(), i++){
        JSONObject result = resultsArray.getJSONObject(i);

        String title = result.getString("title");
        String author = result.getJSONArray("authors").getJSONObject(0).getString("name");
        String language = result.getJSONArray("languages").getString(0);
        int downloadCount = result.getInt("download_count");

        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Language: " + language);
        System.out.println("Download Count: " + downloadCount);

        }

}
