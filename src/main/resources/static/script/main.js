/**
 * 
 */

function register() {
	event.preventDefault();
	
	var ok = true;
	var name = document.forms["registerForm"]["name"].value;
	var lastName = document.forms["registerForm"]["lastName"].value;
	var age = document.forms["registerForm"]["age"].value;
	var gender = document.forms["registerForm"]["gender"].value;
	var email = document.forms["registerForm"]["email"].value;
	var password = document.forms["registerForm"]["password"].value;
	var passwordConf = document.forms["registerForm"]["passwordConf"].value;
	
	if (password != passwordConf) {
		alert("Ambas contraseñas deben coincidir.")
		ok = false;
	}
	
	if(ok) {
		alert(name)
		$.ajax({
			type: "POST",
			url: "/register",
			data: {
				name : name,
				lastName : lastName,
				age : age,
				gender : gender,
				email : email,
				password : password
			}
		})
	}
}