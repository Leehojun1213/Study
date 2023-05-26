'use strict';
{
    const num = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15];
    
    const num_rand = [];

  for(let i = 0; i < 5; i++){
      let test = Math.floor(Math.random() * num.length)
    let pull = num.splice(test, 1)[0];
    num_rand.push(pull);
  }
console.log(num);
console.log(num_rand);

    for(let i = 0; i < 5; i++){
        let Rand = Math.floor(Math.random() * num.length)
        num_rand[i] = num[Rand]
        num.splice(Rand, 1)
    }

console.log(num);
console.log(num_rand);

let temp = 0;
  for(let i = 0; i < 5; i++){
    let Rand = Math.floor(Math.random() * num.length)
    temp = num[0]
		num[0] = num[Rand]
		num[Rand] = temp
		num_rand[i] = num[0]
    num.shift()
    }
}