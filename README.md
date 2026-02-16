# Worst Implementation Competition
An implementation of PayrollProgram that seeks to break as many rules as possible from the codedesign book. 
This implementation is a joke and for class competition purposes only. 

## Rules Broken:
* No documentation/comments: This makes it hard for new developers to make contributions, as they are not familiar with the code.
  
* Bad code structure: Makes it hard to understand the code and makes room for potential bugs to be overlooked.

* No defensive program: At risk of bad inputs.

* One file for the entire program: Not only does this make it hard to contribute as a team, but it is also not efficient. It is difficult to navigate and introduces areas for bugs anywhere that data is referenced and modified. 

* Bad variable names: This makes it difficult to read the implementation, but also makes it difficult to track what data is stored and introduces space for errors.
  
* Use of parallel arrays as global variables to track data: This is not efficient and introduces poor scalability, may introduce issues that are not easy to track, and cannot be easily reused if the data changes.
  
* No whitespace (PAYROLLOPTIMAL): Makes it extremely difficult to read and understand.

