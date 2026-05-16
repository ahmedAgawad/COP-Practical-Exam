object main extends App {
  val matchesScores = List(120, 45, 200, 30 , 320, 10);
  val validScores = matchesScores.filter((score) => { score > 50 });
  val totalXP = validScores.foldLeft(1000)((acc, curr) => {acc + curr})
  val maxScore = validScores.reduce((acc, curr) => { acc max curr})



  def getVipMutliplier(vipTier : Int) : (Int) => Double  = {
    if(vipTier == 1) {
      ( score : Int  ) => { score * 1.5};
    } else if (vipTier == 2) {
       ( score :Int ) => { score * 2}
    } else {
       (score : Int ) => { score * 1.0}
    }
  }

  var applyMultiplier = getVipMutliplier(2);
  val finalRankScore = applyMultiplier(totalXP);
  println(finalRankScore);
  println(maxScore)
}
