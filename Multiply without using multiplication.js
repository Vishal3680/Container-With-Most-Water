
console.log(multiply(4,6));
function multiply(a,b){
    let result = a;
    for(let i = 1 ; i < b ; i++){
        result += a;
    }
    return result;
}