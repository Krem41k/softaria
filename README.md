# softaria
There are two hashtables in the project. The keys in these tables are URLs, and the values are the html code of the pages located at these URLs. 
The table that stores the state of sites for yesterday is called yesterday. The table that stores the state of the sites for today is called today.

To find deleted pages, a function called deletedPages is used. 
It creates a set of keys from yesterday's hashtable, then the loop compares the keys with today's set of keys, 
if today's set does not contain yesterday's key, then it has been deleted and this key is placed in the list of deleted pages.

To find the created pages, a function called createdPages is used. 
It creates a set of keys from today's hashtable, then the cycle compares the keys with yesterday's set of keys, 
if yesterday's set does not contain today's key, then it was created and this key is placed in the list of created pages.

To find changed pages, a function called changedPages is used. 
It creates a set of keys from today's hashtable, then the cycle compares the keys with yesterday's set of keys, 
if today's key is present in yesterday's set, the value is checked against this key, 
if the value of yesterday's hashtbal is not equal to today's value, then the page has been changed and is added to the list of changed pages.
