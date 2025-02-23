# Define Function To Find Length Of The Array
def find_length(arr):
    counter = 0;
# Iterate Through the array Until There Is No Elements Left
    for i in arr:
        counter+=1
    return counter
# Define N = Length Of The Array
N=0;
# Take Input From User
N = int(input("Enter The Length Of The Array: "));
# Define Test Array With Length n
array = [];
for i in range(N):
    array.append(i);
# Call The Function
length = find_length(array);
print(length);