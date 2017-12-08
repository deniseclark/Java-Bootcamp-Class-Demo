-- *****************************************************************************
-- ***                                                                       ***
-- *** File Name:     demo6_queries.sql                                      ***
-- ***                                                                       ***
-- *** Run as:        demo_user                                              ***
-- ***                                                                       ***
-- *** Database:      jpa_demo                                               ***
-- ***                                                                       ***
-- *** Description:   SQL Queries to View Demo #6 Table Data                 ***
-- ***                                                                       ***
-- *****************************************************************************
   SHOW TABLES;

-- *******************************
-- *** Select All Universities ***
-- *******************************
   SELECT * FROM demo6_university;

-- ****************************
-- *** Select all Students  ***
-- ****************************
   SELECT * FROM demo6_student;

-- ***************************************************************
-- *** Select all Students and thier Corresponding University  ***
-- *** (See Notes on FK Column Name)
-- ***************************************************************
   SELECT u.name, s.first_name, s.last_name, s.student_id, u.university_id
   FROM demo6_university u,
        demo6_student    s
   WHERE s.university_university_id = u.university_id
   ORDER by u.name, s.last_name;


