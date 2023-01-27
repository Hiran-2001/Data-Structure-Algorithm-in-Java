
const numbers = [43,65,76,32,98,45]
const find = 98

function bubbleSort(arr,key){
   for(let i=0;i<arr.length;i++){
    if (arr[i]===key) {
        console.log("match found");
        break;
    }else{
        console.log("match not found");
    }
    //    console.log(arr[i]);
        // for(let j=1;j<arr.length;j++){
        //     if(arr[j] < arr[j-1]){
        //         let temp = arr[j];
        //         arr[j] = arr[j-1];
        //         arr[j-1]=temp
        //     }
        // }
   }
}

const result = bubbleSort(numbers,find)
console.log(result);