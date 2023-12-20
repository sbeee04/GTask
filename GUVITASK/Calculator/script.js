
const inputField = document.getElementById('result');
inputField.addEventListener('keypress', function(event) {
    const keyCode = event.keyCode;

    // Allow only numbers (keycodes 48-57 for 0-9) and special keys like Backspace (keycode 8)
    if ((keyCode < 48 || keyCode > 57) && keyCode !== 8) {
        event.preventDefault(); // Prevent the character from being entered
    }
});
       
    
           
           // Function that clear the display 
            function clr(){
                document.getElementById("result").value=""
            }

            // Function that display value 
            function dis(val) { 
                //alert("Only number is allowed")
              document.getElementById("result").value+= val 
        } 

        function myfunc(event){
            if (event.key == '(' || event.key == ')' || event.key == '0' || 
                event.key == '1' || event.key == '2' || event.key == '3' || 
                event.key == '4' || event.key == '5' || event.key == '6' || 
                event.key == '7' || event.key == '8' || event.key == '9' || 
                event.key == '+' || event.key == '-' || event.key == '*' || event.key == '/') 
               document.getElementById("result").value+=event.key;

        }

        var cal = document.getElementById("Cal");
        //function(event) is a nanonymous function
        cal.onkeyup = function(event){
            if(event.keyCode === 13){
                console.log("Enter");
                let x = document.getElementById("result").value
                console.log(x);
                solve();
            }
        }

        function equal(){
            let x = document.getElementById("result").value
            let y = eval(x)
            document.getElementById("result").value=y
        }

        

