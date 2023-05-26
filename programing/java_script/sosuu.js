'use strict';
{const num = 2147483647;
     const startTime = Date.now(); // start time

      let sosuu_flag = true; // sosuu true or false
      for (let i=2; i<num; i++) {
        if (num % i === 0) {
            sosuu_flag = false;
            break;
        }
    }
    if (sosuu_flag == true) {
        console.log(`${num} はそすうです。`);
    } else {
        console.log(`${num} はそすうではありません。`);
    }
    const endTime = Date.now(); // end time
    console.log("it took " + (endTime -startTime) + " msec"); // ms
}