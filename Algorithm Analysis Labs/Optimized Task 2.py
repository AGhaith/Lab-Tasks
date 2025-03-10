# Optimized Task 2
# Implementing Normal Binary Search Algorithm (Log(N) Complexity)
def Binary_Search(Array,Key):
    # Initializations
    start = 0
    end = len(Array)-1
    # Iterate
    while start <= end:
        # Get The Middle Element
        mid = (start+end)//2
        # If The Middle Element Is The Key
        if Array[mid] == Key:
            return mid
        # If The Key Is Smaller Than The Middle Element
        elif Key < Array[mid]:
            end = mid-1
        # If The Key Is Larger Than The Middle Element
        else:
            start = mid+1
    # If The Key Is Not Found
    return -1
    
def Partition(start,end,Array):
    # Pivot Element
    pivot = Array[end]
    # Index Of The Smallest Element
    i = start-1
    # Iterate
    for j in range(start,end):
        # If The Element Is Smaller Than The Pivot
        if Array[j] < pivot:
            # Increment The Index Of The Smallest Element
            i += 1
            # Swap The Element With The Smallest Element To Make Sure That The Smallest Element Is On The Left
            Array[i],Array[j] = Array[j],Array[i]
    # Swap The Pivot With The Element After The Smallest Element
    Array[i+1],Array[end] = Array[end],Array[i+1]
    # Return The Index Of The Pivot
    return i+1
# Implementing Normal Quick Sort Algorithm (NLog(N) Complexity)
def Quick_Sort(start,end,Array):
    if start < end:
        # Get The Pivot
        pivot = Partition(start,end,Array)
        # Recursively Call The Function
        Quick_Sort(start,pivot-1,Array)
        Quick_Sort(pivot+1,end,Array)
    return Array

# Function To Find The Missing Element To Form The Pair (Constant Complexity)
def Needed_Pair(Value,Target):
    return Target-Value

# Function To Find The Pairs (NLog(N)+Log(N)+NLog(N) = NLog(N) Complexity)
def Find_Pairs(Array,Target_Sum):
    # initializations
    Solution_Pairs = []
    # Sort The Array
    Quick_Sort(0,len(Array)-1,Array)
    # Find The Index Of The Largest Allowed Element in the Array (If the target sum is 10, the largest allowed element is 10)
    index = Binary_Search(Array,Target_Sum)
    if (index == -1):
        index = len(Array)-1
    # Truncate The Array To The Remove All Non-Allowed Element
    TruncatedArray = Array[0:index+1]
    # Iterate Over The Truncated Array
    for i in TruncatedArray:
        Needed_Element_To_Form_Pair = Needed_Pair(i,Target_Sum)
        # Prevent Comparing The Element With Itself
        if (i==Needed_Element_To_Form_Pair):
            continue
        # Check If The Needed Pair Exists In The Truncated Array
        Does_Exist = Binary_Search(TruncatedArray,Needed_Element_To_Form_Pair)
        if (Does_Exist != -1):
            # If It Exists, Check If It Already Has A Pair Or Not Print The Pair and Append It To The Solution Pairs
            if [i,Needed_Element_To_Form_Pair] in Solution_Pairs or [Needed_Element_To_Form_Pair,i] in Solution_Pairs:
                continue
            Solution_Pairs.append([i,Needed_Element_To_Form_Pair])
            print(Solution_Pairs[-1])
            
            
# Main
# Provide An Array With No Duplicates
Array = [10,2,6,7,1,0,3,5,4,8,9]
Target_Sum = 10
Find_Pairs(Array,Target_Sum)

# Complexity Analysis
# The Total Complexity Of The Code Is NLog(N)
# Ahmed Ghaith