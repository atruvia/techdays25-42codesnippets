A list of java snippets presented at Atruvia TechDays25

# 

# Autocomplete for java command
To get java files proposed when autocomplete after ´´´java ´´´ add the following into your ´´´.zshrc´´´

´´´bash
_java_source_completion() {
  _files -g '*.java'
}

compdef _java_source_completion java
´´´
