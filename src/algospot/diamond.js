/**
 * 다이아 몬드 찍기
 */
(function(maxWidth){
   var space = new Array(Math.ceil(maxWidth / 2));
   var star = "*";
   var starInc = "**";
   var results = [];
   var resultsReverse = [];
   for(; star.length <= maxWidth; star += starInc, space.pop()){
      var line = (space.length > 0 ? space.join(" ") : "") + star;
      results.push(line);
      resultsReverse.unshift(line);
   }
   resultsReverse.shift();
   console.log(results.join("\n") + "\n" + resultsReverse.join("\n"));
})(14)
