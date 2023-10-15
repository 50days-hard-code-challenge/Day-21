def mergeOverlappingIntervals(arr : List[List[int]]) -> List[List[int]]:
    # Write your code here.
    f=0
    a=0
    b=1
    while(f==0):
        
        if(arr[a][1]>=arr[b][0]):
            arr.insert(a,[arr[a][0],max(arr[b][1],arr[a][1])])
            del arr[b]
            del arr[b]
            
        else:
            a=b
            b+=1
        n=len(arr)
        if(a==n-1):
            f=1

    
    return arr
