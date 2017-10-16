package com.arun

object Anagram {
  def main(args: Array[String]) {
    println("Hello World");
    var word = "abr";
    ascii(word);
  }

  def ascii(word: String) {
    var sum = 0;
    for (i <- 0 to word.length() - 1) {
      sum = sum + word(i);
    }
    println(sum);
  }
}