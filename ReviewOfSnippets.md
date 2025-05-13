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
* With java24 execute like this: `java --enable-preview S04_MainMethodFirst.java`
* Main method (and enclosing class / interface) should be the first member of a file
* Otherwise main method will not be found
* Renaming enclosing class / interface to `S04_MainMethodFirst` solves the problem
* Placing only the main method at the end of the file also solves the problem

## S05_Timer
* Simple timer & timertask
* unit in milliseconds

## S06_ScheduledThreadPool
* Executer with more readable interval config

## S07_FileWatch
* Watch for new file, and continue 

## S08_JWTClipboardDecoder
* Read your clipboard and (try to ) decode the JWT within.

## S09_ReadFromConsole
* Read from console..

## S10_ReadPassword
* Read a password form console

## S11_Emojis 
* Emojis can also be used on console

## S12_SystemOutlnColor
* Shell coloring can also be used

## S13_TerminalReset
* Like color but other terminal control sequence

## S14 CompactNumberFormat
* Get Numbers easy readable.. but it does round numbers!

## S15 UnderScoresInNumbers

## S16 UtilLogger
* Build-in simple logger 
* Snippet print the defaulf config for you jre
* could be overwritten bei own log config file and `java -Djava.util.logging.config.file=myloggingconfig.properties S15_UtilLogger.java`

## S17_Asserts
* oldie but goldie

## S18_FunctionalInterface
* annotation advised compiler to look for a single method
* a compiler function (not a runtime check)

## S19_AttributeDefaultOptional
* Null check and default value with optional

## S20_Ternary
* Null check and default value with ternary operator

## S21_ObjectsPreconditions
* Null check with Object.require..

## S22_Formatted
* format message with parameter

## S23_PositionInFormatted
* format message with parameter AND index

## S24_CreateTempFolder
* creates a temp folder in temp dir (in $TMPDIR)

## S25_DirectoryStream
* can be left out




## S37_ListLastElement
* new since Java 21

## S47_EnumConstructors
* Enum constructors are private by default
* They can have parameters and body
* See HttpStatus from spring web that is a more sophisticated enumeration
