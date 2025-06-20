This contest is the div-3 type contest which bigner friendly.
Problem-A  (https://codeforces.com/contest/2121/problem/A)
l--> last element in the array 
f--> fist elemnet in the array 
s--> given  position 
In the problem i have created some cases such as 
(i) if the s if creater then the last elemnent (The higest among the all l)
      in this case we can simply go from the s position to the element at index 0(lowest element f)
(ii) if s is less then the greates element in the array then there is two for that which are
     (ii).1 if the s lies between f and l then we pick the side which need less numeber of steps and get back to the current 
     position and then move in the other direction which will give us the minimum steps 
      (ii).2 if the S is less then f then we simply move from s to l(last element)

      
Problem-B (https://codeforces.com/contest/2121/problem/B)
