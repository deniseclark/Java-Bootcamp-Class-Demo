-- *****************************************************************************
-- ***                                                                       ***
-- *** File Name:     demo2_queries.sql                                      ***
-- ***                                                                       ***
-- *** Run as:        demo_user                                              ***
-- ***                                                                       ***
-- *** Database:      jpa_demo                                               ***
-- ***                                                                       ***
-- *** Description:   SQL Queries to View Demo #2 Table Data                 ***
-- ***                                                                       ***
-- *****************************************************************************
   SHOW TABLES;

-- ***************************
-- *** Select All Products ***
-- ***************************
   SELECT * FROM demo2_product;

-- ***************************
-- *** Select All Books    ***
-- ***************************
   SELECT * FROM demo2_book;

-- ***************************
-- *** Select All Software ***
-- ***************************
   SELECT * FROM demo2_software;

-- **********************************
-- *** View Only Book Products    ***
-- **********************************
   SELECT p.*, b.*
   FROM demo2_product p,
        demo2_book    b
   WHERE p.product_type = 'B'
     AND p.product_id = b.product_id;

-- ***********************************
-- *** View Only Software Products ***
-- ***********************************
   SELECT p.*, s.*
   FROM demo2_product  p,
        demo2_software s
   WHERE p.product_type = 'S'
     AND p.product_id = s.product_id;

-- ************************************************************
-- *** View All Product Types and Product Specific Details  ***
-- ************************************************************
   SELECT p.*, 
          b.isbn, 
          s.version
   FROM demo2_product AS p 
        LEFT OUTER JOIN demo2_book     AS b ON p.product_id = b.product_id
        LEFT OUTER JOIN demo2_software AS s ON p.product_id = s.product_id;

