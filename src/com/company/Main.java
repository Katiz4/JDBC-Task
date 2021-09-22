package com.company;

public class Main {
    public static void main(String[] args) {
        try {
            Connections.username = args[0];
            Connections.password = args[1];
            Connections.dbUrl = args[2];
        } catch (Exception e) {
            System.out.println("Arguments are not set");
        }

        /* executes a SELECT ALL query */
      // new Select().baseSelect();

        /* executes a SELECT query with condition */
        //new Select().conditionalSelect();


        /* executes an INSERT query */
       //new Insert().crudInsert();

        /* executes an UPDATE query */
        // new Update().updateCategory();

        /* executes a DELETE query */
        //new Delete().crudDelete();

        /* executes a BULK INSERT from a .csv file */
      new BulkInsert().crudBulkInsert();


    }
}
