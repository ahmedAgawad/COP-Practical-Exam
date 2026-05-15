object main extends App {
  val isValidMatch = (score1: Int, score2: Int) => {
    if (score1 + score2 > 20) {
      true;
    } else {
      false;
    }
  }

  var groupA = Range(1, 6);
  var groupB = Range(15, 21);

  println(groupA)
  val successfulMatches =  for (aScore <- groupA; bScore <- groupB ;if isValidMatch(aScore, bScore)) yield {
    s"Matched Player $aScore with Player $bScore";
  }

  println(successfulMatches)

 }
