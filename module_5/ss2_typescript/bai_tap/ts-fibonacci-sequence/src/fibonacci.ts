//let n:any=prompt("Nhập độ dài n của dãy fibo");
//let n=prompt("Nhập độ dài n của dãy fibo");
let fibo1,fibo2:number;

function  getFiboElement(number:number):number{
    if(number==1|| number ==2) return 1;
    return getFiboElement(number-1)+getFiboElement(number-2);

}let sum=0;
for(let i=1;i<=Number(n);i++)
{
    let fib=getFiboElement(i);
    console.log(fib+" ");
    sum+=fib;
}
console.log("Tổng các số trong dãy Fibonacci trên: "+sum);
