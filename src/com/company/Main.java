package com.company;

public class Main {
    public static void main(String[] args) {


// executes a SELECT ALL query
          //  new Select().baseSelect();

       //executes a SELECT query with condition
           new Select().conditionalSelect();

//executes an INSERT query
       // new Insert().crudInsert();

        //executes an UPDATE query
               //new Update().updateCategory();

        // executes a DELETE query
              //new Delete().crudDelete();

//executes a BULK INSERT from a .csv file
     //   new BulkInsert().crudBulkInsert();


        //System.out.println(args[0] + " " + args[1]);
    }
   }