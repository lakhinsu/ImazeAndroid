package com.example.imazeandroid;

import java.util.ArrayList;

public class EventResourceMapper {

    String eventTitle;

    ArrayList<String> eventTitles;
    ArrayList<String> videoTitles;
    ArrayList<String> sheetIDs;

    public EventResourceMapper(String eventTitle){
        this.eventTitle = eventTitle;

        eventTitles = new ArrayList<>();
        videoTitles = new ArrayList<>();
        sheetIDs = new ArrayList<>();

        eventTitles.add("Scrub The Mind");
        eventTitles.add("Rotolare");
        eventTitles.add("Codothon");
        eventTitles.add("Game of Codes");
        eventTitles.add("World War 3");
        eventTitles.add("Hydrizer");
        eventTitles.add("Armaggedon");
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

        sheetIDs.add("1JjrjbeDM6Tnnyx7_0zW6dF9PM9xJzmQl93R4zlAEyQY");
        sheetIDs.add("1swSqBb7Fg5rs5ma8hmccQN0aS3DwbV8DU0GjeIfJU7Y");
        sheetIDs.add("133giyAex7W26Dwy0rbwYe2dQMtWfL8iVsSj6AuXTi6w");
        sheetIDs.add("1raiafOAgKQnvQ0Hf6iZI8-gmR_5p4UcOWQB_vHcBTyo");
        sheetIDs.add("1gDy7_sGv2EvkCLNzs2RLyuwhZXbjX6lrfs1Rjx8hsTU");
        sheetIDs.add("1ssAuz7jvP7fZ8fPappOpjdEa6se3Rpx2_y5nb5S6RVc");
        sheetIDs.add("1vVa_nPyQEbVtdDL6zdnWZ8pgxBnGQhqFNuIxfUOCJ04");
        sheetIDs.add("1vAVfeSGqTHA-4YTCrC9ZUxP3yqfEGmXnFuOOzy0RQn8");
        sheetIDs.add("1LkfMtXH10_wKdfAAVXsWkj2cx8cxIhdKbFp_SvtIqcU");
        sheetIDs.add("14gY7gvfyOrToacVuaXTJXi8ElxbcYohVC4lIuhrBEcs");
        sheetIDs.add("1seF7EIiuz2lFOj5J23qQezu543w5WN_TbUnV2QLoz6U");
        sheetIDs.add("13C9iz38ogb8pvuq5wgh4_W01t5e8CT5XchS471iIx5w");
        sheetIDs.add("154B13p8-_qNrAXnvAG6D8mz8fteNg3Y0BpCm8JFFU70");
        sheetIDs.add("17QjIa5-gW89YPd1mY4pTPueiW7utAgdsXVBgY6A4xQM");
        sheetIDs.add("1oGqaKWUDVifR5h2htfMwQ3pkXvKwAzXOlAIhlvupKbY");
        sheetIDs.add("1gEOJpg7no9e_KXJKTX6QcQ8PSEuK2-pUWI-Kvd993Y8");
        sheetIDs.add("1siEKDwc6HRjLoPuT4jZnKXvOvLfiVsnHagI8Mu9YR6M");
        sheetIDs.add("1PC1vptvy5iVxHuJWE3TAtEOvqweo-02GiyA-0qwK_Ig");
        sheetIDs.add("1Xehycmc4dnAip2lWrsnm68RV7whNbKyyekFdOKGGx9Q");
        sheetIDs.add("1LQPn3ER60wNBw4vC1oew0g-Zpv-Wy4_YMajeNUH9vQA");
        sheetIDs.add("1qsnSKGI-EybBRQqzEf7NELzYJcTj7tXa5AV_41qqrjQ");

    }

    public String getVideoURL(){
        String domain = "https://imaze2020-dev.now.sh/";
        String url = videoTitles.get(eventTitles.indexOf(eventTitle));
        return (domain + url).replace(" ","%20");
    }

    public  String getSheetID(){
        String sheetid = sheetIDs.get(eventTitles.indexOf(eventTitle));
        return sheetid;
    }
}
