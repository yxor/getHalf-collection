"""using recursivity to find the half of an integer, only works for positives"""

def divideBy2(n):
    half = 0
    while n >= 0:
        n = n-2
        half += 1
    return half - 1

def half(n):
    if n == 1:
        return 0
    if divideBy2(n) == 1:
        return 1
    return half(divideBy2(n)) + half(divideBy2(n) + 1)

def getHalf(n):
    if n == 1:
        return 0
    if half(n)  == 1:
        return 1
    return getHalf(half(n)) + getHalf(half(n) + 1)

getHalf(20)
getHalf(500000)
