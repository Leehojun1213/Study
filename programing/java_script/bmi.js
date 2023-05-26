'usr strict';
const weith = 80;
const height = 180 / 100;

let bmi = weith / (height * height);
let BMI = bmi;
console.log(BMI);

if( BMI < 18.5){
    console.log('underweight');
}else if(BMI >= 18.5 && BMI < 25){
    console.log('healthy weight');
}else if(BMI >= 25 && BMI < 30){
    console.log('overweiht');
}else{
    console.log('obesity')
}