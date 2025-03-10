def Super_Digit(x):
    sum = 0
    if (x<10):
        print("final = ",x)
        return
    sum+=x%10
    x=x//10
    sum+=x
    Super_Digit(sum)


x=16
Super_Digit(x)