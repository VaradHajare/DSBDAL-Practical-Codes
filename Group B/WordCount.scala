object WordCount {

  def main(args: Array[String]): Unit = {

    // Input text
    val lines = List(
      "hello spark",
      "hello scala",
      "big data spark",
      "spark framework"
    )

    // Split lines into words
    val words = lines.flatMap(line => line.split(" "))

    // Count occurrences
    val wordCounts = words.groupBy(word => word)
                          .mapValues(_.size)

    // Print results
    println("Word Counts:")

    wordCounts.foreach {
      case (word, count) =>
        println(word + " -> " + count)
    }
  }
}
