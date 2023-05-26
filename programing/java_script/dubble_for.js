'use strict'
{
/* for(let i=1; i<=3; i++){
    for(let j=1; j<=5; j++){
        console.log(i*10+j);
    }
    console.log('_______');
} */
//let SS = 1;
for(let i=2; i<=100; i++){
    let T = false;

    for(let j=2; j<i; j++){
        if(i%j == 0){
            T = true;
            break;
        }
    }
    if(T==false){
     //SS += i;
     console.log(i);
    } 
}

/* for(let i=1; i<=3; i++){
    for(let j=1; j<=5; j++){
        console.log(i*10+j);
    }
    console.log('_______');
}
 */}