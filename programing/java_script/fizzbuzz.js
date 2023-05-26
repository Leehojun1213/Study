'use strict'
{
const num = prompt("Please enter a number:");

for(let i=1; i<=num; i++){
    if(i%3==0 && i%5==0){
        document.write(i+' fizzbuzz<br/>');
    }else if(i%5==0){
        document.write(i+' buzz<br/>');
    }else if (i%3==0){
        document.write(i+' fizz<br/>');
    }else{
        document.write(i+"<br/>");
    }
}
}


bnt.addEventListener('click', () => {
    let omikuzi = Math.floor(Math.random() * 100)   
            if(omikuzi<10){
                result.innerHTML = array[1]
            }else if(omikuzi < 30){
                result.innerHTML = array[2]
            }else if(omikuzi < 60){
                result.innerHTML = array[3]
            }else if(omikuzi < 100){
                result.innerHTML = array[0]
            }
        }
    
    );