var interval;

function scrollRight1(){
  interval = setInterval(function(){ document.getElementById('scroller1').scrollLeft += 5 }  , 5);
};
function scrollLeft1(){
  interval = setInterval(function(){ document.getElementById('scroller1').scrollLeft -= 5 }  , 5);
};

function scrollRight2(){
  interval = setInterval(function(){ document.getElementById('scroller2').scrollLeft += 5 }  , 5);
};
function scrollLeft2(){
  interval = setInterval(function(){ document.getElementById('scroller2').scrollLeft -= 5 }  , 5);
};

function scrollRight3(){
  interval = setInterval(function(){ document.getElementById('scroller3').scrollLeft += 5 }  , 5);
};
function scrollLeft3(){
  interval = setInterval(function(){ document.getElementById('scroller3').scrollLeft -= 5 }  , 5);
};

function scrollRight4(){
  interval = setInterval(function(){ document.getElementById('scroller4').scrollLeft += 5 }  , 5);
};
function scrollLeft4(){
  interval = setInterval(function(){ document.getElementById('scroller4').scrollLeft -= 5 }  , 5);
};

function clearScroll(){
  clearInterval(interval);
};







