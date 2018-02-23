package com.company;

import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {

        System.out.println("Start generation");
        try {
                PrintWriter writer = new PrintWriter("data.csv", "UTF-8");
                for (int i = 0; i < 1000; i++) {
                    writer.println(i +"; The first line " + i +";The second line " + i + "; The third line " + i +";" + i + ";" + i*2+i + ";" + i*3+i + ";" + i*4+i + ";" + i*5+i + ";" + i*6+i + ";" + i*7+i + ";" + i*8);
                }
                writer.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("CSV - Done");

        String create_sql = "CREATE TABLE test (\n" +
        "    id        integer PRIMARY KEY,\n" +
        "    field_1   varchar(40) NOT NULL,\n" +
        "    field_2   varchar(40) NOT NULL,\n" +
        "    field_3   varchar(40) NOT NULL,\n" +
        "    field_4   integer NOT NULL,\n" +
        "    field_5   integer NOT NULL,\n" +
        "    field_6   integer NOT NULL,\n" +
        "    field_7   integer NOT NULL,\n" +
        "    field_8   integer NOT NULL,\n" +
        "    field_9   integer NOT NULL,\n" +
        "    field_10  integer NOT NULL\n" +
        ");";

        try {
            PrintWriter writer1 = new PrintWriter("postgre.sql", "UTF-8");
            writer1.println(create_sql);
            for (int i = 1; i < 1001; i++) {
                writer1.println("INSERT INTO test (id, field_1, field_2, field_3, field_4, field_5, field_6, field_7, field_8, field_9, field_10) VALUES ( "+i+"," +
                        "'The first line " +i+"',"+
                        " 'The second line " + i + "'," +
                        " 'The third line " + i +"'," +
                        i + "," +
                        i*2+i + ","
                        + i*3+i + ","
                        + i*4+i + ","
                        + i*5+i + ","
                        + i*6+i + ","
                        + i*7+i + ");"
                        );
            }
            writer1.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("SQL - Done");
    }
}
