# FizzBuzz(繰り返し処理)

## 目的
FizzBuzzを通して繰り返し処理について理解する

## 解説

```
for(int i=1; i<=100; i++){
    if(i%15 == 0){
        System.out.println("FizzBuzz");
    }else if(i%3 == 0){
        System.out.println("Fizz");
    }else if(i%5 == 0){
        System.out.println("Buzz");
    }else{
        System.out.println(i);
    }
}
```

- iが15で割り切れる場合 (i%15 == 0)：「FizzBuzz」と出力します。
- iが3で割り切れる場合 (i%3 == 0)：「Fizz」と出力します。
- iが5で割り切れる場合 (i%5 == 0)：「Buzz」と出力します。
- 上記の条件に当てはまらない場合：iの値をそのまま出力します。

