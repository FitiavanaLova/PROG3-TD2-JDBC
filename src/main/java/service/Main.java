package service;

package org.example;

import org.example.model.Team;
import repository.DataRetriever;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    public static void main(String[] args) throws Exception {

        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/mini_football_db",
                "postgres",
                "postgres"
        );

        DataRetriever dataRetriever = new DataRetriever(connection);

        Team team = dataRetriever.findTeamById(1);

        try {
            System.out.println("Total buts : " + team.getPLayersGoals());
        } catch (RuntimeException e) {
            System.out.println("ERREUR : " + e.getMessage());
        }
    }
}

