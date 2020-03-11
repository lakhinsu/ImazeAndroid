package com.example.imazeandroid;

import java.util.ArrayList;

public class Event {
    ArrayList<String> coordinators_info;
    String event_title;
    String event_description;
    ArrayList<String> judgement_criteria;
    String team_size;
    ArrayList<String> rounds_info;

    public String getTeam_size(){
        return  team_size;
    }

    public void setTeam_size(String team_size){
        this.team_size = team_size;
    }

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

    public ArrayList<String> getJudgement_criteria() {
        return judgement_criteria;
    }

    public void setJudgement_criteria(ArrayList<String> judgement_criteria) {
        this.judgement_criteria = judgement_criteria;
    }

    public ArrayList<String> getRounds_info() {
        return rounds_info;
    }

    public void setRounds_info(ArrayList<String> rounds_info) {
        this.rounds_info = rounds_info;
    }

}