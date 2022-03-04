package com.company;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> { // By establishing an upper bound on the classes type you don't have to use casting in line 27-28.
    private String name;
     int played = 0;
     int wins = 0;
     int losses = 0;
     int ties = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(T player){
        if(this.members.contains(player)){
            System.out.println("Player already forms part of the team.");
        } else {
            this.members.add(player);
           // System.out.println(((Player) player).getName() + " was added to the team");
            System.out.println(player.getName() + " was added to the team");

        }
    }
    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message;
        if(ourScore > theirScore){
            wins++;
            message = "beat";
        }else if(ourScore == theirScore) {
            ties++;
            message = "drew with";
        }else {
            losses++;
            message = "lost to";
        }
        played++;
        if(opponent != null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, ourScore, theirScore);
        }
    }

    public int ranking(){
        return (wins * 2) + ties;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()){
            return -1;
        } else if(this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }

    }
}
