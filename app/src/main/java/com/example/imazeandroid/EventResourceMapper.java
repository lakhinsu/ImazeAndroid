package com.example.imazeandroid;

import java.util.ArrayList;

public class EventResourceMapper {

    String eventTitle;

    ArrayList<String> eventTitles;
    ArrayList<String> videoTitles;

    public EventResourceMapper(String eventTitle){
        this.eventTitle = eventTitle;

        eventTitles = new ArrayList<>();
        videoTitles = new ArrayList<>();

        eventTitles.add("Scrub The Mind");
        eventTitles.add("Rotolare");
        eventTitles.add("Codothon");
        eventTitles.add("Game of Codes");
        eventTitles.add("World War 3");
        eventTitles.add("Hydrizer");
        eventTitles.add("Armagendon");
        eventTitles.add("Electromania");
        eventTitles.add("Electrosparkz");
        eventTitles.add("Trail To Recruit");
        eventTitles.add("The Survival 2.0");
        eventTitles.add("Venture-O-Belt");
        eventTitles.add("Gobble Step");
        eventTitles.add("Quizzimaze 2.0");
        eventTitles.add("Kon Banega Pradhan Mantri");
        eventTitles.add("Treasure-Dash");
        eventTitles.add("Blast And Hunt");
        eventTitles.add("Rapport Inquest");
        eventTitles.add("Master Chef 2.0");
        eventTitles.add("Trade X");
        eventTitles.add("Flix-Frenzy");

        videoTitles.add("videos/Tech/CH.m4v");
        videoTitles.add("videos/Tech/CL.m4v");
        videoTitles.add("videos/Tech/CP.m4v");
        videoTitles.add("videos/Tech/IT.m4v");
        videoTitles.add("videos/Tech/WW3.m4v");
        videoTitles.add("videos/Tech/ME.m4v");
        videoTitles.add("videos/Tech/MC.m4v");
        videoTitles.add("videos/Tech/EC.m4v");
        videoTitles.add("videos/Tech/EE.m4v");
        videoTitles.add("videos/Tech/TPC.m4v");
        videoTitles.add("videos/Non_tech/The Survival 2.0.m4v");
        videoTitles.add("videos/Non_tech/Venture-O-Belt.m4v");
        videoTitles.add("videos/Non_tech/Gobble Step.m4v");
        videoTitles.add("videos/Non_tech/Quizzimaze 2.0.m4v");
        videoTitles.add("videos/Non_tech/Kon Banega Pradhan Mantri.m4v");
        videoTitles.add("videos/Non_tech/Treasure-Dash.m4v");
        videoTitles.add("videos/Non_tech/Blast And Hunt.m4v");
        videoTitles.add("videos/Non_tech/Rapport Inquest.m4v");
        videoTitles.add("videos/Non_tech/Master Chef 2.0.m4v");
        videoTitles.add("videos/Non_tech/Trade X.m4v");
        videoTitles.add("videos/Non_tech/Flix-Frenzy.m4v");


    }

    public String getVideoURL(){
        String domain = "https://imaze2020-dev.now.sh/";
        String url = videoTitles.get(eventTitles.indexOf(eventTitle));
        return (domain + url).replace(" ","%20");
    }
}
