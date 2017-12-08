-- *****************************************************************************
-- ***                                                                       ***
-- *** File Name:     demo1_queries.sql                                      ***
-- ***                                                                       ***
-- *** Run as:        demo_user                                              ***
-- ***                                                                       ***
-- *** Database:      jpa_demo                                               ***
-- ***                                                                       ***
-- *** Description:   SQL Queries to View Demo #1 Table Data                 ***
-- ***                                                                       ***
-- *****************************************************************************
   SHOW TABLES;

-- ***************************
-- *** Select All Products ***
-- ***************************
   SELECT * FROM demo1_product;

-- ************************************************
-- *** View the System Generated Sequence Table ***
-- ************************************************
   DESC sequence;
