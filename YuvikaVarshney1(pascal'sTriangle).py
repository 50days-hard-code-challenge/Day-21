def pascalTriangle(n : int) -> List[List[int]]:
    # Write your code here.
    a=[]
    a.append([1])
    if n==1:
        return a
    a.append([1,1])
    for row in range(2,n):
        b=[]
        for col in range(0,row+1):
            if col==0 or col ==row :
                b.append(1)
            else:
                b.append((a[row-1][col-1]+a[row-1][col]))
        a.append(b)
    return a
