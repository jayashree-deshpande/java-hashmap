HashMap is a Hash table based implementation of the Map interface 
Iteration over collection views requires time proportional to the "capacity" of the HashMap instance
(the number of buckets) plus its size (the number of key-value mappings).
Thus, it's very important not to set the initial capacity too high (or the load factor too low) 
if iteration performance is important. 
