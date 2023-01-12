# Companies-database

Code a program with text-based user interface for keeping track of the companies in McDuck Enterprises. The database contains each company’s name, CEO’s name, address and phone number of the main office and the last year’s sales. (“Database” here means just a collection of data. The data will be saved in files, not actual database.)
When the program starts, the database is empty.

Your program should contain the following features.

• Listing the names of all companies in the database

• Adding a company to the database. If a company with the same name already exists, the
new one won’t be added and an error message is show (e.g. “The company already exists.”)

• Deleting a company from the database. If the company does not exist, show an error
message.

• Seaching for a company by name. Print company information.

• Editing specific company’s information. The company is specified by name.

• Reading the database from file (meaning: read it from file into the data structure, not read
and print it). The user must provide a filename.

• Saving the database into a file. The user must provide a filename.

• Quitting the program.

Divide the functionality into classes (e.g. Company objects and Database class) and methods in some logical way. Main method should contain as little code as possible.
The recommended data structure is HashMap, but ArrayList also works. Your choice has no effect on grading – as long as you can make it work, either is fine. If you choose HashMap, be careful that changing the company name doesn’t break the system (since the name functions as the key).
The easiest way to save the database in a file is to dump the entire ArrayList / HashMap object into a binary file. Here is an excellent tutorial for it: https://mkyong.com/java/how-to-read-and-write-java- object-to-a-file/ (You are also allowed to use a text-based file – just saying that this is so much easier.)
  
Note that when saving the ArrayList / HashMap object into a binary file, the objects inside it must also implement Serializable interface. Both ArrayList and HashMap already implement it.
