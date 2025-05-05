A list of java snippets presented at Atruvia TechDays25

Execution of those snippets should be as easy as calling ´´´java S01_BoringMain.java´´´.

Most of the snippets should work with a current java (as of writing this it is java 19), but some require java 21 or even enabling previewing latest feature by adding ´´´--enable-preview´´´as option for ´´´java´´´ command

## Autocomplete for java command
To get java files proposed when autocomplete after ´´´java ´´´ add the following into your ´´´.zshrc´´´

´´´bash
_java_source_completion() {
  _files -g '*.java'
}

compdef _java_source_completion java
´´´
