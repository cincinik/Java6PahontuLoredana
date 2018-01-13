/* package for creating the tables in the EBooks Data Base
 * Version 1.0
 * © 2018 Lori, Inc. All rights reserved.
 */
package eBooksApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**Class that is creating tables in the database for the EBooks app
 * @author Lori
 * @version 1.0 January 2018
 */
public class EBooksDataBase {

    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       // DB username
       String user = "lori";
       //db password
       String password = "lori"; 
       //link to db lcation
       String url = "jdbc:derby://localhost:1527/e_book_app;create = true";
       // driver link
       String driver = "org.apache.derby.jdbc.ClientDriver";
       // variable for accessiong the connection with the db
       Connection connection = null;
       // variable to operate on the db
       Statement statement = null;
       // varaiable returning select queries results
       ResultSet resultSet = null; 
       
       
       try
        {
            Class driverClass = Class.forName(driver);
            //connecting to db
            connection = DriverManager.getConnection(url, user, password);
            //create sql statements
            statement = connection.createStatement();
            // create specified table
            statement.execute("create table BOOK_GENRES(GENRE VARCHAR(25) PRIMARY KEY)");
            // insert records into specified columns/table
            statement.execute("INSERT INTO BOOK_GENRES (GENRE) VALUES ('FICTION'),('ROMANCE'),('BIOGRAPHY'),('HISTORY'),('RELIGION'),('PSYCHOLOGY')");
            // create specified table
            statement.execute("create table EBOOK_AUTHROS(ID INT PRIMARY KEY,ISBN VARCHAR(50),CNP VARCHAR(13))"); 
            // create specified table
            statement.execute("create table BOOK_AUTHROS(CNP VARCHAR(13) PRIMARY KEY,FIRST_NAME VARCHAR(30),FAMILY_NAME VARCHAR(30))"); 
            // create specified table
            statement.execute("create table EBOOK_RATINGS_USERS(ID INT PRIMARY KEY,RATING VARCHAR(5),CNP VARCHAR(13),ISBN VARCHAR(50))");
            // create specified table
            statement.execute("create table RATINGS(RATING VARCHAR(5) PRIMARY KEY)");
            // create specified table
            statement.execute("create table USERS(CNP VARCHAR(13) PRIMARY KEY,NAME VARCHAR(50),PASSWORD VARCHAR(50))");
            // create specified table
            statement.execute("create table BOOK_TYPES(TYPE VARCHAR(25) PRIMARY KEY)");
            // insert records into specified columns/table
            statement.execute("INSERT INTO BOOK_TYPES (TYPE) VALUES ('PRINTED'),('EBOOK'),('AUDIOBOOK')");
            // make a select querry from the specified table
            resultSet = statement.executeQuery("SELECT * FROM BOOK_TYPES");
            //variable to hold each cell record
            String currentTYPE = "";
            //print the column name
            System.out.println("TYPE");
            //separate column name from records
            System.out.println("==========");
            // while loop throuh each row of the table
            while(resultSet.next()){
            // get current cell value
            currentTYPE = resultSet.getString(1);
            // print values
            System.out.println(currentTYPE);
            }
        }
       catch (Exception ex) {
           System.out.println(ex);
       }
    }
}
