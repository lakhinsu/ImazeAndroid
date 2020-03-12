package com.example.imazeandroid;
import android.content.Context;
import android.os.AsyncTask;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.ValueRange;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class SpreadSheetApi{
    private static final String APPLICATION_NAME = "Google Sheets API Java Quickstart";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static final String TOKENS_DIRECTORY_PATH = "tokens";
    /**
     * Global instance of the scopes required by this quickstart.
     * If modifying these scopes, delete your previously saved tokens/ folder.
     */
    private static final List<String> SCOPES = Collections.singletonList(SheetsScopes.SPREADSHEETS_READONLY);
    private static final String CREDENTIALS_FILE_PATH = "credentials.json";
    /**
     * Creates an authorized Credential object.
     *
     * @param HTTP_TRANSPORT The network HTTP Transport.
     * @return An authorized Credential object.
     * @throws IOException If the credentials.json file cannot be found.
     */
    Context mContext;
    String sheetid;

    public SpreadSheetApi(Context mContext, String sheetid) {
        this.mContext = mContext;
        this.sheetid = sheetid;
    }

    @SuppressWarnings("deprecation")
    private Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws IOException {
        // Load client secrets.
        InputStream in = mContext.getResources().openRawResource(mContext.getResources().getIdentifier("credentials", "raw", mContext.getPackageName()));
        if (in == null) {
            throw new FileNotFoundException("Resource not found: " + CREDENTIALS_FILE_PATH);
        }
        return GoogleCredential.fromStream(in).createScoped(googleOAuth2Scopes());
    }

    private Set<String> googleOAuth2Scopes() {
        Set<String> googleOAuth2Scopes = new HashSet<>();
        googleOAuth2Scopes.add(SheetsScopes.SPREADSHEETS_READONLY);
        return Collections.unmodifiableSet(googleOAuth2Scopes);
    }

    public Event getSheet() {
        try {
            final NetHttpTransport HTTP_TRANSPORT = new com.google.api.client.http.javanet.NetHttpTransport();
            final String range = "Sheet1";
            Sheets service = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
                    .setApplicationName(APPLICATION_NAME)
                    .build();
            ValueRange response = service.spreadsheets().values()
                    .get(sheetid, range)
                    .execute();
            List<List<Object>> values = response.getValues();
            Event event = new Event();
            // Parsing Spreadsheet data and Creating Event object
            for(int i=0;i<values.size();i++){
                if(i==0){
                    event.setEvent_title(values.get(i).get(1).toString());
                }
                if(i==1){
                    event.setEvent_description(values.get(i).get(1).toString());
                }
                if(i==2){
                    ArrayList<String> rounds = new ArrayList<>();
                    for(int j=1;j<values.get(i).size();j++){
                        rounds.add(values.get(i).get(j).toString());
                    }
                    event.setRounds_info(rounds);
                }
                if(i==3){
                    ArrayList<String> judgement = new ArrayList<>();
                    for(int j=1;j<values.get(i).size();j++){
                        judgement.add(values.get(i).get(j).toString());
                    }
                    event.setJudgement_criteria(judgement);
                }
                if(i==4){
                    event.setTeam_size(values.get(i).get(1).toString());
                }
                if(i==5){
                    ArrayList<String> coordinators_info = new ArrayList<>();
                    for(int j=1;j<values.get(i).size();j++){
                        coordinators_info.add(values.get(i).get(j).toString());
                    }
                    event.setCoordinators_info(coordinators_info);
                }
            }
            return event;

        } catch (Exception e) {
            e.printStackTrace();
            return new Event();
        }

    }


}
