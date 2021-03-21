# Arrays and Strings

## Hash Tables
* Key to value for heighly effective lookup
* Implemented many ways
  * array of linked lists and hash code
  * balanced binary search tree O(logN) lookup time, uses less space, iterate through keys in order ** 
* Insert
  * **key hash** - compute key hash code ( two keys could have the same hash code infinite keys, finite numbers)
  * **hash mapping** - map hash key to index in max has(key) % array_length
  * at index there is a linked list of keys and values. Need linked list due to collisions
* worst case O(N) - number of keys, generally O(1) -> look up of a index in an array

## ArrayList and Resizable Arrays
