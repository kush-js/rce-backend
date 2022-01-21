package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import liquibase.Liquibase;
import liquibase.database.Database;
import liquibase.database.DatabaseFactory;
import liquibase.database.jvm.JdbcConnection;
import liquibase.exception.LiquibaseException;
import liquibase.resource.ClassLoaderResourceAccessor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// Please config the creds or something...;
		System.out.println("Run the Demo App class.");
		
		try{
            Connection c = DriverManager.getConnection(
			    "jdbc:postgresql://localhost:5432/regedb",
        	    "duce", "Th3Dem0Hou$e"
			);

            System.out.println(
                "\nConnected to regedb.\n"
                );

            Database database = DatabaseFactory.getInstance()
                .findCorrectDatabaseImplementation(new JdbcConnection(c));

            System.out.println(
                "\nDatabase instantiated.\n"
                );

            Liquibase liquibase = new Liquibase("classpath:/db/changelog/db-changelog.xml",
            //Liquibase liquibase = new Liquibase("classpath:db-changelog.xml", 
                new ClassLoaderResourceAccessor(), database);

            System.out.println(
                "\nInvoke Liquibase update:"
                );

            liquibase.update(""); 
            
        } catch( liquibase.exception.DatabaseException ldbEx ){
            ldbEx.printStackTrace();
        } catch( java.sql.SQLException sqlEx ){
            sqlEx.printStackTrace();
        } catch( java.lang.Exception lEx ){
            lEx.printStackTrace();
        } 
		
		SpringApplication.run(DemoApplication.class, args);

	}

};

