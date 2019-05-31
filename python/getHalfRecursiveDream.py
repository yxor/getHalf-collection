"""using recursivity to find the half of an integer, only works for positives"""

# setting the recursive dream depth to an arbitrary number
# the bigger the number the longer it will take to find the half
MAX_DEPTH = 15


def base(n, depth=0):
    half = 0
    while n >= 0:
        n = n-2
        half += 1
    return half - 1

def half(n, depth):
    div_func = half
    if depth <= 0:
        div_func = base
    if n == 1:
        return 0
    if div_func(n, depth-1) == 1:
        return 1
    return half(div_func(n, depth -1), depth-1) + half(div_func(n, depth -1) + 1, depth-1)


# with a depth of 15, it takes the function 75 seconds to find the half of 2
half(4, MAX_DEPTH)

