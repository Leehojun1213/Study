'use strict'
{
    const age = prompt("나이를입력해주세요");
    if(age < 18){
        console.log('입장료는 500만원입니다.')
    }else if(age >= 18 && age < 65){
        console.log('입장료는 1000만원입니다.')
    }else{
        console.log('입장료는 700만원입니다.')
    }
}