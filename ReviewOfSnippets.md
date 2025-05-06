This file contains some notes for each snippet (for presentation )

## S01_BoringMain
* nothing special.. just boring

## S02_MainInterface
* interface vs class
* no public (is public anyway as it is interface)

## S03_ShortestMain
* Unnamed classes.. since java21 (as preview)
* With java24 execute like this: `java --enable-preview S03_ShortestMain.java`

## S04_MainMethodFirst
* Main method (and enclosing class / interface) should be the first member of a file
* Otherwise main method will not be found
* Renaming enclosing class / interface to `S04_MainMethodFirst` solves the problem with Java 24 preview mode

## S47_EnumConstructors
* Enum constructors are private by default
* They can have parameters and body
* See HttpStatus from spring web that is a more sophisticated enumeration
 