'use strict'

const arr = [5, 3, 4, 2, 1];

function bubbleSort(arr) {
    var len = arr.length;
    for (var i = len-1; i>=0; i--){
      for(var j = 1; j<=i; j++){
        if(arr[j-1]>arr[j]){
            var temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
         }
      }
    }
    return arr;

  }
// bubbleSort(arr);
// console.log(arr);

  function bubbleSortDescending(arr) {
    var len = arr.length;
    for (var i = len-1; i >= 0; i--) {
      for (var j = 1; j <= i; j++) {
        if (arr[j-1] < arr[j]) { // '>' 부호를 '<' 부호로 변경합니다.
            var temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
         }
      }
    }
    return arr;
  }

//   bubbleSortDescending(arr);
//   console.log(arr);

  function selectionSort(arr) {
    var len = arr.length;
    for (var i = 0; i < len - 1; i++) {
      var min = i;
      for (var j = i + 1; j < len; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }
      if (min !== i) {
        var temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
      }
    }
    return arr;
  }
//   selectionSort(arr);
//   console.log(arr);
  
  function selectionSortDescending(arr) {
    let len = arr.length;
    for (var i = 0; i < len - 1; i++) {
      var max = i;
      for (var j = i + 1; j < len; j++) {
        if (arr[j] > arr[max]) { // 부등호를 반대로 변경합니다.
          max = j;
        }
      }
      if (max !== i) {
        var temp = arr[i];
        arr[i] = arr[max];
        arr[max] = temp;
      }
    }
    return arr;
  }

  bubbleSort(arr);
  console.log(arr);

  bubbleSortDescending(arr);
  console.log(arr);

  selectionSort(arr);
  console.log(arr);

  selectionSortDescending(arr);
  console.log(arr);
