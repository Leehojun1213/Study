'use strict'
const bnt = document.getElementById('btn');
const result = document.getElementById('result');
let array = ['凶','大吉','中吉','小吉']
let test = [10, 20, 30, 40]
bnt.addEventListener('click', () => {
    let omikuzi = Math.floor(Math.random() * 100)  
    result.style.color = "red"; 
            if(omikuzi<10){
                result.innerHTML = array[1]
                
            }else if(omikuzi < 30){
                result.innerHTML = array[2]
            }else if(omikuzi < 60){
                result.innerHTML = array[3]
            }else if(omikuzi < 100){
                result.innerHTML = array[0]
                result.style.color = "black";
            }
});


// switch(omikuzi){
//     case(0):
//     result.innerHTML = '凶';
//     break;
//     case(1):
//     result.innerHTML = '大吉';
//     break;
//     case(2):
//     result.innerHTML = '中吉';
//     break;
// }
//result.innerHTML = array[omikuzi];
