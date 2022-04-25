//let n:any=prompt("Nhập độ dài n của dãy fibo");
var n = 10;
var fibo1, fibo2;
function getFiboElement(number) {
    if (number == 1 || number == 2)
        return 1;
    return getFiboElement(number - 1) + getFiboElement(number - 2);
}
var sum = 0;
for (var i = 1; i <= Number(n); i++) {
    var fib = getFiboElement(i);
    console.log(fib + " ");
    sum += fib;
}
console.log("Tổng các số trong dãy Fibonacci trên: " + sum);
