def find_pairs_with_sum(arr,Needed_Sum):
    #Initializations
    
    #Boolean To Output If There Is No Pair
    ThereIsPair = False
    
    #Length Of The Array
    ArrayLength = int(len(arr))
    
    #Solution Array To Store The Pairs
    Solution=[]
    
    #Counter To Move With I
    Counter = 0
    for i in arr: 
        
        # Merged Array To Make Sure That No Comparison Will Be Done Between An Element And Itself
        MergedArray = arr[0:Counter]+arr[Counter+1:ArrayLength]
        
        for j in MergedArray:
            #Checking If The Pair Satisfies The Condition And If It's Not Already In The Solution
            if (i+j == Needed_Sum and ([i,j] not in Solution and [j,i] not in Solution)):
                #Appending The Solution To List
                Solution.append([i,j])
                #Setting The Boolean To True Since A Pair Was Found
                ThereIsPair = True
                #Printing The Pair
                print(i,j)
        Counter += 1
    
    #Base Case If No Pairs Are Found
    if ThereIsPair == False:
        print("No pairs found")
    

#Initialize Test Array
Array = [10,2,6,7,1,0,3,5,4,8,9]

#Initialize The Sum I Want
TheSumIWant = 10

#Function Call
find_pairs_with_sum(Array,TheSumIWant)

