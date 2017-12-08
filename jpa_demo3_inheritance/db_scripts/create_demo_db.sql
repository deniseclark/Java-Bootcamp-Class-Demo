-- *****************************************************************************
-- ***                                                                       ***
-- *** File Name:     create_db_jpa_demo.sql                                 ***
-- ***                                                                       ***
-- *** Run as:        root                                                   ***
-- ***                                                                       ***
-- *** Database:      jpa_demo                                               ***
-- ***                                                                       ***
-- *** Database User: demo_user/demo_user                                    ***
-- ***                                                                       ***
-- *** Description:   This SQL Script will Create a New Local Database in    ***
-- ***                the MySQL Repository Called JPA_DEMO.                  ***
-- ***                Additionally, a User Account will be Created Called    ***
-- ***                DEMO_USER that has full Access to the JPA_DEMO         ***
-- ***                Database.                                              ***
-- ***                                                                       ***
-- *****************************************************************************
   DROP DATABASE IF EXISTS jpa_demo; 
   CREATE DATABASE jpa_demo;


   USE jpa_demo;



   DROP USER IF EXISTS demo_user@localhost;


   CREATE USER demo_user@localhost IDENTIFIED BY 'demo_user';

   GRANT ALL PRIVILEGES ON jpa_demo.* TO demo_user@localhost;
