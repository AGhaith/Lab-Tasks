# Algorithm Analysis Task 3
# Empirical Analysis

import time
#Function To Measure Elapsed Time Of A Function
def measure_time(function,arr):
    start = time.time()
    function(arr)
    end = time.time()
    print("Elapsed Time = ",(end - start)*1000, "ms")

#Function To Return The Only Element That Is Not Repeated In An Array
def Find_Unique_Element(arr):
    dictionary = {}
    for i in arr:
        if dictionary.get(i) == None:
            dictionary[i] = 1
        else:
            dictionary[i] = dictionary[i] + 1
    for i in dictionary:
        if dictionary[i] == 1:
            print(dictionary)
            print(i)

# Test Array
arr=[10,10,5,10,10,10,10,20,20]
# Measure Speed Of Function
measure_time(Find_Unique_Element,arr)
