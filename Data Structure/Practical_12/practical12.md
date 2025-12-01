In this practical you are implementing a transcript records management system,
based on Java’s LinkedList.
Implement classes Module, Transcript and Unit_12_Test that provide the following
functionality:
+ Class Module:
    - Stores module code, name, credits, grade and year (Year 1, Year 2,
Placement Year, Final Year)
    - Creates a human friendly representation of the class (i.e. toString())
     Allows a total ordering of modules (i.e. modules are Comparable)
 Class Transcript:
 Stores transcript id and a module list
 Allows modules to be inserted into (adding a new module) and removed
from (deleting an existing module) the module list (while maintaining the
list in ascending order based on module year, and for the same year in
descending order based on module grade)
 Allows modules to be updated (changes to grades must be reflected in
the ordering of the corresponding module list)
 The transcript should be printed after every change takes place while
including average grade per year
 Within comments, calculate the Time Complexity Functions of your
implementation and highlight parts leading to sub-optimal complexity
 Class Unit_12_Test:
 A collection of JUnit tests that test the functionality of classes Module
and Transcript (i.e. each aspect implemented as a separate JUnit test)