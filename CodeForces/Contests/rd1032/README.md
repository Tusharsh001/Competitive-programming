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
In this problem need to be a bit greedy we want the charcter b as small as possible so it will be easy to split it.
so in logic i have first compared the first character and the second character if they are same we can split it the first as a and second as b and rest as c but if this doesn't happen then we can check if any chracter repeat if so we can spilted the string from the first appearence of that charter before the a and after that c in my code i have compared first character seprately to be more precised 
