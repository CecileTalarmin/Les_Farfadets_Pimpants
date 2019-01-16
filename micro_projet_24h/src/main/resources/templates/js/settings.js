var modal = document.getElementById('myModal');
// Get the button that opens the modal
var btn = document.getElementById("myBtn1");
// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];
// When the user clicks the button, open the modal 

btn.onclick = function() {
  modal.style.display = "block";
  btn1_pressed = true;
}
// When the user clicks on <span> (x), close the modal
span.onclick = function() {	
  modal.style.display = "none";
}
// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {	
  if (event.target == modal) {
    modal.style.display = "none";
  }
}


var btn1_pressed = false;
var btn2_pressed = false;
var btn3_pressed = false;
var btn4_pressed = false;
var btn5_pressed = false;
var btn6_pressed = false;

function reset(){
	btn1_pressed = false;
	btn2_pressed = false;
	btn3_pressed = false;
	btn4_pressed = false;
	btn5_pressed = false;
	btn6_pressed = false;
}

function btn2_click(){
	btn2_pressed = true;
	modal.style.display = "block";
}
function btn3_click(){
	btn3_pressed = true;
	modal.style.display = "block";
}
function btn4_click(){
	btn4_pressed = true;
	modal.style.display = "block";
}
function btn5_click(){
	btn5_pressed = true;
	modal.style.display = "block";
}
function btn6_click(){
	btn6_pressed = true;
	modal.style.display = "block";
}

function change_image(source){
	if(btn1_pressed){
		var image = document.getElementById("cat1");				
	}
	if(btn2_pressed){
		var image = document.getElementById("cat2");
	}
	if(btn3_pressed){
		var image = document.getElementById("cat3");
	}
	if(btn4_pressed){
		var image = document.getElementById("cat4");
	}
	if(btn5_pressed){
		var image = document.getElementById("cat5");
	}
	if(btn6_pressed){
		var image = document.getElementById("cat6");
	}
	image.src = source;
	reset();
	modal.style.display = "none";
}

$('.img1').click(function(){
  	var images = $('.img1').attr('src');
  	change_image(images);
});
$('.img2').click(function(){
  var images = $('.img2').attr('src');
  change_image(images);   
});
$('.img3').click(function(){
  var images = $('.img3').attr('src');
  change_image(images);     
});
$('.img4').click(function(){
  var images = $('.img4').attr('src');
  change_image(images);    
});
$('.img5').click(function(){
  var images = $('.img5').attr('src');
  change_image(images);    
});
$('.img6').click(function(){
  var images = $('.img6').attr('src');
  change_image(images);      
});
$('.img7').click(function(){
  var images = $('.img7').attr('src');		 
  change_image(images); 
});
$('.img8').click(function(){
  var images = $('.img8').attr('src');
  change_image(images);  
});
$('.img9').click(function(){
  var images = $('.img9').attr('src');
  change_image(images);    
});
$('.img10').click(function(){
  var images = $('.img10').attr('src');
  change_image(images);    
});
$('.img11').click(function(){
  var images = $('.img11').attr('src');
  change_image(images);
});
$('.img12').click(function(){
  var images = $('.img12').attr('src');
  change_image(images);	
});