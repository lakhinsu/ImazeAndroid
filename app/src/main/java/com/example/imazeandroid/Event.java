package com.example.imazeandroid;

import java.util.ArrayList;

public class Event {
        ArrayList<String> coordinators_info;
        String event_title;
        String event_description;
        String judgement_criteria;
        String rounds_info;
        String image_name;

    public ArrayList<String> getCoordinators_info() {
        return coordinators_info;
    }

    public void setCoordinators_info(ArrayList<String> coordinators_info) {
        this.coordinators_info = coordinators_info;
    }

    public String getEvent_title() {
        return event_title;
    }

    public void setEvent_title(String event_title) {
        this.event_title = event_title;
    }

    public String getEvent_description() {
        return event_description;
    }

    public void setEvent_description(String event_description) {
        this.event_description = event_description;
    }

    public String getJudgement_criteria() {
        return judgement_criteria;
    }

    public void setJudgement_criteria(String judgement_criteria) {
        this.judgement_criteria = judgement_criteria;
    }

    public String getRounds_info() {
        return rounds_info;
    }

    public void setRounds_info(String rounds_info) {
        this.rounds_info = rounds_info;
    }

    public String getImage_name() {
        return image_name;
    }

    public void setImage_name(String image_name) {
        this.image_name = image_name;
    }
}
