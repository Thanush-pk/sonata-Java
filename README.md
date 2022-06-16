question
ABC Solutions Ltd decided to track the time spent by Employees on their daily activities. The idea 
was to efficiently monitor and track the time spent by employees on various activities and effectively 
generate reports. 
Below are the expected features from time tracking application.
• The employee should be able to create timesheet with proper details every day.
• The employee should be able to view filled in timesheet before submitting for approval.
• The manager should be able to view and approve/reject timesheets that are waiting for 
approval
• The manager should be able to searching for timesheets employee wise / date wise
Write Java classes as per the details given below
1. Create a class “Employee” with the below attributes
a. Emp id – int
b. Emp name – String
c. Project name – String
d. Employee Address – Address
2. Create a class Address with the details like street, city, state and pin
3. Create a class Manager which is inherited from Employee class and add additional attributes 
like client name, no of people reporting, list timesheet assigned for approval
4. Crete a class “TimeSheet” with the below attributes
a. Timesheet id - int
b. TimesheetDate - Date
c. Activity-string
d. Description-string
e. HoursSpent-int
f. Status- Enum (Enum values - Approved/Rejected/submitted )
5. Create an interface “TimeSheetInterface” with the methods to below tasks
a. Create time sheet for a given employee id, date, activity
b. Add the time sheet to a list
c. Change the time sheet status for a given time sheet
d. Get all time sheet of a given employee.
6. Create a class “DefaultTimeSheetImpl” which implements above interface and implement all 
methods.
7. Create custom exception “DuplicateTimeSheetException” and throw if duplicate time sheet 
is added to the list.
8. Override the toString() method in each class to display the class name and the person’s 
name. 
9. Follow coding standard.
10. Write a UsingTimeSheet class which creates a few instances of the classes in its main() 
method, and shows how they can be used.
