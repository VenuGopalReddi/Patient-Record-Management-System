1.	The program runs and opens a page containing “Initialize DB” button.
2.	The program directs to a “Login” page of “Patients Like Me”.
3.	Enter the “username” and “password”
4.	Username= “sampledb”.
5.	Password = “pass1234”.


Input new patient:

1.	Fill all the information like (PATIENT_ID, FIRST NAME, LAST NAME, AGE, GENDER, EMAIL) and then click on the “INSER” button to add new patient to the table.
2.	Patient ids will be generated automatically by the system and each patient id should have 3 digits exactly. 

Search A Patient:

You can search a patient by two ways:

•	Search with Patient id:

Enter the Patient Id (eg: 100), and click on the “PAT_ID” button which displays all the information of the patient who is having that patient id.

•	Search a patient by patient id, and search a patient by an arbitrary “AND” combination of other attributes (fist name, last name, gender, age, email). 

Enter the Patient Id AND combination of other attributes (fist name, last name, gender, age, email). 
(eg: 100+other attribute), and click on the “PAT_ID+OTHER” button which displays all the information of the patient who is having that patient id and any one of the other attribute.

For the second part of the project. I have done the following operations.
I have placed a button named “Tasks”, which contains all the 10 tasks which displays all the 10 queries accordingly.

1. I have done the operations of Insert/delete/update a patient (all attributes) without symptoms, conditions, and treatments. 
2. In the second query I have done the operations of Insert/delete/update a symptom for a given patient. A timestamp needs to be recorded for such an event. 
3. In the 3rd query I have done the operations of Insert/delete/update a condition for a given patient. A timestamp needs to be recorded for such an event.
 4. I have done the operations of Insert/delete/update a treatment for a given condition. A timestamp needs to be recorded for such an event.
 5. I have done the operations of Search patients that have both symptoms “cough” and “fatigue” right now. 
6. I have done the operations of Search patients that have conditions “diabetes” sometime in the past but have no such conditions now. 
7. I have done the operations of Given a patient X (user specified), find the patients who sent the most number of message to patient X. If there is a tie among several such patients, then list them all; otherwise, just list one. 8. Find the patients who are under treatment “physical therapy” and who have never sent out any messages.
 9. I have done the operations of  Find the patients who are the second oldest in the database.If there is a tie among several such patients, then list them all; otherwise, just list one. 
10. I have done the operations of Find a female patient who sent a message to a patient who has the condition “diabetes” now.
