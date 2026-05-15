object main extends App {
  val scores = List(45, 50 ,60 ,70, 80, 85 ,90);
  val topPerformers = for(score <- scores if score > 70) yield {
    s"Top Score : $score"
  }

  println(topPerformers);
}
