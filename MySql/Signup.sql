Create database banksystem;
use banksystem;
Create table signup(Form_no varchar(30),Name varchar(30), Fname varchar(30), DOB varchar(30),
Gender varchar(30),Email varchar(100), Marital_Status varchar(30),Address varchar(100), 
City varchar(30), PinCode varchar(30),State varchar(30));
Select * From signup;

Create table Signup2(Form_No varchar(30), Religion varchar(30),Category varchar(30),Income varchar(30),
Education_Qualification varchar(30),Occupation varchar(30), Pan_Number varchar(30),Aadhar_Number varchar(30),
Seniour_Citizen varchar(30), Existing_Account varchar(30));
select * From Signup2;

Create table Signup3(Form_No varchar(30),Account_type varchar(30), Card_Number varchar(30),Pin varchar(30),Service_Required varchar(300));
select * From Signup3;

Create table Login(Form_No varchar(30), Card_Number varchar(30), Pin varchar(30));
select * From Login;
