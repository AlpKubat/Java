Write a Java class named Student.
Student class has name(String), surname(String), id(long) and count(int)
variables. count variable keeps track of the number of students.
Student class has four constructors:
-The first constructor takes student name as parameter
-The second constructor takes student name and student surname as
parameters
-The third constructor takes student name, student surname and student id
as parameters
-The fourth constructor takes a student object as parameter.

• Student class has also a static method named toUpper which capitalizes
name and surname of student object.
• Create a Student object using third constructor which takes your
name,surname and student id as parameters.
• The third constructor should invoke the second constructor which
invokes the first constructor.
• Constructor3->Constructor2->Constructor1
• Create another object which takes the first object as a parameter and call
toUpper method.
• Print name, surname and student id for each object.
• Print the number of students.
• Example output:

Name               Surname        Student ID
Barış                Dinç         19500403001
Faruk		             Mert       12345678900
