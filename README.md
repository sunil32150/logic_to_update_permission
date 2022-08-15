# logic_to_update_permission
Suppose you have to update the permission of a role based on any factor. And in this case you don't want to loose existing data of permission but you are not sure about to remove few permission or add few

example: 
existing permission
---------------------
id | logic
1 | read
2 | write
3 | delete
4 | read
5 | edit

now you did some changes and your final data to update is
id | logic
1 | read
2 | write
3 | read
6 | read
7 | edit

by seeing you can say id 1 and 2 remains unchanged but 3 is changed and 4 5 is removed and 6 7 is new.

So the Test.java will fillter this and give you
// toBeDeletedPermission  [4, 5]
// toBeAddedPermission   [6, 7]
