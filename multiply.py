r=1
def mul(r):
    try:
        num1=int(input("enter a number: "))
        globals()['r']
        r=r*num1
        print("Result is: ",r)
        mul(r)
    except Exception:
        print("Final result is: ",r)
mul(1)    